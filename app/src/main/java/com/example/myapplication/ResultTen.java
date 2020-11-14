package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultTen extends AppCompatActivity {
   private  TextView st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11;
  private  TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_ten);

        st1=(TextView)findViewById(R.id.stu115);
        st2=(TextView)findViewById(R.id.stu116);
        st3=(TextView)findViewById(R.id.stu117);
        st4=(TextView)findViewById(R.id.stu118);
        st5=(TextView)findViewById(R.id.stu119);
        st6=(TextView)findViewById(R.id.stu120);
        st7=(TextView)findViewById(R.id.stu121);
        st8=(TextView)findViewById(R.id.stu122);
        st9=(TextView)findViewById(R.id.stu123);
        st10=(TextView)findViewById(R.id.stu124);
        st11=(TextView)findViewById(R.id.stu125);


        result=(TextView)findViewById(R.id.result10);

        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.91");
            }
        });
        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.81");
            }
        });
        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.68");
            }
        });
        st4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.80");
            }
        });
        st5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.70");
            }
        });
        st6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.31");
            }
        });
        st7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.56");
            }
        });
        st8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.41");
            }
        });
        st9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.81");
            }
        });
        st10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.34");
            }
        });


        st11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Your GPA is 4.21");
            }
        });

    }
}
