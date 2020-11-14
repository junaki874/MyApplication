package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultSix extends AppCompatActivity {
    TextView stu1,stu2,st3,st4,stu5,st6,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_six);

        stu1=(TextView)findViewById(R.id.stu601);
        stu2=(TextView)findViewById(R.id.stu602);
        st3=(TextView)findViewById(R.id.st603);
        st4=(TextView)findViewById(R.id.stu604);
        stu5=(TextView)findViewById(R.id.stu605);
        st6=(TextView)findViewById(R.id.stu606);

        result=(TextView)findViewById(R.id.result6);

        stu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.45");
            }
        });
        stu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.89");
            }
        });

        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.30");
            }
        });
        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.39");
            }
        });

        stu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.26");
            }
        });
    }
}
