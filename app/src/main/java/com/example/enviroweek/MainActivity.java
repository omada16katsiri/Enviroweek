package com.example.enviroweek;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // κουμπάκια!

        Button Monday , Tuesday, Wednesday , Thursday, Friday, Saturday , Sunday;
        Monday = (Button) findViewById(R.id.Monday);
        Monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }
        });

        Tuesday = (Button) findViewById(R.id.Tuesday);
        Tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }
        });

        Wednesday = (Button) findViewById(R.id.Wednesday);
        Wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }
        });

        Thursday = (Button) findViewById(R.id.Thursday);
        Thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }
        });

        Friday = (Button) findViewById(R.id.Friday);
        Friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }
        });

        Saturday = (Button) findViewById(R.id.Saturday);
        Saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();

            }
        });

        Sunday = (Button) findViewById(R.id.Sunday);
        Sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact();
            }

        });



    }

    protected void openact()
    {
        Intent intent = new Intent(this, quests.class);
        startActivity(intent);
    }

}

