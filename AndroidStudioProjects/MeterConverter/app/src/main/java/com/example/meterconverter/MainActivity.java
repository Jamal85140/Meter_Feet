package com.example.meterconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findViewById(R.id.editTextNumber2);

       Button calculateButton =  findViewById(R.id.button_calaculate);

       EditText resultText2 = findViewById(R.id.editTextNumber2);
       EditText resultText1 = findViewById(R.id.editTextNumber);

       calculateButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

              
           }

       });
    }
 }
