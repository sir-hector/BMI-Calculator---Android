package com.example.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmiAcitvity extends AppCompatActivity {
    private EditText editTextWeight;
    private EditText editTextHeight;
    private Button button;
    private Button mainButton;
    private TextView textView;


    // called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.bmi_layout); // inflate the GUI

        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        button = findViewById(R.id.btnSubmit);
        mainButton = findViewById(R.id.back);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainActivity();
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

    private void launchMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
