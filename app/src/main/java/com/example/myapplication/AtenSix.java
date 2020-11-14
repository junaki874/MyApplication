package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AtenSix extends AppCompatActivity {
    AttendanceDatabase atenDb;

   private EditText tx1,tx2,tx3,tx4,tx5,tx;
   private Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aten_six);

        atenDb=new AttendanceDatabase(this);

        tx1=(EditText) findViewById(R.id.aten1);
        tx2=(EditText) findViewById(R.id.aten2);
        tx3=(EditText) findViewById(R.id.aten3);
        tx4=(EditText) findViewById(R.id.aten4);
        tx5=(EditText) findViewById(R.id.aten5);
        tx=(EditText) findViewById(R.id.aten);

        btn=(Button) findViewById(R.id.addAtenId);
        btn1=(Button) findViewById(R.id.viewAtenId);
        btn2=(Button) findViewById(R.id.updateAtenId);
        btn3=(Button) findViewById(R.id.deleteAtenId);

  AddData();
  viewAll();
  UpData();

    }

 public void AddData(){
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             boolean isInsert=atenDb.dataInsert(tx1.getText().toString(),
                     tx2.getText().toString(),
                     tx3.getText().toString(),
                     tx4.getText().toString(),
                     tx5.getText().toString());
             if(isInsert==true)
                 Toast.makeText(AtenSix.this,"Data is inserted ",Toast.LENGTH_SHORT).show();
             else
                 Toast.makeText(AtenSix.this,"Data is not inserted ",Toast.LENGTH_SHORT).show();
         }
     });
 }
public void viewAll(){
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Cursor res =atenDb.getAlData();
            if (res.getCount() == 0) {
                showMessage("Error","Nothing to show");
                return;
            }

            StringBuffer buffer = new StringBuffer();
            while(res.moveToNext()){

                buffer.append("Id : "+ res.getString(0)+"\n");
                buffer.append("Name : "+ res.getString(1)+"\n");
                buffer.append("Class : "+ res.getString(2)+"\n");
                buffer.append("Total_Days : "+ res.getString(3)+"\n");
                buffer.append("Present_Days : "+ res.getString(4)+"\n");
                buffer.append("Absent_Days : "+ res.getString(5)+"\n");
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
 public void UpData(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    boolean isUpdated=atenDb.updateData(tx.getText().toString(),
                            tx1.getText().toString(),tx2.getText().toString(),tx3.getText().toString(),
                            tx4.getText().toString(),tx5.getText().toString());
                    if(isUpdated==true)
                        Toast.makeText(AtenSix.this,"Data is updated",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(AtenSix.this,"Data is not updated",Toast.LENGTH_SHORT).show();


                }
        });
 }

}
