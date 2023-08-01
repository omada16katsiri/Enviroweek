package com.example.enviroweek;
import java.lang.Math;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Reward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        // δημιουργία αντικειμένου τύπου TipDatabase
        TipDatabase a = new TipDatabase();
        int rand;
        int rand2;
        String reward;
        // random επιλογή του tip που θα εμφανιστεί
        rand=randomgenerator(a);
        TextView message;
        message=(TextView) findViewById(R.id.editTextTextMultiLine);
        message.setText(a.tips.get(rand-1));

        ImageView imageView = findViewById(R.id.imageView);
        rand2=randomgenerator(7);
        System.out.println("rand= " + rand2);
        switch (rand2)
        {
            case 1:
                imageView.setImageResource(R.drawable.reward1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.reward2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.reward3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.reward4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.reward5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.reward6);
                break;
            case 7:
                imageView.setImageResource(R.drawable.reward7);
                break;
        }

    }
    public int randomgenerator(TipDatabase a)
    {
        int max = a.tips.size();
        int min = 1;
        int range = max - min + 1;
        int rand=0;
        for (int i = 0; i < max; i++)
        {
            rand = (int)(Math.random() * range) + min;
        }

        return rand;
    }
    public int randomgenerator(int size)
    {
        int max = size;
        int min = 1;
        int range = max - min + 1;
        int rand=0;
        for (int i = 0; i < max; i++)
        {
            rand = (int)(Math.random() * range) + min;
        }


        return rand;
    }

}