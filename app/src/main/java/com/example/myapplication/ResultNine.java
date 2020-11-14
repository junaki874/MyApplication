package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultNine extends AppCompatActivity {
    private TextView st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_nine);

        st1=(TextView)findViewById(R.id.stu915);
        st2=(TextView)findViewById(R.id.stu916);
        st3=(TextView)findViewById(R.id.stu917);
        st4=(TextView)findViewById(R.id.stu918);
        st5=(TextView)findViewById(R.id.stu919);
        st6=(TextView)findViewById(R.id.stu920);
        st7=(TextView)findViewById(R.id.stu921);
        st8=(TextView)findViewById(R.id.stu922);
        st9=(TextView)findViewById(R.id.stu923);
        st10=(TextView)findViewById(R.id.stu924);
        st11=(TextView)findViewById(R.id.stu925);

        res=(TextView)findViewById(R.id.result9);

        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.86");
            }
        });

        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.89");
            }
        });

        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.70");
            }
        });

        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.69");
            }
        });

        st5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.43");
            }
        });

        st6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.31");
            }
        });

        st7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.29");
            }
        });

        st8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 3.71");
            }
        });

        st9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.00");
            }
        });

        st10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 4.19");
            }
        });


        st11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Your GPA is 3.89");
            }
        });

    }
}
