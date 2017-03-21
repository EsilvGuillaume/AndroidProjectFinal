package com.example.kali.youtube.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.example.kali.youtube.Adapter.AdapterVideo;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.kali.youtube.Model.Item;
import com.example.kali.youtube.Model.Items;
import com.example.kali.youtube.Model.fullJson;
import com.example.kali.youtube.R;
import com.google.gson.Gson;
import com.example.kali.youtube.Interface.OnVideoSelectedListener;

public class ListvideoActivity extends AppCompatActivity implements OnVideoSelectedListener {
    private static String URL ="";
    private RecyclerView recyclerView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listvideo);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Bundle test = getIntent().getExtras();
        URL = test.getString("URLL");
    getVideo();
    }


    private void getVideo() {
        StringRequest Videorequest = new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                fullJson obj = new Gson().fromJson(response, fullJson.class);
              setAdapter(obj.getItems());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Contracts", "Error");
            }
        });

        Volley.newRequestQueue(this).add(Videorequest);
    }
    private void setAdapter(Items item) {
        AdapterVideo adapter = new AdapterVideo(item);
        adapter.setOnVideoSelectedListener(this);
        recyclerView.setAdapter(adapter);
    }
    public static void start (Context context, String url )
    {
        Intent intent = new Intent(context, ListvideoActivity.class);
        intent.putExtra("URLL", url);
        context.startActivity(intent);
    }
    @Override
    public void OnVideoSelected(Item videos) {
        DetailvideoActivity.start(ListvideoActivity.this, videos.getId().getVideoId());
    }
}
