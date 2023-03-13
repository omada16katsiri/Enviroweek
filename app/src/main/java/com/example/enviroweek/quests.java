package com.example.enviroweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;

public class quests extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        Intent intent = getIntent();
        // μετονομασία τίτλου
        String new_title = intent.getStringExtra("title");
        setTitle(new_title);

        //το final απαγορεύει την αλλαγή της τιμής των CheckBoxes
        ProgressBar progress;
        progress= (ProgressBar) findViewById(R.id.progressBar);
        progress.setMax(120); // megisti timi
        progress.setProgress(20);


        final CheckBox cb1, cb2 , cb3 , cb4 ,cb5 , cb6;



        // checkbox 1
        cb1= (CheckBox) findViewById(R.id.checkBox);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb1.setClickable(false);
            }
        });

        // checkbox 2
        cb2= (CheckBox) findViewById(R.id.checkBox2);
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb2.setClickable(false);
            }
        });

        // checkbox 3
        cb3= (CheckBox) findViewById(R.id.checkBox3);
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb3.setClickable(false);
            }
        });

        // checkbox 4
        cb4= (CheckBox) findViewById(R.id.checkBox4);
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb4.setClickable(false);
            }
        });

        // checkbox 5
        cb5= (CheckBox) findViewById(R.id.checkBox5);
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb5.setClickable(false);
            }
        });

        // checkbox 6
        cb6= (CheckBox) findViewById(R.id.checkBox6);
        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb6.setClickable(false);
            }
        });



    }

}