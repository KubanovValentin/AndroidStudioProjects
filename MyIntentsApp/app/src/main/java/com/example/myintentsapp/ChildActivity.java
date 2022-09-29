package com.example.myintentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        textView=findViewById(R.id.tv_display);

        Intent intentThatStartThisActivity=getIntent();

        if (intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            String textEntered=intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            textView.setText(textEntered);
        }
    }
}