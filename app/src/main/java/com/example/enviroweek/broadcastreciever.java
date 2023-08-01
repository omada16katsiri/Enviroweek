package com.example.enviroweek;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class broadcastreciever extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        /*
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


         */
    }
}