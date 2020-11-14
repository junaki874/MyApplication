package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.adapter.MyGallery;
import com.example.myapplication.model.PhotoModel;

import java.util.ArrayList;
import java.util.List;

public class Gallery extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyGallery myGalleryAdapter;
    private Button btn;
    private List<PhotoModel> photoModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recyclerView);
      //  recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        myGalleryAdapter = new MyGallery(photoModels);
        recyclerView.setAdapter(myGalleryAdapter);
        btn=(Button)findViewById(R.id.gallerybackId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gallery.this, Home.class);
                startActivity(intent);
            }
        });

        // set data to adapter
        PhotoModel pm1  = new PhotoModel();
        pm1.photo = R.drawable.gal0;
        pm1.photoName = "Photo 1";
        PhotoModel pm2  = new PhotoModel();
        pm2.photo = R.drawable.gal1;
        pm2.photoName = "Photo 2";
        PhotoModel pm3  = new PhotoModel();
        pm3.photo = R.drawable.gal2;
        pm3.photoName = "Photo 3";
        PhotoModel pm4  = new PhotoModel();
        pm4.photo = R.drawable.gal3;
        pm4.photoName = "Photo 4";
        PhotoModel pm5  = new PhotoModel();
        pm5.photo = R.drawable.gal4;
        pm5.photoName = "Photo 5";
        PhotoModel pm6  = new PhotoModel();
        pm6.photo = R.drawable.gal5;
        pm6.photoName = "Photo 6";

        PhotoModel pm7  = new PhotoModel();
        pm7.photo = R.drawable.gal6;
        pm7.photoName = "Photo 7";

        PhotoModel pm8  = new PhotoModel();
        pm8.photo = R.drawable.gal7;
        pm8.photoName = "Photo 8";

        PhotoModel pm9  = new PhotoModel();
        pm9.photo = R.drawable.gal9;
        pm9.photoName = "Photo 9";

        PhotoModel pm10  = new PhotoModel();
        pm10.photo = R.drawable.gal10;
        pm10.photoName = "Photo 10";


        photoModels.add(pm1);
        photoModels.add(pm2);
        photoModels.add(pm3);
        photoModels.add(pm4);
        photoModels.add(pm5);
        photoModels.add(pm6);
        photoModels.add(pm7);
        photoModels.add(pm8);
        photoModels.add(pm9);
        photoModels.add(pm10);





        myGalleryAdapter.notifyDataSetChanged();


    }



}
