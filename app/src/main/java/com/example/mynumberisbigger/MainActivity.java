package com.example.mynumberisbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button buttonLeft;
    private Button buttonRight;
    private TextView textViewScore;
    private BiggerNumberGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        //construct the game
        game = new BiggerNumberGame(0, 10000);
        // do any intial setup before the player takes their
        updateGameDisplay();
    }

    private void updateGameDisplay() {
        //set the text of each button
        buttonRight.setText(String.valueOf(game.getNumber1()));
        buttonLeft.setText(String.valueOf(game.getNumber2()));
        //set the text of each score
        textViewScore.setText(String.valueOf(game.getScore()));
    }

    private void setListeners() {
        // creating an Anonymous Inner Class that implements View.OnClickListener
        //overriding the one abstract method onClicked(View v)
            buttonLeft.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "LEFT CLICKED!",
                            Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, game.checkAnswer((game.getNumber2())),Toast.LENGTH_SHORT).show();
                    game.generateRandomNumbers();
                    updateGameDisplay();
                }
            });
            buttonRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "RIGHT CLICKED!",
                            Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, game.checkAnswer((game.getNumber1())), Toast.LENGTH_SHORT).show();
                    game.generateRandomNumbers();
                    updateGameDisplay();
                }
            });
    }

    private void wireWidgets() {
        buttonLeft = findViewById(R.id.button_main_left);
        buttonRight = findViewById(R.id.button_main_right);
        textViewScore = findViewById(R.id.textview_main_score);
    }
}
