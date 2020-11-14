package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentList extends AppCompatActivity {

    Button bckBtn, nxtBtn;

    public EditText name;
    public Button queryBtn;
    public TextView resultQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

      bckBtn=(Button) findViewById(R.id.sixBackId);
      nxtBtn=(Button) findViewById(R.id.sixNextId);

      name=(EditText)findViewById(R.id.qryEditId);
      queryBtn=(Button)findViewById(R.id.qryBtnId);
      resultQuery=(TextView)findViewById(R.id.query);


      bckBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(StudentList.this, Home.class);
              startActivity(intent);

          }
      });

    }
}
