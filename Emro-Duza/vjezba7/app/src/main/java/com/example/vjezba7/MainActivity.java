package com.example.vjezba7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayListAnimals;
    private ArrayAdapter<String> arrayAdapterAnimals;
    private ListView listViewAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeValues();
        fillArrayListAnimalsWithData();
        createArrayAdapterAnimals();
        setListViewAdapter();
        setListViewOnClickListener();
    }

    private void initializeValues() {
        listViewAnimals = findViewById(R.id.ListViewAnimals);
        arrayListAnimals = new ArrayList<>();
    }

    private void fillArrayListAnimalsWithData() {
        arrayListAnimals.add("Lion");
        arrayListAnimals.add("Tiger");
        arrayListAnimals.add("Monkey");
        arrayListAnimals.add("Crocodile");
    }

    private void createArrayAdapterAnimals() {
        arrayAdapterAnimals = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayListAnimals);
    }

    private void setListViewAdapter() {
        listViewAnimals.setAdapter(arrayAdapterAnimals);
    }

    private void setListViewOnClickListener() {
        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, AnimalActivity.class);
                intent.putExtra("animalName", arrayListAnimals.get(position));
                startActivity(intent);
            }
        });
    }
}
