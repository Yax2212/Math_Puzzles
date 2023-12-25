package com.example.mathpuzzles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage_Activity extends AppCompatActivity {
TextView Continue,Puzzle,Pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Continue=findViewById(R.id.cnt);
        Puzzle=findViewById(R.id.pzl);
        Pro=findViewById(R.id.pro);

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainPage_Activity.this, Continue_Activity.class);
                startActivity(i);
            }
        });
        Puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i=new Intent(MainPage_Activity.this,Puzzles_Activity.class);
                startActivity(i);
            }
        });
        Pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}