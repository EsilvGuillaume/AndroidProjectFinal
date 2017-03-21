package com.example.kali.youtube.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.kali.youtube.R;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class LirevideoActivity extends YouTubeBaseActivity {
    private String ID;
    Button launcher = null;
    private String key ="AIzaSyDLugcl8gDdk_tZy4TeMbc7ZVXHV1lPtOI";
    private YouTubePlayerView youtubeplayer;
    private YouTubePlayer.OnInitializedListener initializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lirevideo);
        Bundle tmp = getIntent().getExtras();
        ID = tmp.getString("ID");
        launcher = (Button) findViewById(R.id.buttonLauncher);
        youtubeplayer = (YouTubePlayerView) findViewById(R.id.viewYoutube);
        initializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean val) {
                youTubePlayer.loadVideo(ID);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubeplayer.initialize("AIzaSyDLugcl8gDdk_tZy4TeMbc7ZVXHV1lPtOI", initializedListener);
            }
        });
    }
    public static void start (Context context, String ID)
    {
        Intent intent = new Intent(context, LirevideoActivity.class);
        intent.putExtra("ID", ID);
        context.startActivity(intent);
    }
}
