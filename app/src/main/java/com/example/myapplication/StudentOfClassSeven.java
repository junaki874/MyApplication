package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentOfClassSeven extends AppCompatActivity {
      Button sevenBack, sevenExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_of_class_seven);

        sevenBack=(Button) findViewById(R.id.sevenBackId);
        sevenExit=(Button)findViewById(R.id.sevenExitId);

        sevenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentOfClassSeven.this, Home.class);
                startActivity(intent);
            }
        });


    }
}
