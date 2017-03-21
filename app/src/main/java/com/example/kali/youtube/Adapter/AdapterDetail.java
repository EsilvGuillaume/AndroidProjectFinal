package com.example.kali.youtube.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kali.youtube.Interface.OnVideoToLoad;
import com.example.kali.youtube.Model.Itemsbis;
import com.example.kali.youtube.R;
import com.example.kali.youtube.ViewHolder.DetailViewHolder;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */

public class AdapterDetail extends RecyclerView.Adapter<DetailViewHolder> {
        private final Itemsbis items;
    private OnVideoToLoad onVideoToLoad;
        public AdapterDetail(Itemsbis items) {
            this.items = items;
        }

    public DetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.struct_detailvideo, parent, false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailViewHolder holder, int position) {
        holder.setOnVideoToLoad(onVideoToLoad);
        holder.bind(items.get(position));
    }
    public void setOnVideoToLoad(OnVideoToLoad onVideoToLoad) {
        this.onVideoToLoad = onVideoToLoad;
    }
    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

}


