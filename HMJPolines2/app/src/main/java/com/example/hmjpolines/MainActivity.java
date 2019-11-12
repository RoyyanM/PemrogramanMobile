package com.example.hmjpolines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<hmj> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("HM & UKM Polines");
        }

        rvHmj = findViewById(R.id.rv_hmj);
        rvHmj.setHasFixedSize(true);

        list.addAll(getListHmj());
        showRecycleList();
    }

    private void showRecycleList() {
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        ListHmjAdapter listHmjAdapter = new ListHmjAdapter(list);
        rvHmj.setAdapter(listHmjAdapter);
    }
}
