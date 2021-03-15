package com.solution.datafromoneactivitytosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView integershow,textshow;
private String txt_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        integershow=findViewById(R.id.incrementvalueshow);
        textshow=findViewById(R.id.stringshow);
        Intent intent=getIntent();
        String str=intent.getStringExtra("Your Name is");
//        Integer integer=intent.getIntExtra("number is",0);
        txt_number = intent.getStringExtra("number");
        integershow.setText(txt_number);
        textshow.setText(str);

    }
}