package com.example.learncourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.learncourse.Adopters.CourseListAdopter;
import com.example.learncourse.Models.CoursListModel;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView rvCourseList;
    CourseListAdopter courseListAdopter;
    ArrayList<CoursListModel> list;

    TextView viewMore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rvCourseList = findViewById(R.id.RvCourseList);
        viewMore = findViewById(R.id.ViewMoreBtn);


        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent intent = new Intent(DashboardActivity.this,CourseListFullActivity.class);
                startActivity(intent);


            }
        });

        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        rvCourseList.setLayoutManager(linearLayoutManager); //
        rvCourseList.setHasFixedSize(true);




        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));

        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));


        courseListAdopter = new CourseListAdopter(this, list);
        rvCourseList.setAdapter(courseListAdopter);


    }
}