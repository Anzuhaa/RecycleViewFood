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

        itemList.add(new item("Shoyu Ramen"," A soy sauce-based broth with chicken slices, boiled egg, green onions, and nori", R.drawable.mie1));
        itemList.add(new item("Miso Ramen","A broth made with miso paste, topped with pork slices, garlic, corn kernels, and shiitake mushrooms.", R.drawable.mie5));
        itemList.add(new item("Tonkotsu Ramen","A creamy pork bone broth served with chashu (sliced pork belly), boiled egg, nori (seaweed), and chopped green onions.", R.drawable.mie3));
        itemList.add(new item("Shio Ramen","A clear, salty broth with ingredients like chikuwa (fish cake), napa cabbage, grilled crab, and grilled squid.", R.drawable.mie4));
        itemList.add(new item("Tantanmen Ramen","A spicy broth with minced beef, chopped onions, celery, and minced garlic.", R.drawable.mie2));
        itemList.add(new item("Shrimp Ramen","A seafood-based broth with shrimp, bok choy, chopped onions, and a boiled egg.", R.drawable.mie3));
        itemList.add(new item("Vegetarian Ramen","A vegetable broth with fried tofu, shiitake mushrooms, carrots, and water spinach.", R.drawable.mie4));
        itemList.add(new item("Kimchi Ramen","A spicy broth with kimchi, sliced pork, boiled egg, and chopped onions.", R.drawable.mie1));
        itemList.add(new item("Seafood Ramen","A broth filled with seafood like salmon, crab, squid, and a boiled egg.", R.drawable.mie5));
        itemList.add(new item("Curry Ramen","A curry-flavored broth with chicken slices, boiled potatoes, carrots, and chopped onions.", R.drawable.mie2));
        itemList.add(new item("Spicy Ramen","A broth with sliced beef, Thai chili peppers, chopped onions, and a boiled egg for heat lovers.", R.drawable.mie5));
        itemList.add(new item("Beef Ramen","A clear broth with boiled beef slices, broccoli, carrots, and a boiled egg.", R.drawable.mie4));
        itemList.add(new item("Duck Ramen","A broth with roasted duck slices, enoki mushrooms, napa cabbage, and a boiled egg.", R.drawable.mie3));
        itemList.add(new item("Pork Belly Ramen","A broth topped with grilled pork belly slices, boiled egg, green onions, and sweet corn.", R.drawable.mie1));
        itemList.add(new item("Lobster Ramen","A luxurious broth with lobster meat, broccoli, bean sprouts, and a boiled egg.", R.drawable.mie2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),itemList));
    }
}