package com.example.home_work_re2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView res;
    private PeopleAdapter ad;
    private ArrayList<String> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.main_recycler);
        ad = new PeopleAdapter(people);
        res.setAdapter(ad);
    }

    private void loadData() {
        people= new ArrayList<>();
        people.add("Kyrgyz");
        people.add("American");
        people.add("England");
        people.add("Kazakh");
        people.add("Russian");
        people.add("Arabian");
        people.add("Alban");
        people.add("Swiss");
        people.add("African");
        people.add("Asian");
        people.add("German");
        people.add("Korean");
        people.add("Japanese");
    }
}