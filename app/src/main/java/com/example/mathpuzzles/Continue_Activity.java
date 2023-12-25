package com.example.mathpuzzles;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Continue_Activity extends AppCompatActivity {

    TextView txtAnswer, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, levelNumber;
    ImageView delete, puzzles;
    Button submit;
    String ans = "";
    int index = 1, image = 0;
    String[] answer = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75"};
    int[] Level = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25, R.drawable.p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30, R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35, R.drawable.p36, R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42, R.drawable.p43, R.drawable.p44, R.drawable.p45, R.drawable.p46, R.drawable.p47, R.drawable.p48, R.drawable.p49, R.drawable.p50, R.drawable.p51, R.drawable.p52, R.drawable.p53, R.drawable.p54, R.drawable.p55, R.drawable.p56, R.drawable.p57, R.drawable.p58, R.drawable.p59, R.drawable.p60, R.drawable.p61, R.drawable.p62, R.drawable.p63, R.drawable.p64, R.drawable.p65, R.drawable.p66, R.drawable.p67, R.drawable.p68, R.drawable.p69, R.drawable.p70, R.drawable.p71, R.drawable.p72, R.drawable.p73, R.drawable.p74, R.drawable.p75};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue);
        levelNumber = findViewById(R.id.levelNumber);
        puzzles = findViewById(R.id.puzzles);
        txtAnswer = findViewById(R.id.txtAnswer);
        delete = findViewById(R.id.btnDelete);
        submit = findViewById(R.id.btnSubmit);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b0 = findViewById(R.id.btn0);



        int s2 = MainPage_Activity.sharedPreferences.getInt("Leavel", 0);

        Log.d("ASASAA", "onCreate: continue  = "+s2);

        index = s2;
        int board = index + 1;

        puzzles.setImageResource(Level[index]);
        levelNumber.setText("Puzzle " + board);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "1";
                txtAnswer.setText(ans);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "2";
                txtAnswer.setText(ans);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "3";
                txtAnswer.setText(ans);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "4";
                txtAnswer.setText(ans);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "5";
                txtAnswer.setText(ans);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "6";
                txtAnswer.setText(ans);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "7";
                txtAnswer.setText(ans);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "8";
                txtAnswer.setText(ans);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "9";
                txtAnswer.setText(ans);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans += "0";
                txtAnswer.setText(ans);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.length() > 0) {
                    ans = (ans.substring(0, ans.length() - 1));
                    txtAnswer.setText(ans);
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input = Integer.parseInt(ans);
                int tans = Integer.parseInt(answer[index]);
                if (input == tans) {
                    index++;

                    MainPage_Activity.myedit.putInt("Leavel", index);
                    MainPage_Activity.myedit.commit();

                    ans = "";
                    txtAnswer.setText(ans);

                    Intent i = new Intent(Continue_Activity.this, Winner_Activity.class);
                    i.putExtra("index", index);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(Continue_Activity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}