package com.example.enviroweek;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    Button Monday , Tuesday, Wednesday , Thursday, Friday, Saturday , Sunday;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_match();
        button_functions_on_date();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.info_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
        return super.onContextItemSelected(item);

    }

    private void button_match()
    {
        Sunday = (Button) findViewById(R.id.Sunday);
        Monday = (Button) findViewById(R.id.Monday);
        Tuesday = (Button) findViewById(R.id.Tuesday);
        Wednesday = (Button) findViewById(R.id.Wednesday);
        Thursday = (Button) findViewById(R.id.Thursday);
        Friday = (Button) findViewById(R.id.Friday);
        Saturday = (Button) findViewById(R.id.Saturday);
    }

    private void button_functions_on_date()
    {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day)
        {
            case Calendar.SUNDAY:

                Sunday.setBackgroundColor(0xFF6200EE);
                Sunday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Κυριακή");
                        //openacttest();

                    }
                });
                break;

            case Calendar.MONDAY:

                Monday.setBackgroundColor(0xFF6200EE);
                Monday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Δευτέρα");
                    }
                });
                break;

            case Calendar.TUESDAY:

                Tuesday.setBackgroundColor(0xFF6200EE);
                Tuesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Τρίτη");
                    }
                });
                break;

            case Calendar.WEDNESDAY:

                Wednesday.setBackgroundColor(0xFF6200EE);
                Wednesday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Τετάρτη");
                    }
                });
                break;

            case Calendar.THURSDAY:

                Thursday.setBackgroundColor(0xFF6200EE);
                Thursday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Πέμπτη");
                    }
                });
                break;

            case Calendar.FRIDAY:

                Friday.setBackgroundColor(0xFF6200EE);
                Friday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Παρασκευή");
                    }
                });
                break;

            case Calendar.SATURDAY:

                Saturday.setBackgroundColor(0xFF6200EE);
                Saturday.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openact("Σάββατο");
                    }
                });
                break;
        }
    }
    private void openact(String titles)
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

