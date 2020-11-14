package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    Spinner spinner,noticeSpiner,clsRoutineSpnr, resultSpiner;
    Spinner attendanceSpnr, examSpinr;
    String[] cls,ntic,exam;
    Button hombtn;

    TextView  gallery;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        spinner=(Spinner) findViewById(R.id.spinnerId);
        noticeSpiner=(Spinner)findViewById(R.id.noticeId);

        cls=getResources().getStringArray(R.array.classes);
        exam=getResources().getStringArray(R.array.routine);
        ntic=getResources().getStringArray(R.array.noticeItem);

        clsRoutineSpnr=(Spinner) findViewById(R.id.classRtneId);

        resultSpiner=(Spinner)findViewById(R.id.resultId);
        attendanceSpnr=(Spinner) findViewById(R.id.attendanceId);
        examSpinr=(Spinner) findViewById(R.id.examRtnId);

        hombtn=(Button)findViewById(R.id.homeId);
        gallery=(TextView) findViewById(R.id.galleryId);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sample_layout,R.id.layoutId,cls);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,R.layout.notice_item,R.id.noticeItemId,ntic);
        noticeSpiner.setAdapter(adpt);

        ArrayAdapter<String> adapt1=new ArrayAdapter<String>(this,R.layout.sample_layout,R.id.layoutId,cls);
       attendanceSpnr.setAdapter(adapt1);

        ArrayAdapter<String> adapt2=new ArrayAdapter<String>(this,R.layout.layout_rtn,R.id.examrtnId,exam);
        examSpinr.setAdapter(adapt2);

        ArrayAdapter<String> adapt=new ArrayAdapter<String>(this,R.layout.sample_layout,R.id.layoutId,cls);
        resultSpiner.setAdapter(adapt);

        ArrayAdapter<String> adap=new ArrayAdapter<String>(this,R.layout.sample_layout,R.id.layoutId,cls);
        clsRoutineSpnr.setAdapter(adap);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(cls[position].equals("Six")){
                    Intent intent=new Intent(Home.this,StuOfEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Seven")){
                    Intent intent=new Intent(Home.this,StuOfEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Eight")){
                    Intent intent=new Intent(Home.this,StuOfEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Nine")){
                    Intent intent=new Intent(Home.this,StuOfEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Ten")){
                    Intent intent=new Intent(Home.this,StuOfEight.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        hombtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }
        });

      gallery.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent= new Intent(Home.this, Gallery.class);
              startActivity(intent);
          }
      });

      examSpinr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              if(exam[position].equals("Tutorial Exam")){
                  Intent intent=new Intent(Home.this,TutorialExam.class);
                  startActivity(intent);
              }
              else if(exam[position].equals("Semester Exam")) {
                  Intent intent = new Intent(Home.this, ExamRoutin.class);
                  startActivity(intent);
              }


          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

       noticeSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(ntic[position].equals("General Notice")){
            Intent intent=new Intent(Home.this,NoticePic.class);
            startActivity(intent);
               }
               else  if(ntic[position].equals("Parents Meeting")){
                   Intent intent=new Intent(Home.this,ParentsNotice.class);
                   startActivity(intent);
               }
               else  if(ntic[position].equals("Notice of Holiday")){
                   Intent intent=new Intent(Home.this,HolidayNotice.class);
                   startActivity(intent);
               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       clsRoutineSpnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(cls[position].equals("Six")){
                   Intent intent=new Intent(Home.this,ClassRtnpic.class);
                   startActivity(intent);
               }
               else if(cls[position].equals("Seven")){
                   Intent intent=new Intent(Home.this,ClassRtnpic.class);
                   startActivity(intent);
               }
               else if(cls[position].equals("Eight")){
                   Intent intent=new Intent(Home.this,ClassRtnpic.class);
                   startActivity(intent);
               }
               else if(cls[position].equals("Nine")){
                   Intent intent=new Intent(Home.this,ClassRtnpic.class);
                   startActivity(intent);
               }
               else if(cls[position].equals("Ten")){
                   Intent intent=new Intent(Home.this,ClassRtnpic.class);
                   startActivity(intent);
               }


           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

       examSpinr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               if(exam[position].equals("Tutorial Exam")){
                   Intent intent=new Intent(Home.this,TutoPic.class);
                   startActivity(intent);
               }
               else  if(exam[position].equals("Term Exam")){
                   Intent intent=new Intent(Home.this,TutorialExam.class);
                   startActivity(intent);
               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });


        attendanceSpnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(cls[position].equals("Six")){
                    Intent intent=new Intent(Home.this,AtenSix.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Seven")){
                    Intent intent=new Intent(Home.this,AtenSeven.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Eight")){
                    Intent intent=new Intent(Home.this,AtenEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Nine")){
                    Intent intent=new Intent(Home.this,AtenNine.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Ten")){
                    Intent intent=new Intent(Home.this,AtenTen.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        resultSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(cls[position].equals("Six")){
                    Intent intent=new Intent(Home.this,ResultSix.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Seven")){
                    Intent intent=new Intent(Home.this,ResultSeven.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Eight")){
                    Intent intent=new Intent(Home.this,ResultEight.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Nine")){
                    Intent intent=new Intent(Home.this,ResultNine.class);
                    startActivity(intent);
                }
                else if(cls[position].equals("Ten")){
                    Intent intent=new Intent(Home.this,ResultTen.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
