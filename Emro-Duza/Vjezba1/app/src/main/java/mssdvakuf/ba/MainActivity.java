package mssdvakuf.ba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFirstNumber, editTextSecondNumber;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextSecondNumber);
        textViewResult = findViewById(R.id.editTextResult);
    }

    public void clickButtonAdd(View view) {
        int numberOne = Integer.parseInt(editTextFirstNumber.getText().toString());
        int numberTwo = Integer.parseInt(editTextSecondNumber.getText().toString());
        int result = numberOne + numberTwo;
        textViewResult.setText(Integer.toString(result));
    }

    public void clickButtonSub(View view) {
        int numberOne = Integer.parseInt(editTextFirstNumber.getText().toString());
        int numberTwo = Integer.parseInt(editTextSecondNumber.getText().toString());
        int result = numberOne - numberTwo;
        textViewResult.setText(Integer.toString(result));
    }

    public void clickButtonMul(View view) {
        int numberOne = Integer.parseInt(editTextFirstNumber.getText().toString());
        int numberTwo = Integer.parseInt(editTextSecondNumber.getText().toString());
        int result = numberOne * numberTwo;
        textViewResult.setText(Integer.toString(result));
    }

    public void clickButtonDiv(View view) {
        int numberOne = Integer.parseInt(editTextFirstNumber.getText().toString());
        int numberTwo = Integer.parseInt(editTextSecondNumber.getText().toString());
        if (numberTwo != 0) {
            int result = numberOne / numberTwo;
            textViewResult.setText(Integer.toString(result));
        } else {
            textViewResult.setText("Error");
        }
    }
}
