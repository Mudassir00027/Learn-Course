package com.example.learncourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.learncourse.Adopters.CourseListAdopter;
import com.example.learncourse.Models.CoursListModel;

import java.util.ArrayList;

public class CourseListFullActivity extends AppCompatActivity {

    RecyclerView rvCourseListFull;
    CourseListAdopter courseListAdopter;
    ArrayList<CoursListModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list_full);

        rvCourseListFull = findViewById(R.id.RvCourseListFull);

        list = new ArrayList<>();

       /* GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rvCourseListFull.setLayoutManager(gridLayoutManager);
        rvCourseListFull.setHasFixedSize(true);*/

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // set Horizontal Orientation
        rvCourseListFull.setLayoutManager(linearLayoutManager); //
        rvCourseListFull.setHasFixedSize(true);



        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));

        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));
        list.add(new CoursListModel("java", R.drawable.education));


        courseListAdopter = new CourseListAdopter(this, list);
        rvCourseListFull.setAdapter(courseListAdopter);



    }
}