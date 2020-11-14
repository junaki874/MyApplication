package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultSeven extends AppCompatActivity {
    private TextView st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15,result1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_seven);
        st1=(TextView)findViewById(R.id.stu701);
        st2=(TextView)findViewById(R.id.stu702);
        st3=(TextView)findViewById(R.id.stu703);
        st4=(TextView)findViewById(R.id.stu704);
        st5=(TextView)findViewById(R.id.stu705);
        st6=(TextView)findViewById(R.id.stu706);
        st7=(TextView)findViewById(R.id.stu707);
        st8=(TextView)findViewById(R.id.stu708);
        st9=(TextView)findViewById(R.id.stu709);
        st10=(TextView)findViewById(R.id.stu710);
        st11=(TextView)findViewById(R.id.stu711);
        st12=(TextView)findViewById(R.id.stu712);
        st13=(TextView)findViewById(R.id.stu713);
        st14=(TextView)findViewById(R.id.stu714);
        st15=(TextView)findViewById(R.id.stu715);
        result1=(TextView)findViewById(R.id.result7);

        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.95");
            }
        });
        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.75");
            }
        });
        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.91");
            }
        });
        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.90");
            }
        });
        st5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.49");
            }
        });
        st6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.05");
            }
        });
        st7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.15");
            }
        });
        st8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.46");
            }
        });
        st9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.74");
            }
        });
        st10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.24");
            }
        });
        st11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.61");
            }
        });
        st12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.33");
            }
        });
        st13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.60");
            }
        });
        st14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.41");
            }
        });
        st15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("Your GPA is 4.35");
            }
        });

    }
}
