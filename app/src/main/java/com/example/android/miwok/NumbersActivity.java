package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Add the numbers array here
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        //Log a couple of values for lesson2, exercise 5
        Log.v("NumbersActivityLogTag", "Word are: " + words[0] + " " + words[1] + " " + words[2] + " " + words[3] + " " + words[4] + " " + words[5] + " " + words[6] + " " + words[7] + " " + words[8] + " " + words[9] );

    }
}
