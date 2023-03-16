package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable; // for EditText event handling
import android.text.TextWatcher; // EditText listener
import android.view.View;
import android.widget.Button;
import android.widget.EditText; // for bill amount input
import android.widget.SeekBar; // for changing the tip percentage
import android.widget.SeekBar.OnSeekBarChangeListener; // SeekBar listener
import android.widget.TextView; // for displaying text

import java.text.NumberFormat; // for currency formatting

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight;
    private EditText editTextHeight;
    private Button button;
    private TextView textView;


    // called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.activity_main); // inflate the GUI

        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        button = findViewById(R.id.btnSubmit);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }

    // calculate and display BMI
    private void calculate() {
        float height = Float.parseFloat(String.valueOf(editTextHeight.getText())) / 100;
        float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
        float bmi = weight / (height * height);
        textView.setText(String.valueOf(bmi));
    }
}

