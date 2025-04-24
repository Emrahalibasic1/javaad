package com.example.vjeznbakonvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText editTextKm;
    Spinner spinnerCurrency;
    Button btnConvert;
    TextView textResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextKm = findViewById(R.id.editTextKm);
        spinnerCurrency = findViewById(R.id.spinnerCurrency);
        btnConvert = findViewById(R.id.btnConvert);
        textResult = findViewById(R.id.textResult);
        String[] currencies = {"EUR", "RSD", "USD"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, currencies);
        spinnerCurrency.setAdapter(adapter);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kmString = editTextKm.getText().toString();
                if (kmString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Unesi iznos!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double km = Double.parseDouble(kmString);
                String selectedCurrency = spinnerCurrency.getSelectedItem().toString();
                double result = 0;

                switch (selectedCurrency) {
                    case "EUR":
                        result = km / 1.94;
                        break;
                    case "RSD":
                        result = km * 60;
                        break;
                    case "USD":
                        result = km / 1.80;
                        break;
                }

                textResult.setText(String.format("%.2f KM = %.2f %s", km, result, selectedCurrency));
            }
        });
    }
}
