package com.example.myandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.SortedMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello World");
    }
}