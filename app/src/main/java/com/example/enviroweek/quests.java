package com.example.enviroweek;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Objects;

public class quests extends AppCompatActivity {

    public Calendar calendar = Calendar.getInstance();
    public int day = calendar.get(Calendar.DAY_OF_WEEK) - 1;
    public CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    public ProgressBar progress;
    public int c = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        Intent intent1 = getIntent();
        // μετονομασία τίτλου
        String new_title = intent1.getStringExtra("title");
        setTitle(new_title);
        //test1();
        assign();
        CheckBoxinitialstate();
        CheckBoxini();


        AlarmManager alarmManager = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, broadcastreciever.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE // Add FLAG_IMMUTABLE flag
        );


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {

            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        }

        if (alarmManager != null) {

            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                    AlarmManager.INTERVAL_DAY * 7, pendingIntent);
        }
    }

    public void assign() {
        progress = (ProgressBar) findViewById(R.id.progressBar);
        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        cb5 = (CheckBox) findViewById(R.id.checkBox5);
        cb6 = (CheckBox) findViewById(R.id.checkBox6);
    }

    public void augment_check() {
        c++;
        if (c == 6) {
            Intent intent = new Intent(this, Reward.class);
            startActivity(intent);
        }
    }

    public void CheckBoxinitialstate() {
        try {

            FileInputStream fis = openFileInput("dedomena.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            for (int i = 0; i <= day; i++)
            {
                String[] temp = reader.readLine().split(" ");
                for (int j = 0; j < 6; j++)
                {
                    switch (j)
                    {
                        case 0:
                            if (Objects.equals(temp[j], "1"))
                            {
                                System.out.println("Mpika!!!!");
                                cb1.setChecked(true);
                                cb1.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }

                        case 1:
                            if (Objects.equals(temp[j], "1")) {
                                cb2.setChecked(true);
                                cb2.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }
                        case 2:
                            if (Objects.equals(temp[j], "1")) {
                                cb3.setChecked(true);
                                cb3.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }
                        case 3:
                            if (Objects.equals(temp[j], "1")) {
                                cb4.setChecked(true);
                                cb4.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }
                        case 4:
                            if (Objects.equals(temp[j], "1")) {
                                cb5.setChecked(true);
                                cb5.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }
                        case 5:
                            if (Objects.equals(temp[j], "1")) {
                                cb6.setChecked(true);
                                cb6.setClickable(false);
                                int currentprogress = progress.getProgress();
                                progress.setProgress(currentprogress + 17);
                                augment_check();
                            }
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void CheckBoxini() {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                if (!cb1.isChecked()) {
                    cb1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            cb1.setClickable(false);
                            replace( day, 0, "1");
                            augment_check();
                        }
                    });
                }


                if (!cb2.isChecked()) {
                    cb2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            cb2.setClickable(false);
                            replace( day, 1, "1");
                            augment_check();
                        }
                    });
                }


                if (!cb3.isChecked()) {
                    cb3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            cb3.setClickable(false);
                            replace( day, 2, "1");
                            augment_check();
                        }
                    });
                }


                if (!cb4.isChecked()) {
                    cb4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cb4.setClickable(false);
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            replace( day, 3, "1");
                            augment_check();
                        }
                    });
                }

                if (!cb5.isChecked()) {
                    cb5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cb5.setClickable(false);
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            replace( day, 4, "1");
                            augment_check();
                        }
                    });
                }


                if (!cb6.isChecked()) {
                    cb6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cb6.setClickable(false);
                            int currentprogress = progress.getProgress();
                            progress.setProgress(currentprogress + 17);
                            replace( day, 5, "1");
                            augment_check();
                        }
                    });

                }
            }
        });
        thread.start();

    }


    public  void replace( int row, int column, String value)
    {
        String[][] pin = new String[7][6];
        try {
            FileInputStream fis = openFileInput("dedomena.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            for (int i = 0; i < 7; i++)
            {
                String[] temp = reader.readLine().split(" ");
                for (int j = 0; j < 6; j++) {
                    pin[i][j] = temp[j];
                }
            }
            pin[row][column] = value;

            FileOutputStream fos = openFileOutput("dedomena.txt", MODE_PRIVATE);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 6; j++) {
                    writer.write(pin[i][j]);
                    if (j != 5) {
                        writer.write(" ");
                    }
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void test1() {

        try
        {
            FileOutputStream fos = openFileOutput("dedomena.txt", MODE_PRIVATE);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 6; j++) {
                    writer.write("0");
                    // System.out.print();
                    if (j != 5) {
                        writer.write(" ");
                        // System.out.print();
                    }
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            FileInputStream fis = openFileInput("dedomena.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            for (int i = 0; i < 7; i++) {
                String[] temp = reader.readLine().split(" ");
                for (int j = 0; j < 6; j++) {
                    System.out.print("Mera " + i);
                    System.out.print("Task " + j);
                    System.out.println("Timi " + temp[j]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}