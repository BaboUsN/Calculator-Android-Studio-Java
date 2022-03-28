package com.babousn.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_add,btn_div,btn_equel,btn_multi,btn_percent,btn_bracket,btn_clear,btn_point,btn_sub;
    TextView upperShower,downerShower;
    String process,opp;
    float prevValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_add = findViewById(R.id.btn_add);
//        btn_bracket = findViewById(R.id.btn_bracket);
        btn_clear = findViewById(R.id.btn_clear);
        btn_div = findViewById(R.id.btn_div);
        btn_equel = findViewById(R.id.btn_equel);
        btn_multi = findViewById(R.id.btn_multi);
//        btn_percent = findViewById(R.id.btn_percent);
//        btn_point = findViewById(R.id.btn_point);
        btn_sub = findViewById(R.id.btn_sub);

        upperShower = findViewById(R.id.upperShower);
        downerShower = findViewById(R.id.downerShower);

//      --------------  Listeners
        btn_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                upperShower.setText("");
                downerShower.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = upperShower.getText().toString();
                upperShower.setText(process+"0");
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevValue = Float.parseFloat(upperShower.getText().toString());

                upperShower.setText(process+"X");
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevValue = Float.parseFloat(upperShower.getText().toString());
                upperShower.setText(process+"/");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevValue = Float.parseFloat(upperShower.getText().toString());
                upperShower.setText(process+"+");
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevValue = Float.parseFloat(upperShower.getText().toString());
                upperShower.setText(process+"-");
            }
        });

    }
}