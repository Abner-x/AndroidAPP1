package com.example.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outA,outB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outA = findViewById(R.id.textView5);
        outB = findViewById(R.id.textView7);

        //7个按键
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);

        //A队加三分
        setButton(btn1,outA,3);

        //A队加两分
        setButton(btn2,outA,2);

        //A队罚球
        setButton(btn3,outA,1);

        //B队加三分
        setButton(btn4, outB, 3);

        //B队加两分
        setButton(btn5, outB, 2);

        //B队罚球
        setButton(btn6, outB, 1);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outA.setText("0");
                outB.setText("0");

            }
        });
    }


    public void setButton(Button button, final TextView textView, final Integer integer) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer score = Integer.parseInt(textView.getText().toString()) + integer;
                textView.setText(score.toString());
            }
        });
    }
}