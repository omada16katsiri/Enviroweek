package com.example.enviroweek;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // κουμπάκια!
        Button Monday , Tuesday, Wednesday , Thursday, Friday, Saturday , Sunday;


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day+1)
        {
            case Calendar.SUNDAY:

                Sunday = (Button) findViewById(R.id.Sunday);
                Sunday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Κυριακή");
                        //openacttest();
                    }

                });

                break;
            case Calendar.MONDAY:
                Monday = (Button) findViewById(R.id.Monday);
                Monday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Δευτέρα");
                    }
                });
                break;
            case Calendar.TUESDAY:
                Tuesday = (Button) findViewById(R.id.Tuesday);
                Tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Τρίτη");
                    }
                });
                break;
            case Calendar.WEDNESDAY:
                Wednesday = (Button) findViewById(R.id.Wednesday);
                Wednesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Τετάρτη");
                    }
                });
                break;
            case Calendar.THURSDAY:
                Thursday = (Button) findViewById(R.id.Thursday);
                Thursday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Πέμπτη");
                    }
                });
                break;
            case Calendar.FRIDAY:
                Friday = (Button) findViewById(R.id.Friday);
                Friday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Παρασκευή");
                    }
                });
                break;
            case Calendar.SATURDAY:
                Saturday = (Button) findViewById(R.id.Saturday);
                Saturday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Σάββατο");

                    }
                });
                break;


        }
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

