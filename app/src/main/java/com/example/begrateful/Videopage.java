package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videopage extends AppCompatActivity {
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videopage);
        vv=findViewById(R.id.videoplay1);
        String videopath="android.resource://"+getPackageName()+"/"+R.raw.videoplay;
        Uri uri=Uri.parse(videopath);
        vv.setVideoURI(uri);
        MediaController mc=new MediaController(this);
        vv.setMediaController(mc);
        mc.setAnchorView(vv);
    }
}