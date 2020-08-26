package com.example.stepnext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Motivational_Video extends YouTubeBaseActivity {

    Button button ;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational__video);
        button = findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(Motivational_Video.this, Motivational_Video2.class);
                startActivity(categoryIntent);
                //finish();
            }
        });
        youTubePlayerView = findViewById(R.id.view1);

        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("3SDkzDlw1yc");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button=findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyDG1dUuAetCzcRmqCto-mIJ1p_wzza1EUA", onInitializedListener);

            }
        });







    }
}