package com.example.medidcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void chest(View view) {
        Intent intent =new Intent(SecondActivity.this, ChestActivity.class);
        startActivity(intent);
    }

    public void head(View view) {
        Intent intent =new Intent(SecondActivity.this, HeadActivity.class);
        startActivity(intent);
    }

    public void belly(View view) {
        Intent intent =new Intent(SecondActivity.this, BellyActivity.class);
        startActivity(intent);
    }

    public void skin(View view) {
        Intent intent =new Intent(SecondActivity.this, SkinActivity.class);
        startActivity(intent);
    }

    public void hair(View view) {
        Intent intent =new Intent(SecondActivity.this, HairActivity.class);
        startActivity(intent);
    }

    public void face(View view) {
        Intent intent = new Intent(SecondActivity.this,FaceActivity.class);
        startActivity(intent);
    }
}