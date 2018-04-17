package com.example.a16022667.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");

        TextView tv1 = (TextView)findViewById(R.id.textView7);
        TextView tv2 = (TextView)findViewById(R.id.textView8);
        TextView tv3 = (TextView)findViewById(R.id.textView9);
        TextView tv4 = (TextView)findViewById(R.id.textView11);

        tv1.setText("Read up on materials before class: " +  info[1]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " +  info[2]);
        tv3.setText("Attempt the problem myself: " +  info[3]);
        tv4.setText("My personal refelction today: " +  info[0]);

    }
}
