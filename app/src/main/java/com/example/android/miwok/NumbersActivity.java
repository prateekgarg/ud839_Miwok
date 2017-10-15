package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Add the numbers array here
        String[] oldList = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        ArrayList<String> words = new ArrayList<String>();
        words.addAll(Arrays.asList(oldList));


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);

        //ListView listView = (ListView) findViewById(R.id.list);
        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
