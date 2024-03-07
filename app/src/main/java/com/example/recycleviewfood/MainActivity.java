package com.example.recycleviewfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Adapter.ItemClickListener {

    Adapter adapter;
    private android.widget.Toast Toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        List<modelRamen> modelRamenList = new ArrayList<modelRamen>();

        modelRamenList.add(new modelRamen("Shoyu Ramen"," A soy sauce-based broth with chicken slices, boiled egg, green onions, and nori", R.drawable.mie1));
        modelRamenList.add(new modelRamen("Miso Ramen","A broth made with miso paste, topped with pork slices, garlic, corn kernels, and shiitake mushrooms.", R.drawable.mie5));
        modelRamenList.add(new modelRamen("Tonkotsu Ramen","A creamy pork bone broth served with chashu, boiled egg, nori, and chopped green onions.", R.drawable.mie3));
        modelRamenList.add(new modelRamen("Shio Ramen","A clear, salty broth with ingredients like chikuwa (fish cake), napa cabbage, grilled crab, and grilled squid.", R.drawable.mie4));
        modelRamenList.add(new modelRamen("Tantanmen Ramen","A spicy broth with minced beef, chopped onions, celery, and minced garlic.", R.drawable.mie2));
        modelRamenList.add(new modelRamen("Shrimp Ramen","A seafood-based broth with shrimp, bok choy, chopped onions, and a boiled egg.", R.drawable.mie3));
        modelRamenList.add(new modelRamen("Vegetarian Ramen","A vegetable broth with fried tofu, shiitake mushrooms, carrots, and water spinach.", R.drawable.mie4));
        modelRamenList.add(new modelRamen("Kimchi Ramen","A spicy broth with kimchi, sliced pork, boiled egg, and chopped onions.", R.drawable.mie1));
        modelRamenList.add(new modelRamen("Seafood Ramen","A broth filled with seafood like salmon, crab, squid, and a boiled egg.", R.drawable.mie5));
        modelRamenList.add(new modelRamen("Curry Ramen","A curry-flavored broth with chicken slices, boiled potatoes, carrots, and chopped onions.", R.drawable.mie2));
        modelRamenList.add(new modelRamen("Spicy Ramen","A broth with sliced beef, Thai chili peppers, chopped onions, and a boiled egg for heat lovers.", R.drawable.mie5));
        modelRamenList.add(new modelRamen("Beef Ramen","A clear broth with boiled beef slices, broccoli, carrots, and a boiled egg.", R.drawable.mie4));
        modelRamenList.add(new modelRamen("Duck Ramen","A broth with roasted duck slices, enoki mushrooms, napa cabbage, and a boiled egg.", R.drawable.mie3));
        modelRamenList.add(new modelRamen("Pork Belly Ramen","A broth topped with grilled pork belly slices, boiled egg, green onions, and sweet corn.", R.drawable.mie1));
        modelRamenList.add(new modelRamen("Lobster Ramen","A luxurious broth with lobster meat, broccoli, bean sprouts, and a boiled egg.", R.drawable.mie2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(), modelRamenList));
        adapter = new Adapter(this,modelRamenList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

    }
}