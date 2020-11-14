package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticePic extends AppCompatActivity {
    private Button ntcbn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_pic);

        ntcbn=(Button)findViewById(R.id.tcBackId);
        ntcbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NoticePic.this,Home.class);
                startActivity(intent);
            }
        });

    }
}
