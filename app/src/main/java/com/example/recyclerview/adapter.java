package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.subjectHolder> {
private String[] data;
public adapter(String[] data){
this.data=data;
}
    @NonNull
    @Override
    public subjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list,parent,false);

    return new subjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull subjectHolder holder, int position) {
String title=data[position];
holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class subjectHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;
        public subjectHolder(@NonNull View itemView) {
            super(itemView);

            imageView=(ImageView) itemView.findViewById(R.id.imageView);
            textView=(TextView) itemView.findViewById(R.id.textView);
        }
    }
}

