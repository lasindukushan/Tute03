package com.example.activity_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_sceond extends AppCompatActivity {

    EditText ednum1 , ednum2 ;
    String number1;
    String number2;
    int n1,n2;
    TextView lblSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sceond);

        ednum1=findViewById(R.id.editTextNumber);
        ednum2=findViewById(R.id.editTextNumber2);
        lblSum = findViewById(R.id.lblSum);

        Intent intent = getIntent();
        number1=  intent.getStringExtra("n1");
        number2=  intent.getStringExtra("n2");

        ednum1.setText(number1);
        ednum2.setText(number2);

        n1= Integer.parseInt(number1);
        n2= Integer.parseInt(number2);
    }

    public void add(View view){
        lblSum.setText(number1 + "+" + number2+"=" +(n1+n2));
    }
    public void Substract(View view){
        lblSum.setText(number1 + "-" + number2+"=" +(n1-n2));
    }
    public void multiply(View view){
        lblSum.setText(number1 + "x" + number2+"=" +(n1*n2));
    }
    public void divide(View view){
        lblSum.setText(number1 + "/" + number2+"=" +(n1/n2));
    }
}