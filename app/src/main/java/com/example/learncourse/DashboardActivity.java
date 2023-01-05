package com.example.learncourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.learncourse.Adopters.CourseListAdopter;
import com.example.learncourse.Models.CoursListModel;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView rvCourseList;
    CourseListAdopter courseListAdopter;
    ArrayList<CoursListModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rvCourseList = findViewById(R.id.RvCourseList);

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