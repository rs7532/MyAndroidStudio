package com.example.myandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Click_number extends AppCompatActivity {
    Button btn;
    int i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_number);

        btn = findViewById(R.id.number_of_clicks);
        i = 0;

    }
    @SuppressLint("SetTextI18n")
    public void click_button(View view) {
        i++;
        btn.setText("This is click number: " + i);
        }
    }

