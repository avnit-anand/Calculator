package com.aka.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FirstNumber,SecondNumber;
    TextView Result;
    Button Add, Subtract, Division, Multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        FirstNumber = findViewById(R.id.etFirstNumber);
        SecondNumber = findViewById(R.id.etSecondNumber);

        Result = findViewById(R.id.tvResult);

        Add = findViewById(R.id.btnAdd);
        Subtract = findViewById(R.id.btnSubtract);
        Division = findViewById(R.id.btnDivision);
        Multiply = findViewById(R.id.btnMultiply);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber, secondNumber, result;

                firstNumber = Double.parseDouble(FirstNumber.getText().toString());
                secondNumber = Double.parseDouble(SecondNumber.getText().toString());
                result =firstNumber + secondNumber;
                Result.setText("Ans is : "+result);
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber, secondNumber, result;

                firstNumber = Double.parseDouble(FirstNumber.getText().toString());
                secondNumber = Double.parseDouble(SecondNumber.getText().toString());

                result = firstNumber - secondNumber;

                Result.setText("Ans is : "+result);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber, secondNumber, result;

                firstNumber = Double.parseDouble(FirstNumber.getText().toString());
                secondNumber = Double.parseDouble(SecondNumber.getText().toString());

                result = firstNumber * secondNumber;

                Result.setText("Ans is : "+result);
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber, secondNumber, result;

                firstNumber = Double.parseDouble(FirstNumber.getText().toString());
                secondNumber = Double.parseDouble(SecondNumber.getText().toString());

                result = firstNumber / secondNumber;

                Result.setText("Ans is : "+result);
            }
        });
    }
}