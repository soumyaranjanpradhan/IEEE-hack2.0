package com.example.medidcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
    }

    public void lungs(View view) {
        Intent intent =new Intent(ChestActivity.this, lungsActivity.class);
        startActivity(intent);
    }

    public void heart(View view) {
        Intent intent =new Intent(ChestActivity.this, heartActivity.class);
        startActivity(intent);
    }

    public void blood(View view) {
        Intent intent =new Intent(ChestActivity.this, bloodActivity.class);
        startActivity(intent);
    }
}