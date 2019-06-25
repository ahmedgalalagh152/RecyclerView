package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;
     ArrayList<Item> items;
     ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        items=new ArrayList<>();
        items.add(new Item("title 1","desc 11111"));
        items.add(new Item("title 2","desc 2222"));
        items.add(new Item("title 3","desc 3333"));
        items.add(new Item("title 4","desc 444"));
        items.add(new Item("title 5","desc 555"));
        items.add(new Item("title 6","desc 666"));
        adapter=new ItemAdapter(items,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

    }
}
