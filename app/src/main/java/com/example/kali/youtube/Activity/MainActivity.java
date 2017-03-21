package com.example.kali.youtube.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.kali.youtube.R;

public class MainActivity extends AppCompatActivity {
    private String API_KEY = "AIzaSyDLugcl8gDdk_tZy4TeMbc7ZVXHV1lPtOI";
    private static final String CONTRACTS_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&type=video&q=";

    EditText searchkeyword =null;
    Button go = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchkeyword = (EditText) findViewById(R.id.editText);
        go = (Button) findViewById(R.id.button);
        go.setOnClickListener(searchvideo);
    }
    private OnClickListener searchvideo = new OnClickListener() {
        @Override
        public void onClick(View v) {
                        ListvideoActivity.start(MainActivity.this, CONTRACTS_URL+searchkeyword.getText()+"&key="+API_KEY);
        }
    };
}
