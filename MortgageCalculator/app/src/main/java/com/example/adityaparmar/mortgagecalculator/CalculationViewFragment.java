package com.example.adityaparmar.mortgagecalculator;

import android.app.Fragment;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import static com.example.adityaparmar.mortgagecalculator.R.id.zip;

/**
 * Created by adityaparmar on 3/20/17.
 */

public class CalculationViewFragment extends Fragment {

    View view;
    Button bcalculate, bclear, bsave;
    int pp, dp, rate, period, payment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.calculationviewfragmentlayout,container,false);



        final EditText property_price = (EditText)view.findViewById(R.id.propertyprice);
        final EditText down_payment = (EditText)view.findViewById(R.id.downpayment);
        final EditText annual_rate = (EditText)view.findViewById(R.id.rate);
        final EditText term = (EditText)view.findViewById(R.id.period);
        bcalculate = (Button)view.findViewById(R.id.bcalculate);
        bclear = (Button)view.findViewById(R.id.bclear);
        bsave = (Button) view.findViewById(R.id.bsave);

        //bsave.setEnabled(false);

        final EditText street = (EditText) view.findViewById(R.id.street);
        final EditText city = (EditText) view.findViewById(R.id.city);
        final Spinner state = (Spinner) view.findViewById(R.id.state);
        final EditText zipcode = (EditText) view.findViewById(zip);
        final Spinner propertytype = (Spinner)view.findViewById(R.id.spinnerpropertytype);

        String[] list1 = new String[]{"Alaska", "Alabama",
                "Arkansas",
                "American Samoa",
                "Arizona",
                "California",
                "Colorado",
                "Connecticut",
                "District of Columbia",
                "Delaware",
                "Florida",
                "Georgia",
                "Guam",
                "Hawaii",
                "Iowa",
                "Idaho",
                "Illinois",
                "Indiana",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Massachusetts",
                "Maryland",
                "Maine",
                "Michigan",
                "Minnesota",
                "Missouri",
                "Mississippi",
                "Montana",
                "North Carolina",
                "North Dakota",
                "Nebraska",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "Nevada",
                "New York",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Puerto Rico",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Virginia",
                "Virgin Islands",
                "Vermont",
                "Washington",
                "Wisconsin",
                "West Virginia",
                "Wyoming"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, list1);
        state.setAdapter(adapter1);

        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bsave.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {
                bsave.setEnabled(true);
            }
        };

        //e_street.addTextChangedListener(tw);
        zipcode.addTextChangedListener(tw);





        Spinner dropdown = (Spinner) view.findViewById(R.id.spinnerpropertytype);
        String[] list = new String[]{"House", "TownHouse", "Condo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, list);
        dropdown.setAdapter(adapter);
        final TextView m_payment = (TextView) view.findViewById(R.id.text_monthly_payment);


        bcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String PropertyPrice = property_price.getText().toString().trim();
                String downPayment = down_payment.getText().toString().trim();
                String annualrate = annual_rate.getText().toString().trim();
                String speriod = term.getText().toString().trim();

                if(PropertyPrice.equals(""))
                {
                    Toast.makeText(getActivity(),"Please enter valid Property price ",Toast.LENGTH_LONG).show();
                }
                else if(downPayment.equals("")){

                    Toast.makeText(getActivity(),"Please enter valid Downpayment ",Toast.LENGTH_LONG).show();
                }
                else if(annualrate.equals("")){

                    Toast.makeText(getActivity(),"Please enter valid Annual Rate ",Toast.LENGTH_LONG).show();
                }
                else if(speriod.equals("")){

                    Toast.makeText(getActivity(),"Please enter valid Terms ",Toast.LENGTH_LONG).show();
                }
                else
                {


                    pp = Integer.parseInt(PropertyPrice);
                    dp = Integer.parseInt(downPayment);
                    rate = Integer.parseInt(annualrate);
                    period = Integer.parseInt(speriod);


                    payment = calculate_mortgage(pp, dp, rate, period);
                    m_payment.setText("Monthly payment: $"+String.valueOf(payment));

                }

            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                property_price.setText("");
                down_payment.setText("");
                annual_rate.setText("");
                term.setText("");
                m_payment.setText("");
                street.setText("");
                city.setText("");
                zipcode.setText("");
            }
        });

        Context mContext = getActivity().getBaseContext();
        final DatabaseOperations handler = new DatabaseOperations(mContext, TableData.TableInfo.DATABASE_NAME, null, 1);


        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                final String Street = street.getText().toString();
                final String City = city.getText().toString();
                final String State = state.getSelectedItem().toString();
                final String Zip = zipcode.getText().toString();
                final String Propertytype = propertytype.getSelectedItem().toString();
                final String PropertyPrice = property_price.getText().toString();
                final String Downpayment = down_payment.getText().toString();
                final String APR = annual_rate.getText().toString();
                final String Terms = term.getText().toString();

                /*int PP = Integer.parseInt(PropertyPrice);
                int DP = Integer.parseInt(Downpayment);
                int Rate = Integer.parseInt(APR);
                int Period = Integer.parseInt(Terms);*/



                final String MonthlyInstallment = "354545";//String.valueOf(calculate_mortgage(PP, DP, Rate, Period));

                if(Street.equals(""))
                {
                    Toast.makeText(getActivity(),"Please enter Street ",Toast.LENGTH_LONG).show();
                }
                else if(City.equals("")){

                    Toast.makeText(getActivity(),"Please enter City ",Toast.LENGTH_LONG).show();
                }
                else if(Zip.equals("")){

                    Toast.makeText(getActivity(),"Please enter Zipcode ",Toast.LENGTH_LONG).show();
                }

                else {

                    List<Address> addressList = null;
                    try {
                        addressList = validate_address(Street, City, State, Zip);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (!addressList.isEmpty()) {

                            handler.getWritableDatabase();
                            long k = handler.insertInfo(handler, Street, City, State,Zip,Propertytype,PropertyPrice,Downpayment,APR,Terms,MonthlyInstallment);
                            if(k > 0)
                            {
                                Toast.makeText(getActivity(),"Calculation is successfully saved.",Toast.LENGTH_LONG).show();
                            }
                                handler.close();
                                Log.d("Save", String.valueOf(k));
                            }
                            else
                            {
                                Toast.makeText(getActivity(),"Please enter Valid Address ",Toast.LENGTH_LONG).show();
                            }
                }
            }

        });
        return view;
    }

    public int calculate_mortgage(int pp, int dp, int rate, int period){
        int principal = pp - dp;
        int r = (rate/12)/100;
        int n = period*12;
        int monthly_payment;
        monthly_payment = principal*(((r*(1+r)^n))/((1+r)^n -1));
        return monthly_payment;
    }

    public List<Address> validate_address(String street, String city, String state, String zip) throws Exception{

        String locationName= street+","+city+","+state+","+zip;




        Geocoder geocoder = new Geocoder(getActivity());
        List<Address> addressList = null;



        if(locationName != null || locationName != " "){
            try {

                addressList = geocoder.getFromLocationName (locationName, 1);

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return addressList;

    }

}