package com.example.kali.youtube.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.kali.youtube.Adapter.AdapterDetail;
import com.example.kali.youtube.Interface.OnVideoToLoad;
import com.example.kali.youtube.Model.Itembis;
import com.example.kali.youtube.Model.Itemsbis;
import com.example.kali.youtube.Model.fullJsonbis;
import com.example.kali.youtube.R;
import com.google.gson.Gson;

public class DetailvideoActivity extends AppCompatActivity implements OnVideoToLoad{

    private RecyclerView recyclerView2;
    private String ID;
    private String key ="AIzaSyDLugcl8gDdk_tZy4TeMbc7ZVXHV1lPtOI";
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailvideo);
        recyclerView2 = (RecyclerView) findViewById(R.id.RecyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        Bundle tmp = getIntent().getExtras();
        ID = tmp.getString("ID");
      ;
        url= "https://www.googleapis.com/youtube/v3/videos?id="+ID+"&key="+key+"&part=snippet,contentDetails,statistics,status";
        getVideoDetail();
    }

    private void getVideoDetail() {
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                fullJsonbis obj = new Gson().fromJson(response, fullJsonbis.class);
                setAdapter(obj.getItems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Contracts", "Error");
            }
        });
        Volley.newRequestQueue(this).add(request);
    }
    private void setAdapter(Itemsbis item) {
        AdapterDetail adapter = new AdapterDetail(item);
        adapter.setOnVideoToLoad(this);
        recyclerView2.setAdapter(adapter);
    }
    public static void start (Context context, String ID )
    {
        Intent intent = new Intent(context, DetailvideoActivity.class);
        intent.putExtra("ID", ID);
        context.startActivity(intent);
    }
    @Override
    public void OnVideoLoad(Itembis videos) {
        LirevideoActivity.start(DetailvideoActivity.this, ID);
    }
}
