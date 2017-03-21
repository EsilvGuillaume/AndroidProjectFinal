package com.example.kali.youtube.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.kali.youtube.Interface.OnVideoSelectedListener;
import com.example.kali.youtube.Model.Item;
import com.example.kali.youtube.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */

public class VideoViewHolder  extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView description;
    private TextView author;
    private TextView date;
    private OnVideoSelectedListener onVideoSelectedListener;
    private ImageView thumbnails;
    private TextView id;

    public VideoViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.titleView);
        description = (TextView) itemView.findViewById(R.id.descriptionView);
        author = (TextView) itemView.findViewById(R.id.authorView);
        date = (TextView) itemView.findViewById(R.id.dateView);
        thumbnails = (ImageView) itemView.findViewById(R.id.imageView);
        id = (TextView) itemView.findViewById(R.id.IdView);

    }

    public void bind(final Item video) {
        title.setText(video.getSnippet().getTitle());
        description.setText(video.getSnippet().getDescription());
        author.setText(video.getSnippet().getChannelTitle());
        date.setText((video.getSnippet().getPublishedAt()));
        id.setText((video.getId().getVideoId()));
        Picasso.with(thumbnails.getContext()).load(video.getSnippet().getThumbnails().getHigh().getUrl()).into(thumbnails);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoSelectedListener == null) {
                    return;
                }
                onVideoSelectedListener.OnVideoSelected(video);
            }
        });
    }
    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
