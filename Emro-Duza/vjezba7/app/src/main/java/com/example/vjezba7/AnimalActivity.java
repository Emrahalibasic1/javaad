package com.example.vjezba7;

import static com.example.vjezba7.R.drawable.lion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnimalActivity extends AppCompatActivity {

    private TextView textViewAnimalName;
    private ImageView imageViewAnimal;
    private TextView textViewAnimalDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_activity);

        initializeViews();
        getAndDisplayAnimalInfo();
    }

    private void initializeViews() {
        textViewAnimalName = findViewById(R.id.TextanimalName);
        imageViewAnimal = findViewById(R.id.imageViewAnimal);
        textViewAnimalDescription = findViewById(R.id.TextanimalDescription);
    }

    private void getAndDisplayAnimalInfo() {
        Intent intent = getIntent();
        String animalName = intent.getStringExtra("animalName");

        textViewAnimalName.setText(animalName);

        if (animalName.equals("Lion")) {
            imageViewAnimal.setImageResource(R.drawable.lion);
            textViewAnimalDescription.setText("Lav je mama džungle");
        } else if (animalName.equals("Tiger")) {
            imageViewAnimal.setImageResource(R.drawable.sibirskiplavac);
            textViewAnimalDescription.setText("Sibirski plavac gggg");
        } else if (animalName.equals("Monkey")) {
            imageViewAnimal.setImageResource(R.drawable.MonkeySelfie);
            textViewAnimalDescription.setText("Treći c ovih dana");
        } else if (animalName.equals("Crocodile")) {
            imageViewAnimal.setImageResource(R.drawable.crocodiles);
            textViewAnimalDescription.setText("Crocodilo armadilo.");
        } else {
            textViewAnimalDescription.setText("No description available.");
        }
    }
}
