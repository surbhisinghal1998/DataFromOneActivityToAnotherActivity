package com.solution.datafromoneactivitytosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edt;
TextView txt;
Button text,integer;
int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt=findViewById(R.id.enteryourname);
        txt=findViewById(R.id.increment);
        text=findViewById(R.id.buttonstring);
        integer=findViewById(R.id.button);

    }

    public void performonbutton(View view) {
switch (view.getId()){
    case R.id.button:
        value++;
       // txt.setText(String.valueOf(value));
        txt.setText(""+value);
        break;
    case R.id.buttonstring:
        String sentence=edt.getText().toString();
        String number = txt.getText().toString();
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("Your Name is",sentence);
        intent.putExtra("number",number);
        startActivity(intent);
        break;


}

    }
}