package com.example.my_application;

//import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MagicActivity extends AppCompatActivity {
    //Intent intent = getIntent();
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magic);
         toolbar = findViewById(R.id.magicTool);
        setSupportActionBar(toolbar);

    }
}