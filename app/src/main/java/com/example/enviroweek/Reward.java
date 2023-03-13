package com.example.enviroweek;
import java.lang.Math;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Reward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        // δημιουργία αντικειμένου τύπου TipDatabase
        TipDatabase a = new TipDatabase();
        // random επιλογή του tip που θα εμφανιστεί
        int max = a.tips.size();
        int min = 1;
        int range = max - min + 1;
        int rand=0;
        for (int i = 0; i < max; i++)
        {
            rand = (int)(Math.random() * range) + min;
        }
        rand=rand-1;

        TextView message;

        message=(TextView) findViewById(R.id.editTextTextMultiLine);

        message.setText(a.tips.get(rand));


    }
}