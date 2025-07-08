package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              String inputText = editText.getText().toString();


              // convert strings into double

               double kilos = Double.parseDouble(inputText);

               // convert kilos into pounds

           double pounds =makeConversion(kilos);

           // Displaying the Conversion results.
              textView.setText(""+ pounds);


          }
      });

    }

    public double makeConversion(double kilos) {
                  // 1 kilo = 2.20426
        return kilos * 2.20426;
    }

}