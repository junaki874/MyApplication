package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class StuOfTen extends AppCompatActivity {

  private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_of_ten);

  this.listView=(ListView)findViewById(R.id.listId);
 // DatabaseAccess databaseAccess= DatabaseAccess.getInstance(this);
 // databaseAccess.open();
  //List<String>quotes=databaseAccess.getQuotes();
  //databaseAccess.close();

     //   ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.sample_layout,quotes);
       // this.listView.setAdapter(adapter);
    }
}
