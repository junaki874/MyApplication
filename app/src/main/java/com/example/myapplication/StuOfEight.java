package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StuOfEight extends AppCompatActivity {
    DatabaseHelper mydb;
    EditText edt1,edt2,edt3,edt4,edt5,edt;
    Button add,view,delete,update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_of_eight);
        mydb = new DatabaseHelper(this);

        edt = (EditText) findViewById(R.id.ed);
        edt1 = (EditText) findViewById(R.id.ed1);
        edt2 = (EditText) findViewById(R.id.ed2);
        edt3 = (EditText) findViewById(R.id.ed3);
        edt4 = (EditText) findViewById(R.id.ed4);
        edt5 = (EditText) findViewById(R.id.ed5);

        add = (Button) findViewById(R.id.addId);
        view = (Button) findViewById(R.id.viewId);
        delete = (Button) findViewById(R.id.deleteId);
        update = (Button) findViewById(R.id.updateId);




        AddData();
        DeleteData();
        viewAll();
        UpdateData();
    }
    public void DeleteData(){
        delete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deleteRow=mydb.deleteData(edt.getText().toString());
                        if(deleteRow>0)
                            Toast.makeText(StuOfEight.this,"Data is Deleted",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(StuOfEight.this,"Data is not Deleted",Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }

     public void UpdateData(){
        update.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdated=mydb.updateData(edt.getText().toString(),
                                edt1.getText().toString(),edt2.getText().toString(),edt3.getText().toString(),
                                edt4.getText().toString(),edt5.getText().toString());
                        if(isUpdated==true)
                            Toast.makeText(StuOfEight.this,"Data is updated",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(StuOfEight.this,"Data is not updated",Toast.LENGTH_SHORT).show();


                    }
                }
        );
     }

        public void AddData(){
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  boolean isInserted=  mydb.insertData(edt1.getText().toString(),
                            edt2.getText().toString(),
                            edt3.getText().toString(),
                            edt4.getText().toString(),
                            edt5.getText().toString());
                  if(isInserted==true)
                      Toast.makeText(StuOfEight.this,"Data is inserted",Toast.LENGTH_SHORT).show();
                  else
                      Toast.makeText(StuOfEight.this,"Data is not inserted",Toast.LENGTH_SHORT).show();

                }
            });
        }

  public void viewAll(){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = mydb.getAllData();
                if (res.getCount() == 0) {
                    showMessage("Error","Nothing to show");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){

                    buffer.append("Id : "+ res.getString(0)+"\n");
                    buffer.append("Name : "+ res.getString(1)+"\n");
                    buffer.append("Addres : "+ res.getString(2)+"\n");
                    buffer.append("Blood_grp : "+ res.getString(3)+"\n");
                    buffer.append("Dob : "+ res.getString(4)+"\n");
                    buffer.append("Phone_num : "+ res.getString(5)+"\n");
                }
                showMessage("Information",buffer.toString());
            }

        });
  }


public void showMessage(String title, String message){
    AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setCancelable(true);
    builder.setTitle(title);
    builder.setMessage(message);
     builder.show();
}


}
