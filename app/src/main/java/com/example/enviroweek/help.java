package com.example.enviroweek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class help extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        this.setTitle("Βοήθεια");
        showhelp();
    }
    public void showhelp()
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                String keimeno;
                keimeno="Καλωσήρθατε στο Enviroweek!\n" +
                        "Στο αρχικό μενού βλέπετε τις ημέρες της εβδομάδας.Η τρέχουσα ημέρα έχει μωβ χρώμα ενώ οι υπόλοιπες λαχανί." +
                        "Επιλέγοντάς την, μπορέιτε να δείτε τις διαθέσιμες δραστηριότητες για εκείνη την ημέρα.Σκοπός της εφαρμογής είναι να σας βοηθήσει να τις φέρετε " +
                        "σε πέρας ανταμείβοντάς σας στο τέλος της ημέρας αν τις έχετε συμπληρώσει όλες.";
                // Εκτελούμε την εργασία μας εδώ
                TextView text = (TextView) findViewById(R.id.helptextview);
                text.setTextSize(25);
                text.setText(keimeno);
            }
        });
        thread.start();
    }

}