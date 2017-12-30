package com.example.android.app_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_tracking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);

       final TextView GenerateId = (TextView)findViewById(R.id.generate_id);
       final TextView Track = (TextView)findViewById(R.id.track);
        final EditText editText=(EditText)findViewById(R.id.edittext);
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Track.getText()== "TRACK" || Track.getText()== "Track")
                GenerateId.setVisibility(View.GONE);
                editText.setVisibility(View.VISIBLE);
                Track.setText("Track Now");
            }

        });
    }
}
