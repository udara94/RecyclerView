package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TVSeries> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TVSeriesAdaptor mAdapter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new TVSeriesAdaptor(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        recyclerView.setAdapter(mAdapter);

        populateData();
    }

    private void populateData() {

        String[] tvseries = new String[]{
                "https://wallpapersite.com/images/pages/pic_w/14693.jpg",
                "https://wallpapersite.com/images/pages/pic_w/9678.jpg",
                "https://stmed.net/sites/default/files/the-blacklist-wallpapers-31695-8813388.jpg",
                "https://stmed.net/sites/default/files/styles/1280x720/public/lucifer-wallpapers-31613-6873183.jpg?itok=74jI2BiU",
                "https://stmed.net/sites/default/files/styles/1280x720/public/the-big-bang-theory-wallpapers-31694-2815088.jpg?itok=K_MjM_rv",
                "https://wallpapersite.com/images/pages/pic_w/1658.jpg",
                "https://i.ytimg.com/vi/IsMRioOpZrY/maxresdefault.jpg",
                "https://stmed.net/sites/default/files/styles/1280x720/public/the-100-wallpapers-31691-3965773.jpg?itok=GIFpBqsA",
                "https://wallpapercave.com/wp/wp1865530.jpg",
                "https://wallpapersite.com/images/pages/pic_w/17210.jpg",

                };

        TVSeries tv = new TVSeries("Arrow","7.5","2012", tvseries[0]);
        movieList.add(tv);

        tv = new TVSeries("SuperGirl","6.7","2015", tvseries[1]);
        movieList.add(tv);

        tv = new TVSeries("The BlackList","7.7","2013", tvseries[2]);
        movieList.add(tv);

        tv = new TVSeries("Lucifer","9.2","2015", tvseries[3]);
        movieList.add(tv);

      tv = new TVSeries("The Big Bang Theory","6.4","2007", tvseries[4]);
        movieList.add(tv);

        tv = new TVSeries("Flash","6.9","2014", tvseries[5]);
        movieList.add(tv);

        tv = new TVSeries("Game of Thrones","9.4","2011", tvseries[6]);
        movieList.add(tv);

        tv = new TVSeries("The 100","7.4","2014", tvseries[7]);
        movieList.add(tv);

        tv = new TVSeries("Agent of Sheild","8.2","2013", tvseries[8]);
        movieList.add(tv);

        tv = new TVSeries("Daredevil","6.9","2015", tvseries[9]);
        movieList.add(tv);


        mAdapter.notifyDataSetChanged();
    }

}
