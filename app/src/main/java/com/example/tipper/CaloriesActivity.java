package com.example.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CaloriesActivity extends AppCompatActivity {
    private EditText editTextWeight;
    private EditText editTextHeight;
    private EditText editTextAge;
    private RadioGroup genderChoice;
    private Button button;
    private Button mainButton;
    private TextView textView;
    private RadioButton radioButton;


    // called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.calories_layout); // inflate the GUI

        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        genderChoice = findViewById(R.id.gender);
        editTextAge = findViewById(R.id.age);

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
        float age = Float.parseFloat(String.valueOf(editTextAge.getText()));
        float result = 0;
        radioButton = (RadioButton) findViewById(genderChoice.getCheckedRadioButtonId());
        System.out.println(radioButton.getText());
        System.out.println(radioButton.getText() == "Woman");
        if(radioButton.getText().equals("Woman")){
            System.out.println("tutaj");
            result = Float.parseFloat(String.valueOf(655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age)));
        } else if (radioButton.getText().equals("Man")) {
            result = Float.parseFloat(String.valueOf(656.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age)));
        }
        textView.setText(String.valueOf(result));
    }

    private void launchMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
