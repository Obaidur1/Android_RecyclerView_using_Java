package com.example.basicactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String titles[],descriptions[];
    int images[] = {R.drawable.cpp,R.drawable.csharp,R.drawable.java,R.drawable.js,R.drawable.programming_language,R.drawable.python,R.drawable.ruby,R.drawable.swift,R.drawable.typescript,R.drawable.visual_studio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        titles = getResources().getStringArray(R.array.programming_languages);
        descriptions = getResources().getStringArray(R.array.descriptions);
        MyAdapter myAdapter = new MyAdapter(this,titles,descriptions,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}