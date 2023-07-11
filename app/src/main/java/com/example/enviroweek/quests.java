package com.example.enviroweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class quests extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        Intent intent = getIntent();
        // μετονομασία τίτλου
        String new_title = intent.getStringExtra("title");
        setTitle(new_title);


        arxikopoisi_pinaka();

        CheckBoxini();



    }

    public void arxikopoisi_pinaka()
    {
        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        timer.schedule(new TimerTask() {
            public void run()
            {

                try {
                    FileWriter writer = new FileWriter("save.txt");
                    for (int i = 0; i < 7; i++)
                    {
                        for (int j = 0; j < 6; j++) {
                            writer.write( '0');
                        }
                        writer.write("\n");
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, date.getTime(), 7 * 24 * 60 * 60 * 1000);

    }

    public static void replaceElement(int row, int col) {
        try {
            File file = new File("save.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder builder = new StringBuilder();
            int currentRow = 0;
            while ((line = reader.readLine()) != null) {
                if (currentRow == row) {
                    char[] chars = line.toCharArray();
                    chars[col] = '1';
                    line = new String(chars);
                }
                builder.append(line).append("\n");
                currentRow++;
            }
            reader.close();
            FileWriter writer = new FileWriter(file);
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CheckBoxini()
    {

        Thread thread=new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                ProgressBar progress;
                progress= (ProgressBar) findViewById(R.id.progressBar);
                final CheckBox cb1, cb2 , cb3 , cb4 ,cb5 , cb6;
                // checkbox 1
                cb1= (CheckBox) findViewById(R.id.checkBox);
                cb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        cb1.setClickable(false);
                        replaceElement(day-1 , 0);


                    }
                });

                // checkbox 2
                cb2= (CheckBox) findViewById(R.id.checkBox2);
                cb2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        cb2.setClickable(false);
                        replaceElement(day-1 , 1);

                    }
                });

                // checkbox 3
                cb3= (CheckBox) findViewById(R.id.checkBox3);
                cb3.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        cb3.setClickable(false);
                        replaceElement(day-1 , 2);

                    }
                });

                // checkbox 4
                cb4= (CheckBox) findViewById(R.id.checkBox4);
                cb4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cb4.setClickable(false);
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        replaceElement(day-1 , 3);

                    }
                });

                // checkbox 5
                cb5= (CheckBox) findViewById(R.id.checkBox5);
                cb5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cb5.setClickable(false);
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        replaceElement(day-1 , 4);

                    }
                });

                // checkbox 6
                cb6= (CheckBox) findViewById(R.id.checkBox6);
                cb6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cb6.setClickable(false);
                        int currentprogress=progress.getProgress();
                        progress.setProgress(currentprogress+ 17);
                        replaceElement(day-1 , 5);

                    }
                });


            }
        });
        thread.start();

    }

}