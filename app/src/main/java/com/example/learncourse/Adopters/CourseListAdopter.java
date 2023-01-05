package com.example.learncourse.Adopters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learncourse.Models.CoursListModel;
import com.example.learncourse.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CourseListAdopter extends RecyclerView.Adapter<CourseListAdopter.ViewHolder>{

    Context context;
    ArrayList<CoursListModel> list;

    public CourseListAdopter(Context context, ArrayList<CoursListModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row_temp,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       holder.textView.setText(list.get(position).getText());
       holder.imageView.setImageResource(list.get(position).getImage());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.courseListImg);
            textView = itemView.findViewById(R.id.courseListText);


        }
    }
}
