package com.example.hendra.shalatjenazah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.VideoView;

public class hal_04shalatcewek extends AppCompatActivity {

    private RecyclerView shalatRecycler;
    private RecyclerView.Adapter shalatRecyclerAdapter;
    private RecyclerView.LayoutManager shalatRecyclerLayout;
    private VideoView videolist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_04shalatcewek);
        videolist = (VideoView) findViewById(R.id.videoView);


        shalatRecycler = (RecyclerView) findViewById(R.id.pilihanbaca);
        shalatRecyclerLayout = new LinearLayoutManager(this);
        shalatRecycler.setLayoutManager(shalatRecyclerLayout);
        shalatRecyclerAdapter = new AdapterRecycler2(hal_04shalatcewek.this, videolist);
        shalatRecycler.setAdapter(shalatRecyclerAdapter);
    }
}
