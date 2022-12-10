package com.example.myandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Click_btn extends AppCompatActivity {
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_btn1);

        btn = findViewById(R.id.click_button);

    }
    @SuppressLint("SetTextI18n")
    public void click_button(View view) {
        btn.setText("Oh, yea, I've been clicked");
    }
}