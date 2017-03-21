package com.example.kali.youtube.Adapter;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kali.youtube.Model.Items;
import com.example.kali.youtube.R;
import com.example.kali.youtube.ViewHolder.VideoViewHolder;
import com.example.kali.youtube.Interface.OnVideoSelectedListener;

public class AdapterVideo extends RecyclerView.Adapter<VideoViewHolder> {
    private final Items items;
    private OnVideoSelectedListener onVideoSelectedListener;

    public AdapterVideo(Items items) {
        this.items = items;
    }

    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.videolist_viewholder, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.setOnVideoSelectedListener(onVideoSelectedListener);
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }
    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}


