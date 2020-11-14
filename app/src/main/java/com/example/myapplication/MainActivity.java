package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userText, passText;
    Button logBtn, creatBtn;
    AdminDatabase db;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       db= new AdminDatabase(this);

        userText=(EditText)findViewById(R.id.userId);
        passText=(EditText)findViewById(R.id.passwordId);

        logBtn=(Button) findViewById(R.id.logId);

        creatBtn=(Button) findViewById(R.id.createId);
        creatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,AdminRegistration.class);
                startActivity(intent);
            }
        });


          logBtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String user= userText.getText().toString().trim();
                  String pwd=passText.getText().toString().trim();
                  boolean res=db.checkUser(user,pwd);
                  try{
                      if(res==true){
                          Intent ad=new Intent(MainActivity.this,   Home.class);
                          startActivity(ad);
                      }
                      else{

                         // txt.setText("wrong password");

                          Toast.makeText(MainActivity.this,"wrong username or password",Toast.LENGTH_SHORT).show();
                      }
                  }catch (Exception e){
                      txt.setText((CharSequence) e);
                      Toast.makeText(MainActivity.this, (CharSequence) e,Toast.LENGTH_SHORT).show();
                  }

              }
          });

    }
}
