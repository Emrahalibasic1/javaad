package com.example.vjezba4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private int number=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
    }
    public void clickButtonNext(View view){
        Intent intent = new Intent(getApplicationContext(),secondactivity.class);
        number = Integer.valueOf(editTextNumber.getText().toString());
        intent.putExtra("number",number);
        startActivity(intent);

    }
}