package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.PhotoModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyGallery extends RecyclerView.Adapter<MyGallery.MyAdapter> {

    private List<PhotoModel> photoModels;

    public MyGallery(List<PhotoModel> photoModels) {
        this.photoModels = photoModels;
    }

    @NonNull
    @Override
    public MyGallery.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_gallery, parent, false);
        return new MyAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyGallery.MyAdapter holder, int position) {

      PhotoModel photoModel = this.photoModels.get(position);

        Picasso.get().load(photoModel.photo).into(holder.ivThumb);

        holder.tvTitle.setText(photoModel.photoName);

    }

    @Override
    public int getItemCount() {
        return photoModels.size();
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        ImageView ivThumb;
        TextView tvTitle;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);

            ivThumb = itemView.findViewById(R.id.ivThumb);
            tvTitle = itemView.findViewById(R.id.tvTitle);



        }
    }
}
