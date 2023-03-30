package com.example.tipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText; // for bill amount input
import android.widget.TextView; // for displaying text


public class MainActivity extends AppCompatActivity {

    private Button bmiButton;
    private Button caloriesButton;
    private Button recipiesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);


        bmiButton = findViewById(R.id.bmi_panel);
        caloriesButton = findViewById(R.id.calories_panel);
        recipiesButton = findViewById(R.id.recipies_panel);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchBmiCalculator();
            }
        });
        caloriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchCalories();
            }
        });
        recipiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRecipies();
            }
        });

    }
    private void launchBmiCalculator(){
        Intent intent = new Intent(this, BmiAcitvity.class);
        startActivity(intent);
    }
    private void launchCalories(){
        Intent intent = new Intent(this, CaloriesActivity.class);
        startActivity(intent);
    }
    private void launchRecipies(){
        Intent intent = new Intent(this, RecipiesActivity.class);
        startActivity(intent);
    }

}

