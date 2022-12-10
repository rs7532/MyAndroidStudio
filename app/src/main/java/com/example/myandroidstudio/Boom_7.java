package com.example.myandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Boom_7 extends AppCompatActivity {
    Button btn;
    int i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicks_to_6);

        btn = findViewById(R.id.number_of_clicks_to_6);
        i = 0;

    }
    @SuppressLint("SetTextI18n")
    public void click_button(View view) {
        if (i < 6){
            i++;
            btn.setText("This is click number: " + i);}
        else{
            btn.setText("Boom!");
            i = 0;
        }
    }
}

