package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Dragonvideo extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragonvideo);

        videoView= (VideoView) findViewById(R.id.vvdragon);
        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.goles));
        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}