package com.example.calculatorapp;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    private EditText calculation, result;
    private String curr, res;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnAC, btnDivision, btnMultiplication, btnSubtraction, btnAddition, btnEqual, btnPoint;
    private boolean dot_inserted, operator_inserted;

    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = (EditText) findViewById(R.id.calculation);
        result = (EditText) findViewById(R.id.result);
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnDel = (Button) findViewById(R.id.btnDel);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "0";
                displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                curr = curr + "9";
                displayOne();
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //check if its empty and if it is yes then append "0." and set dot_inserted variable to true
            if(curr.isEmpty()){
                curr = curr + "0.";
                dot_inserted = true;
            }

            //check if dot_inserted is false then append "."
            if(dot_inserted == false){
                curr = curr + ".";
                dot_inserted = true;
            }

            displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                displayOne();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set dot_inserted = false
                dot_inserted = false;
                //check if curr is not empty
                if(!curr.isEmpty()){
                    //check if the last digit is dot then remove it
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }
                    //check if operator_inserted = false then append operator to curr
                    if(operator_inserted == false)
                    {
                        curr = curr + " / ";
                        operator_inserted = true;
                    }
                }

                displayOne();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set dot_inserted = false
                dot_inserted = false;
                //check if curr is not empty
                if(!curr.isEmpty()){
                    //check if the last digit is dot then remove it
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }
                    //check if operator_inserted = false then append operator to curr
                    if(operator_inserted == false)
                    {
                        curr = curr + " * ";
                        operator_inserted = true;
                    }
                }

                displayOne();
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set dot_inserted = false
                dot_inserted = false;
                //check if curr is not empty
                if(!curr.isEmpty()){
                    //check if the last digit is dot then remove it
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }
                    //check if operator_inserted = false then append operator to curr
                    if(operator_inserted == false)
                    {
                        curr = curr + " + ";
                        operator_inserted = true;
                    }
                }

                displayOne();
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set dot_inserted = false
                dot_inserted = false;
                //check if curr is not empty
                if(!curr.isEmpty()){
                    //check if the last digit is dot then remove it
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }
                    //check if operator_inserted = false then append operator to curr
                    if(operator_inserted == false)
                    {
                        curr = curr + " - ";
                        operator_inserted = true;
                    }
                }

                displayOne();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if the last character is not an operator
                if(operator_inserted == true && !curr.substring(curr.length()-1, curr.length()).equals(" ")){
                    String [] tokens = curr.split(" ");

                    switch (tokens[1].charAt(0)){
                        case'+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;

                        case'-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;

                        case'*':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;

                        case'/':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }

                    displayTwo();
                }


            }
        });
    }

    public void displayOne(){
        calculation.setText(curr);
    }

    public void displayTwo(){
        result.setText(res);
    }

    public void clear(){
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void backspace(){
        //check if curr is not empty then remove last character
        if(!curr.isEmpty())
        {
            //check if the last character in the curr is dot then set dot_inserted = false;
            if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                dot_inserted = false;
            }

            //check is the operator is detected then delete 3 digits or characters from the curr and set operator_inserted = false
            if(curr.substring(curr.length()-1, curr.length()).equals(" ")){
            curr = curr.substring(0, curr.length()-3);
            operator_inserted = false;
            }
            else {
                curr = curr.substring(0, curr.length() - 1);
            }
        }
    }
}


