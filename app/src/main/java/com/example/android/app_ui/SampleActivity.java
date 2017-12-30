package com.example.android.app_ui;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SampleActivity extends AppCompatActivity {


    RelativeLayout llOne,llTwo,llThree,llFour, llFive;
    ConnectionDetector cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        cd= new ConnectionDetector(getApplicationContext());


        llOne = (RelativeLayout)findViewById(R.id.llOne);
        llTwo = (RelativeLayout)findViewById(R.id.llTwo);
        llThree = (RelativeLayout)findViewById(R.id.llThree);
        llFour = (RelativeLayout)findViewById(R.id.llFour);
        llFive = (RelativeLayout)findViewById(R.id.llFive);



        llOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!cd.isConnectingToInternet())
                    Snackbar.make(findViewById(android.R.id.content), "Internet connection required", Snackbar.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        llTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cd.isConnectingToInternet())
                    Snackbar.make(findViewById(android.R.id.content), "Internet connection required", Snackbar.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        llThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cd.isConnectingToInternet())
                    Snackbar.make(findViewById(android.R.id.content), "Internet connection required", Snackbar.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        llFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cd.isConnectingToInternet())
                    Snackbar.make(findViewById(android.R.id.content), "Internet connection required", Snackbar.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        llFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cd.isConnectingToInternet())
                    Snackbar.make(findViewById(android.R.id.content), "Internet connection required", Snackbar.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}
