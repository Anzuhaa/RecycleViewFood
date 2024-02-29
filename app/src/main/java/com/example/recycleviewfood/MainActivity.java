package com.example.recycleviewfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        List<item> itemList = new ArrayList<item>();

        itemList.add(new item("Tonkotsu","level 1 hot souce", R.drawable.mie1));
        itemList.add(new item("Mie (lv 2)","level 1 hot souce", R.drawable.mie5));
        itemList.add(new item("Mie (lv 3)","level 1 hot souce", R.drawable.mie3));
        itemList.add(new item("Mie (lv 4)","level 1 hot souce", R.drawable.mie4));
        itemList.add(new item("Mie (lv 5)","level 1 hot souce", R.drawable.mie2));
        itemList.add(new item("Mie (lv 6)","level 1 hot souce", R.drawable.mie3));
        itemList.add(new item("Mie (lv 7)","level 1 hot souce", R.drawable.mie4));
        itemList.add(new item("Mie (lv 8)","level 1 hot souce", R.drawable.mie1));
        itemList.add(new item("Mie (lv 9)","level 1 hot souce", R.drawable.mie5));
        itemList.add(new item("Mie (lv 10)","level 1 hot souce", R.drawable.mie2));
        itemList.add(new item("Mie (lv 11)","level 1 hot souce", R.drawable.mie5));
        itemList.add(new item("Mie (lv 12)","level 1 hot souce", R.drawable.mie4));
        itemList.add(new item("Mie (lv 13)","level 1 hot souce", R.drawable.mie3));
        itemList.add(new item("Mie (lv 14)","level 1 hot souce", R.drawable.mie1));
        itemList.add(new item("Mie (lv 15)","level 1 hot souce", R.drawable.mie2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),itemList));
    }
}