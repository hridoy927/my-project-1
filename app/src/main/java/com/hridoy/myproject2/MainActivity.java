package com.hridoy.myproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button buttonAdd,buttonIncrease,buttonReset;
    int value=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonIncrease =findViewById(R.id.buttonIncrease);
        buttonReset = findViewById(R.id.buttonReset);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                tvDisplay.setText(""+value);
            }
        });



        buttonIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value--;
                tvDisplay.setText(""+value);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 0;
                tvDisplay.setText(""+value);
            }
        });


    }
}