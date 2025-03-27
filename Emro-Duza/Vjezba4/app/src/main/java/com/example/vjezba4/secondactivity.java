package com.example.vjezba4;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    private int number;
    private TextView textViewHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        textViewHello = findViewById(R.id.textViewHello);

        number = getIntent().getIntExtra("Number", -1);

        textViewHello.setText("Hello " + (number));
    }
}