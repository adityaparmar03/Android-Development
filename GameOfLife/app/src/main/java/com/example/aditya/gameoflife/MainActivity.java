package com.example.aditya.gameoflife;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

 public class MainActivity extends AppCompatActivity {

    Button next,reset;
    int[][] cc = new int[12][12];
    int[][] status = new int[12][12];






     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        cc[0][0]=R.id.imageButton00;
        cc[0][1]=R.id.imageButton01;
        cc[0][2]=R.id.imageButton02;
        cc[0][3]=R.id.imageButton03;
        cc[0][4]=R.id.imageButton04;
        cc[0][5]=R.id.imageButton05;
        cc[0][6]=R.id.imageButton06;
        cc[0][7]=R.id.imageButton07;
        cc[0][8]=R.id.imageButton08;
        cc[0][9]=R.id.imageButton09;
        cc[0][10]=R.id.imageButton0010;
        cc[0][11]=R.id.imageButton0011;

        cc[1][0]=R.id.imageButton10;
        cc[1][1]=R.id.imageButton11;
        cc[1][2]=R.id.imageButton12;
        cc[1][3]=R.id.imageButton13;
        cc[1][4]=R.id.imageButton14;
        cc[1][5]=R.id.imageButton15;
        cc[1][6]=R.id.imageButton16;
        cc[1][7]=R.id.imageButton17;
        cc[1][8]=R.id.imageButton18;
        cc[1][9]=R.id.imageButton19;
        cc[1][10]=R.id.imageButton0110;
        cc[1][11]=R.id.imageButton0111;

        cc[2][0]=R.id.imageButton20;
        cc[2][1]=R.id.imageButton21;
        cc[2][2]=R.id.imageButton22;
        cc[2][3]=R.id.imageButton23;
        cc[2][4]=R.id.imageButton24;
        cc[2][5]=R.id.imageButton25;
        cc[2][6]=R.id.imageButton26;
        cc[2][7]=R.id.imageButton27;
        cc[2][8]=R.id.imageButton28;
        cc[2][9]=R.id.imageButton29;
        cc[2][10]=R.id.imageButton0210;
        cc[2][11]=R.id.imageButton0211;

        cc[3][0]=R.id.imageButton30;
        cc[3][1]=R.id.imageButton31;
        cc[3][2]=R.id.imageButton32;
        cc[3][3]=R.id.imageButton33;
        cc[3][4]=R.id.imageButton34;
        cc[3][5]=R.id.imageButton35;
        cc[3][6]=R.id.imageButton36;
        cc[3][7]=R.id.imageButton37;
        cc[3][8]=R.id.imageButton38;
        cc[3][9]=R.id.imageButton39;
        cc[3][10]=R.id.imageButton0310;
        cc[3][11]=R.id.imageButton0311;

        cc[4][0]=R.id.imageButton40;
        cc[4][1]=R.id.imageButton41;
        cc[4][2]=R.id.imageButton42;
        cc[4][3]=R.id.imageButton43;
        cc[4][4]=R.id.imageButton44;
        cc[4][5]=R.id.imageButton45;
        cc[4][6]=R.id.imageButton46;
        cc[4][7]=R.id.imageButton47;
        cc[4][8]=R.id.imageButton48;
        cc[4][9]=R.id.imageButton49;
        cc[4][10]=R.id.imageButton0410;
        cc[4][11]=R.id.imageButton0411;

        cc[5][0]=R.id.imageButton50;
        cc[5][1]=R.id.imageButton51;
        cc[5][2]=R.id.imageButton52;
        cc[5][3]=R.id.imageButton53;
        cc[5][4]=R.id.imageButton54;
        cc[5][5]=R.id.imageButton55;
        cc[5][6]=R.id.imageButton56;
        cc[5][7]=R.id.imageButton57;
        cc[5][8]=R.id.imageButton58;
        cc[5][9]=R.id.imageButton59;
        cc[5][10]=R.id.imageButton0510;
        cc[5][11]=R.id.imageButton0511;

        cc[6][0]=R.id.imageButton60;
        cc[6][1]=R.id.imageButton61;
        cc[6][2]=R.id.imageButton62;
        cc[6][3]=R.id.imageButton63;
        cc[6][4]=R.id.imageButton64;
        cc[6][5]=R.id.imageButton65;
        cc[6][6]=R.id.imageButton66;
        cc[6][7]=R.id.imageButton67;
        cc[6][8]=R.id.imageButton68;
        cc[6][9]=R.id.imageButton69;
        cc[6][10]=R.id.imageButton0610;
        cc[6][11]=R.id.imageButton0611;

        cc[7][0]=R.id.imageButton70;
        cc[7][1]=R.id.imageButton71;
        cc[7][2]=R.id.imageButton72;
        cc[7][3]=R.id.imageButton73;
        cc[7][4]=R.id.imageButton74;
        cc[7][5]=R.id.imageButton75;
        cc[7][6]=R.id.imageButton76;
        cc[7][7]=R.id.imageButton77;
        cc[7][8]=R.id.imageButton78;
        cc[7][9]=R.id.imageButton79;
        cc[7][10]=R.id.imageButton0710;
        cc[7][11]=R.id.imageButton0711;

        cc[8][0]=R.id.imageButton80;
        cc[8][1]=R.id.imageButton81;
        cc[8][2]=R.id.imageButton82;
        cc[8][3]=R.id.imageButton83;
        cc[8][4]=R.id.imageButton84;
        cc[8][5]=R.id.imageButton85;
        cc[8][6]=R.id.imageButton86;
        cc[8][7]=R.id.imageButton87;
        cc[8][8]=R.id.imageButton88;
        cc[8][9]=R.id.imageButton89;
        cc[8][10]=R.id.imageButton0810;
        cc[8][11]=R.id.imageButton0811;

        cc[9][0]=R.id.imageButton90;
        cc[9][1]=R.id.imageButton91;
        cc[9][2]=R.id.imageButton92;
        cc[9][3]=R.id.imageButton93;
        cc[9][4]=R.id.imageButton94;
        cc[9][5]=R.id.imageButton95;
        cc[9][6]=R.id.imageButton96;
        cc[9][7]=R.id.imageButton97;
        cc[9][8]=R.id.imageButton98;
        cc[9][9]=R.id.imageButton99;
        cc[9][10]=R.id.imageButton0910;
        cc[9][11]=R.id.imageButton0911;

        cc[10][0]=R.id.imageButton100;
        cc[10][1]=R.id.imageButton101;
        cc[10][2]=R.id.imageButton102;
        cc[10][3]=R.id.imageButton103;
        cc[10][4]=R.id.imageButton104;
        cc[10][5]=R.id.imageButton105;
        cc[10][6]=R.id.imageButton106;
        cc[10][7]=R.id.imageButton107;
        cc[10][8]=R.id.imageButton108;
        cc[10][9]=R.id.imageButton109;
        cc[10][10]=R.id.imageButton1010;
        cc[10][11]=R.id.imageButton1011;

        cc[11][0]=R.id.imageButton110;
        cc[11][1]=R.id.imageButton111;
        cc[11][2]=R.id.imageButton112;
        cc[11][3]=R.id.imageButton113;
        cc[11][4]=R.id.imageButton114;
        cc[11][5]=R.id.imageButton115;
        cc[11][6]=R.id.imageButton116;
        cc[11][7]=R.id.imageButton117;
        cc[11][8]=R.id.imageButton118;
        cc[11][9]=R.id.imageButton119;
        cc[11][10]=R.id.imageButton1110;
        cc[11][11]=R.id.imageButton1111;

        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                ((ImageButton)findViewById(cc[i][j])).setTag(R.drawable.dead);
            }
        }



    }



     @Override
     protected void onPause() {
         super.onPause();
     }

     @Override
     protected void onResume() {
         super.onResume();
     }

     public void flipimage(View view)
    {
        ImageButton btn = (ImageButton)findViewById(view.getId());

        if((Integer)btn.getTag()== R.drawable.dead) {
            btn.setImageResource(R.drawable.live);
            btn.setTag(R.drawable.live);

        }
        else{
            btn.setImageResource(R.drawable.dead);
            btn.setTag(R.drawable.dead);

        }



    }

     public void Next_Generation(View view)
     {

         int count_live_neighbour = 0;

         for(int x=0;x<12;x++)
         {
             for(int y=0;y<12;y++){
                 ImageButton check_button = (ImageButton) findViewById(cc[x][y]);
                 if ((Integer) check_button.getTag() == R.drawable.dead) {

                        status[x][y] = 0;

                 } else {

                        status[x][y] = 1;
                 }
             }
         }

         for(int i=0;i<12;i++)
         {
             for(int j=0;j<12;j++)
             {
                 ImageButton Select_button = (ImageButton)findViewById(cc[i][j]);
                 if((Integer)Select_button.getTag()== R.drawable.dead){

                     if(i>0 && j>0&& i<11 && j<11)
                     {
                         count_live_neighbour = CheckLive(i - 1, j - 1) + CheckLive(i - 1, j) + CheckLive(i - 1, j + 1) + CheckLive(i, j - 1) + CheckLive(i, j + 1) + CheckLive(i + 1, j - 1) + CheckLive(i + 1, j) + CheckLive(i + 1, j + 1);



                     }
                     else
                     {
                         if(i==0 && j>0 && j<11 )
                         {
                             count_live_neighbour = CheckLive(i,j-1)+CheckLive(i,j+1)+CheckLive(i+1,j-1)+CheckLive(i+1,j)+CheckLive(i+1,j+1);
                         }
                         else if(i==11 && j>0 && j<11)
                         {
                             count_live_neighbour = CheckLive(i,j-1)+ CheckLive(i,j+1)+CheckLive(i-1,j-1)+CheckLive(i-1,j)+CheckLive(i-1,j+1);

                         }
                         else if(j==0 && i>0 && i<11 )
                         {
                             count_live_neighbour = CheckLive(i-1,j)+CheckLive(i+1,j)+CheckLive(i-1,j+1)+CheckLive(i,j+1)+CheckLive(i+1,j+1);
                         }
                         else if(j==11 && i>0 && i<11 )
                         {
                             count_live_neighbour = CheckLive(i-1,j)+CheckLive(i+1,j)+CheckLive(i-1,j-1)+CheckLive(i,j-1)+CheckLive(i+1,j-1);
                         }
                         else
                         {
                             if(i==0 && j==0) {
                                 count_live_neighbour=CheckLive(i,j+1)+CheckLive(i+1,j+1)+CheckLive(i+1,j);
                             }
                             else if(i==0 && j==11){
                                 count_live_neighbour=CheckLive(i,j-1)+CheckLive(i+1,j-1)+CheckLive(i+1,j);
                             }
                             else if(i==11 && j==0){
                                 count_live_neighbour=CheckLive(i-1,j)+CheckLive(i-1,j+1)+CheckLive(i,j+1);
                             }else if(i==11 && j==11){
                                 count_live_neighbour=CheckLive(i-1,j)+CheckLive(i-1,j-1)+CheckLive(i,j-1);
                             }
                             else
                             { }


                         }

                     }

                     if(count_live_neighbour == 3)
                     {
                         Select_button.setImageResource(R.drawable.live);
                         Select_button.setTag(R.drawable.live);
                     }


                 }
                 else {
                     if(i>0 && j>0&& i<11 && j<11)
                     {
                         count_live_neighbour = CheckLive(i - 1, j - 1) + CheckLive(i - 1, j) + CheckLive(i - 1, j + 1) + CheckLive(i, j - 1) + CheckLive(i, j + 1) + CheckLive(i + 1, j - 1) + CheckLive(i + 1, j) + CheckLive(i + 1, j + 1);



                     }
                     else
                     {
                         if(i==0 && j>0 && j<11 )
                         {
                             count_live_neighbour = CheckLive(i,j-1)+CheckLive(i,j+1)+CheckLive(i+1,j-1)+CheckLive(i+1,j)+CheckLive(i+1,j+1);
                         }
                         else if(i==11 && j>0 && j<11)
                         {
                             count_live_neighbour = CheckLive(i,j-1)+ CheckLive(i,j+1)+CheckLive(i-1,j-1)+CheckLive(i-1,j)+CheckLive(i-1,j+1);

                         }
                         else if(j==0 && i>0 && i<11 )
                         {
                             count_live_neighbour = CheckLive(i-1,j)+CheckLive(i+1,j)+CheckLive(i-1,j+1)+CheckLive(i,j+1)+CheckLive(i+1,j+1);
                         }
                         else if(j==11 && i>0 && i<11 )
                         {
                             count_live_neighbour = CheckLive(i-1,j)+CheckLive(i+1,j)+CheckLive(i-1,j-1)+CheckLive(i,j-1)+CheckLive(i+1,j-1);
                         }
                         else
                         {
                             if(i==0 && j==0) {
                                 count_live_neighbour=CheckLive(i,j+1)+CheckLive(i+1,j+1)+CheckLive(i+1,j);
                             }
                             else if(i==0 && j==11){
                                 count_live_neighbour=CheckLive(i,j-1)+CheckLive(i+1,j-1)+CheckLive(i+1,j);
                             }
                             else if(i==11 && j==0){
                                 count_live_neighbour=CheckLive(i-1,j)+CheckLive(i-1,j+1)+CheckLive(i,j+1);
                             }else if(i==11 && j==11){
                                 count_live_neighbour=CheckLive(i-1,j)+CheckLive(i-1,j-1)+CheckLive(i,j-1);
                             }
                             else
                             { }


                         }

                     }


                     if (count_live_neighbour < 2) {
                         Select_button.setImageResource(R.drawable.dead);
                         Select_button.setTag(R.drawable.dead);
                     } else if (count_live_neighbour == 2 || count_live_neighbour == 3) {
                         Select_button.setImageResource(R.drawable.live);
                         Select_button.setTag(R.drawable.live);
                     } else {
                         Select_button.setImageResource(R.drawable.dead);
                         Select_button.setTag(R.drawable.dead);
                     }

                 }
             }
         }



     }

     public int CheckLive(int i, int j) {

                return status[i][j];
        }

     public void Reset(View view)
     {
         AlertDialog.Builder alertDialog = new  AlertDialog.Builder(this);
         alertDialog.setMessage("Are you sure you want to reset ?");
         alertDialog.setCancelable(false);
         alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 for(int i=0;i<12;i++){
                     for(int j=0;j<12;j++){
                         ((ImageButton)findViewById(cc[i][j])).setTag(R.drawable.dead);
                         ((ImageButton)findViewById(cc[i][j])).setImageResource(R.drawable.dead);

                     }
                 }
             }
         });

         alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {

             }
         });

         alertDialog.create().show();


     }
}

