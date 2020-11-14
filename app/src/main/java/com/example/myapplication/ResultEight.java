package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultEight extends AppCompatActivity {
    private TextView st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_eight);

        st1=(TextView)findViewById(R.id.stu815);
        st2=(TextView)findViewById(R.id.stu816);

        st3=(TextView)findViewById(R.id.stu817);

        st4=(TextView)findViewById(R.id.stu818);

        st5=(TextView)findViewById(R.id.stu819);

        st6=(TextView)findViewById(R.id.stu820);
        st7=(TextView)findViewById(R.id.stu821);
        st8=(TextView)findViewById(R.id.stu822);
        st9=(TextView)findViewById(R.id.stu823);

        st10=(TextView)findViewById(R.id.stu824);
        st11=(TextView)findViewById(R.id.stu825);

        res=(TextView)findViewById(R.id.result8);






        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.89");
            }
        });

        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.45");
            }
        });

        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.78");
            }
        });

        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.64");
            }
        });

        st5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.80");
            }
        });

        st6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.00");
            }
        });

        st7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 3.19");
            }
        });

        st8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.59");
            }
        });

        st9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.79");
            }
        });

        st10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 3.89");
            }
        });

        st11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 2.50");
            }
        });

    }
}
