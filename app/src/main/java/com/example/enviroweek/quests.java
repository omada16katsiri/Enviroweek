package com.example.enviroweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

        // δηλώσεις widgets

        ProgressBar progress;
        progress= (ProgressBar) findViewById(R.id.progressBar);
        //το final απαγορευει την αλλαγή της τιμής των CheckBoxes

        final CheckBox cb1, cb2 , cb3 , cb4 ,cb5 , cb6;
        cb1= (CheckBox) findViewById(R.id.checkBox);
        cb2= (CheckBox) findViewById(R.id.checkBox2);
        cb3= (CheckBox) findViewById(R.id.checkBox3);
        cb4= (CheckBox) findViewById(R.id.checkBox4);
        cb5= (CheckBox) findViewById(R.id.checkBox5);
        cb6= (CheckBox) findViewById(R.id.checkBox6);

        if(cb1.isChecked())
        {
            cb1.setChecked(true);
        }

        if(cb2.isChecked())
        {
            cb2.setChecked(true);
        }

        if(cb3.isChecked())
        {
            cb3.setChecked(true);
        }

        if(cb4.isChecked())
        {
            cb4.setChecked(true);
        }
        if(cb5.isChecked())
        {
            cb5.setChecked(true);
        }

        if(cb6.isChecked())
        {
            cb6.setChecked(true);
        }
        progress.setProgress(100);


    }
}