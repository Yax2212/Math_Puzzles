package com.example.mathpuzzles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Puzzles_Activity extends AppCompatActivity {
GridView gridView;
int[] Level={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14, R.drawable.p15,R.drawable.p16,R.drawable.p17,R.drawable.p18,R.drawable.p19,R.drawable.p20,R.drawable.p21,R.drawable.p22,R.drawable.p23,R.drawable.p24, R.drawable.p25,R.drawable.p26,R.drawable.p27,R.drawable.p28,R.drawable.p29,R.drawable.p30,R.drawable.p31,R.drawable.p32,R.drawable.p33,R.drawable.p34,R.drawable.p35,R.drawable.p36,R.drawable.p37,R.drawable.p38,R.drawable.p39,R.drawable.p40,R.drawable.p41, R.drawable.p42, R.drawable.p43, R.drawable.p44, R.drawable.p45, R.drawable.p46, R.drawable.p47, R.drawable.p48, R.drawable.p49, R.drawable.p50, R.drawable.p51, R.drawable.p52, R.drawable.p53, R.drawable.p54, R.drawable.p55, R.drawable.p56, R.drawable.p57, R.drawable.p58, R.drawable.p59, R.drawable.p60, R.drawable.p61, R.drawable.p62, R.drawable.p63, R.drawable.p64, R.drawable.p65, R.drawable.p66, R.drawable.p67, R.drawable.p68, R.drawable.p69, R.drawable.p70, R.drawable.p71, R.drawable.p72, R.drawable.p73,R.drawable.p74,R.drawable.p75};
int[] Share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);
        gridView=findViewById(R.id.gridLevel);

        GridAdapter adapter=new GridAdapter(Puzzles_Activity.this);
        gridView.setAdapter(adapter);



    }
}