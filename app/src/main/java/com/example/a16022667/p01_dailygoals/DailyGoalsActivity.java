package com.example.a16022667.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DailyGoalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_goals);

        Button btn = (Button) findViewById(R.id.buttonOk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);

                int selectedButtonId1 = rg1.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);

                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);

                int selectedButtonId2 = rg1.getCheckedRadioButtonId();

                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);

                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                EditText etReflect = (EditText)findViewById(R.id.editTextReflect);

                String[] info = {etReflect.getText().toString(),rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString()};

                Intent i = new Intent(DailyGoalsActivity.this,summary.class);

                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
