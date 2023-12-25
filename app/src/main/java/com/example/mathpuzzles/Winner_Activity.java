package com.example.mathpuzzles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Winner_Activity extends AppCompatActivity {

    TextView winLevel,countinue,mainmenu,buypro;
    int index,level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        winLevel=findViewById(R.id.winlevel);
        countinue=findViewById(R.id.countinue);
        mainmenu=findViewById(R.id.mainmenu);
        buypro=findViewById(R.id.buypro);
         index=getIntent().getIntExtra("index",0);
         level=index;
        winLevel.setText("PUZZLE "+level+" COMPLETED");
       countinue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(Winner_Activity.this, Continue_Activity.class);
               startActivity(i);
               finish();
           }
       });

    }
}