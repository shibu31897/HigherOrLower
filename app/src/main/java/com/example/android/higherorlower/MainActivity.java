package com.example.android.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random mRandom = new Random();
    int random = mRandom.nextInt(10)+1;
    public void guess(View view)
    {
        EditText guess = findViewById(R.id.guess);
        Button check = findViewById(R.id.check);

        int guessIntValue = Integer.parseInt(guess.getText().toString());
        String message = "";
        if(random<guessIntValue)
            message = "Go lower !";
        else if(random>guessIntValue)
            message = "Go higher";
        else if(random == guessIntValue)
        {
            message = "You got it !";
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random mRandom = new Random();
        int random = mRandom.nextInt(10)+1;
    }
}
