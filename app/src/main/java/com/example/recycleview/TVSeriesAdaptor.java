package com.example.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import com.squareup.picasso.Picasso;

public class TVSeriesAdaptor extends RecyclerView.Adapter<TVSeriesAdaptor.TVSeriesViewHolder> {

    private List<TVSeries> tvSeriesList;


    public class TVSeriesViewHolder extends RecyclerView.ViewHolder {
        public TextView name, year, ratings;
        public ImageView imageView;
        public  RelativeLayout relativeLayout;

        public TVSeriesViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            ratings = (TextView) view.findViewById(R.id.rating);
            year = (TextView) view.findViewById(R.id.year);
            imageView =(ImageView) view.findViewById(R.id.image_view);

        }
    }


    public TVSeriesAdaptor(List<TVSeries> tvSeriesList) {

        this.tvSeriesList = tvSeriesList;

    }

    @Override
    public TVSeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tv_series_list_row, parent, false);

        return new TVSeriesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TVSeriesViewHolder holder, int position) {
        TVSeries tv = tvSeriesList.get(position);
        holder.name.setText(tv.getName());
        holder.ratings.setText(tv.getRating());
        holder.year.setText(tv.getYear());
       // holder.relativeLayout.setB
        Picasso.get().load(tv.getImage()).into(holder.imageView);
        //holder.imageView.setImageResource(tv.getImage());
    }

    @Override
    public int getItemCount() {
        return tvSeriesList.size();
    }
}
