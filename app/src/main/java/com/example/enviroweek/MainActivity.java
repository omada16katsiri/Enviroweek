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
                openact("Δευτέρα");
            }
        });

        Tuesday = (Button) findViewById(R.id.Tuesday);
        Tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Τρίτη");
            }
        });

        Wednesday = (Button) findViewById(R.id.Wednesday);
        Wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Τετάρτη");
            }
        });

        Thursday = (Button) findViewById(R.id.Thursday);
        Thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Πέμπτη");
            }
        });

        Friday = (Button) findViewById(R.id.Friday);
        Friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Παρασκευή");
            }
        });

        Saturday = (Button) findViewById(R.id.Saturday);
        Saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Σάββατο");

            }
        });

        Sunday = (Button) findViewById(R.id.Sunday);
        Sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openact("Κυριακή");
                //openacttest();
            }

        });

    }

    protected void openact(String titles)
    {
        Intent intent = new Intent(this, quests.class);
        intent.putExtra("title",titles);
        startActivity(intent);
    }

    protected void openacttest()
    {
        Intent intent = new Intent(this, Reward.class);
        startActivity(intent);
    }
}

