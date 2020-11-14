package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;

public class AttendanceDatabase extends SQLiteOpenHelper {
    private final static String DATABASE_Name="Attendance.db";
    private final static String Table_Name="attendance";
    private final static String Col_1="ID";
    private final static String Col_2="Name";
    private final static String Col_3="Class";
    private final static String Col_4="Total_Days";
    private final static String Col_5="Present_Days";
    private final static String Col_6="Absent_Days";


    public AttendanceDatabase(@Nullable Context context) {
        super(context,DATABASE_Name , null, 1);
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ Table_Name+"( ID INTEGER PRIMARY KEY AUTOiNCREMENT, Name TEXT, Class TEXT,Total_Days TEXT, Present_Days TEXT, Absent_Days TEXT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Name);
        onCreate(db);
    }
    //data insert
    public boolean dataInsert(String name, String cls, String total, String present, String absent) {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_2,name);
        contentValues.put(Col_3,cls);
        contentValues.put(Col_4,total);
        contentValues.put(Col_5,present);
        contentValues.put(Col_6,absent);

    long res=    sqLiteDatabase.insert(Table_Name, null, contentValues);
    if(res==-1) return false;
    else
        return true;

    }
// get data from table

   public Cursor getAlData(){
       SQLiteDatabase db=this.getWritableDatabase();
       Cursor cursor=db.rawQuery("select *from "+Table_Name,null);
       return cursor;

   }
   // update data
   public  boolean updateData(String id,String name, String cls, String td, String pd, String ad){
       SQLiteDatabase db = this.getWritableDatabase();
       ContentValues contentValues=new ContentValues();
       contentValues.put(Col_1, id);
       contentValues.put(Col_2, name);
       contentValues.put(Col_3, cls);
       contentValues.put(Col_4, td);
       contentValues.put(Col_5, pd);
       contentValues.put(Col_6, ad);
       db.update(Table_Name, contentValues, "ID= ?", new String[]{ id });
       return true;


   }
    }

