package com.example.learncourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.learncourse.Adopters.CourseDetailsAdopter;
import com.example.learncourse.Adopters.CourseListAdopter;
import com.example.learncourse.Models.CoursListModel;
import com.example.learncourse.Models.CourseDetailModel;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView rvCourseList,rvCourseDetail;
    CourseListAdopter courseListAdopter;
    ArrayList<CoursListModel> list;

    ArrayList<CourseDetailModel> courseDetailsList;
    CourseDetailsAdopter courseDetailsAdopter;

    TextView viewMore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rvCourseList = findViewById(R.id.RvCourseList);
        rvCourseDetail = findViewById(R.id.RvCourseDetails);

        viewMore = findViewById(R.id.ViewMoreBtn);


        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent intent = new Intent(DashboardActivity.this,CourseListFullActivity.class);
                startActivity(intent);


            }
        });

        list = new ArrayList<>();
        courseDetailsList = new ArrayList<>();

        //RecyclerView for category
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        rvCourseList.setLayoutManager(linearLayoutManager); //
        rvCourseList.setHasFixedSize(true);

        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));

        courseListAdopter = new CourseListAdopter(this, list);
        rvCourseList.setAdapter(courseListAdopter);


        ////RecyclerView for course Details
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        rvCourseDetail.setLayoutManager(linearLayoutManager1); //
        rvCourseDetail.setHasFixedSize(true);

        courseDetailsList.add(new CourseDetailModel("jj","cc",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","java",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","php",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","python",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","lara",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","html",R.drawable.education));
         courseDetailsList.add(new CourseDetailModel("jj","css",R.drawable.education));


        courseDetailsAdopter = new CourseDetailsAdopter(this, courseDetailsList);
        rvCourseDetail.setAdapter(courseDetailsAdopter);
    }
}