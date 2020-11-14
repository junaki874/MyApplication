package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="student.db";
    public static  final String TABLE_NAME="identity";
    public static  final String COL_1="ID";
    public static  final String COL_2="Name";
    public static  final String COL_3="Address";
    public static  final String COL_4="Blood_Group";
    public static  final String COL_5="Date_of_Birth";
    public static  final String COL_6="Phone_Number";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Address TEXT, Blood_Group TEXT, Date_of_Birth INTEGER, Phone_Number Text) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
          db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
          onCreate(db);
    }
    public boolean insertData(String name, String address, String bld_grp, String dob, String phn ) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, bld_grp);
        contentValues.put(COL_5, dob);
        contentValues.put(COL_6, phn);

      long result=  db.insert(TABLE_NAME, null,contentValues);
      if(result== -1)
          return false;
          else
              return true;
    }
    public Cursor getAllData() {


        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);

        return res;

    }
    public  boolean updateData(String id,String name, String address, String bld_grp, String dob, String phn){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, bld_grp);
        contentValues.put(COL_5, dob);
        contentValues.put(COL_6, phn);
        db.update(TABLE_NAME, contentValues, "ID= ?", new String[]{ id });
         return true;


    }

    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
       return db.delete(TABLE_NAME,"ID= ?",new String[]{id});
    }
    }
