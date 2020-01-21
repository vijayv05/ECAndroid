package com.appdynamics.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button addButton = (Button) findViewById(R.id.addButton);
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText firstNum = (EditText) findViewById(R.id.firstNumTextField);
//                EditText secondNum = (EditText) findViewById(R.id.secondNumTextField);
//                TextView result = (TextView) findViewById(R.id.result);
//
//
//                int num1 = Integer.parseInt(firstNum.getText().toString());
//                int num2 = Integer.parseInt(secondNum.getText().toString());
//
//                int resultNum = num1+num2;
//
//                result.setText(resultNum + "");
//            }
//        });

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.addButton);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
//                startActivity(intent);
                setContentView(R.layout.activity_secondary);

            }

        });


    }





}
