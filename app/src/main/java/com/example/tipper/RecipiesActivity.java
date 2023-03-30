package com.example.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipiesActivity extends AppCompatActivity {

    private Button mainButton;
    private Button firstRecipe;
    private Button secondRecipe;
    private TextView textView;


    // called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.recipies_layout); // inflate the GUI


        mainButton = findViewById(R.id.back);
        firstRecipe = findViewById(R.id.first_recipe);
        secondRecipe = findViewById(R.id.second_recipe);
        textView = findViewById(R.id.result);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMainActivity();
            }
        });
        firstRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFirstRecipe();
            }
        });
        secondRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadSecondRecipe();
            }
        });

    }


    private void launchMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void loadFirstRecipe(){
        textView.setText("Rybę pokroić na porcje, doprawić solą oraz pieprzem i obtoczyć w mące.\n" +
                "Rozgrzać dużą patelnię, roztopić olej, zwiększyć ogień i włożyć filety.\n" +
                "Smażyć przez ok. 2 - 3 minuty, następnie delikatnie przewrócić rybę na drugą stronę i smażyć przez ok. 2 minuty.\n" +
                "Zmniejszyć trochę ogień pod patelnią. Pomiędzy rybę wlać na patelnię mleko kokosowe, słodki sos chili oraz sos rybny.\n" +
                "Potrząsając delikatnie patelnią przemieszać składniki sosu. Gotować przez ok. 1 - 2 minuty. Na koniec skropić sokiem z limonki i posypać bazylią.\n" +
                "Podawać z ugotowanym ryżem i np. z fasolką szparagową.");
    }
    private void loadSecondRecipe(){
        textView.setText("Rybę pokroić na porcje, doprawić solą oraz pieprzem i obtoczyć w mące.\n" +
                "Rozgrzać dużą patelnię, roztopić olej, zwiększyć ogień i włożyć filety.\n" +
                "Smażyć przez ok. 2 - 3 minuty, następnie delikatnie przewrócić rybę na drugą stronę i smażyć przez ok. 2 minuty.\n" +
                "Zmniejszyć trochę ogień pod patelnią. Pomiędzy rybę wlać na patelnię mleko kokosowe, słodki sos chili oraz sos rybny.\n" +
                "Potrząsając delikatnie patelnią przemieszać składniki sosu. Gotować przez ok. 1 - 2 minuty. Na koniec skropić sokiem z limonki i posypać bazylią.\n" +
                "Podawać z ugotowanym ryżem i np. z fasolką szparagową.");
    }
}
