package com.example.kali.youtube.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kali.youtube.Interface.OnVideoSelectedListener;
import com.example.kali.youtube.Interface.OnVideoToLoad;
import com.example.kali.youtube.Model.Item;
import com.example.kali.youtube.Model.Itembis;
import com.example.kali.youtube.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */

public class DetailViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView description;
        private TextView author;
        private TextView date;
        private ImageView thumbnails;
        private TextView like;
        private TextView count;
        private TextView unlike;
        private TextView duration;
    private OnVideoToLoad onVideoToLoad;


    public DetailViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.titleView1);
            description = (TextView) itemView.findViewById(R.id.describeView1);
            author = (TextView) itemView.findViewById(R.id.authorView1);
            date = (TextView) itemView.findViewById(R.id.dateView1);
            thumbnails = (ImageView) itemView.findViewById(R.id.imageView2);
            like = (TextView) itemView.findViewById(R.id.likeView1);
            count = (TextView) itemView.findViewById(R.id.countView1);
            unlike = (TextView) itemView.findViewById(R.id.unlikeView1);
            duration = (TextView) itemView.findViewById(R.id.durationView1);

        }

    public void bind(final Itembis video) {
        title.setText(video.getSnippet().getTitle());
        description.setText(video.getSnippet().getDescription());
        author.setText(video.getSnippet().getChannelTitle());
        date.setText(video.getSnippet().getPublishedAt());
        like.setText(video.getStatistics().getLikeCount());
        count.setText(video.getStatistics().getViewCount());
        unlike.setText(video.getStatistics().getDislikeCount());
        duration.setText(video.getContentDetails().getDuration());
        Picasso.with(thumbnails.getContext()).load(video.getSnippet().getThumbnails().getHigh().getUrl()).into(thumbnails);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoToLoad == null) {
                    return;
                }
                onVideoToLoad.OnVideoLoad(video);
            }
        });
    }
    public void setOnVideoToLoad(OnVideoToLoad onVideoLoad) {
        this.onVideoToLoad = onVideoLoad;
    }

}
