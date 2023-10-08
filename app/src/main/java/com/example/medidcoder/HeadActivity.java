package com.example.medidcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HeadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
    }

    public void forehead(View view) {
        Intent intent =new Intent(HeadActivity.this, foreheadActivity.class);
        startActivity(intent);

    }

    public void brain(View view) {
        Intent intent =new Intent(HeadActivity.this, brainActivity.class);
        startActivity(intent);
    }

    public void memory(View view) {
        Intent intent =new Intent(HeadActivity.this, memoryActivity.class);
        startActivity(intent);
    }
}