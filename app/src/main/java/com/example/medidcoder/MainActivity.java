package com.example.medidcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+
                getPackageName()+"/"+R.raw.vdo);
        videoView.setVideoURI(uri);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startActi();
            }
        });
        videoView.start();



    }
    private void startActi() {
        if(isFinishing())
            return;
        Intent intent=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        finish();

    }
}