package com.example.takatsomolekane.videoplayer;

import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView screen;
    MediaController mediaController;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Declare variables*/
        screen = (VideoView) findViewById(R.id.vd_intro);
        mediaController = new MediaController(this);

        Uri uri = Uri.parse("android.resource://"
                +getPackageName()
                +"/"+R.raw.introduction_vid );
        screen.setVideoURI(uri);
        screen.setMediaController(mediaController);
        mediaController.setAnchorView(screen);
        screen.start();
    }


}
