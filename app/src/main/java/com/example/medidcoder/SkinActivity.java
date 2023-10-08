package com.example.medidcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SkinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
    }

    public void skinvdo(View view) {
        Intent intent = new Intent(SkinActivity.this,skinVideoActivity.class);
        startActivity(intent);
    }
}