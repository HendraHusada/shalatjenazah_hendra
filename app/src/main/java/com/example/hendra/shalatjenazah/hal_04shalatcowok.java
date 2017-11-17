package com.example.hendra.shalatjenazah;

import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.VideoView;

public class hal_04shalatcowok extends AppCompatActivity {

    private RecyclerView shalatRecycler;
    private RecyclerView.Adapter shalatRecyclerAdapter;
    private RecyclerView.LayoutManager shalatRecyclerLayout;
    private VideoView videolist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_04shalatcowok);
        videolist = (VideoView) findViewById(R.id.videoView);


        shalatRecycler = (RecyclerView) findViewById(R.id.pilihanbaca);
        shalatRecyclerLayout = new LinearLayoutManager(this);
        shalatRecycler.setLayoutManager(shalatRecyclerLayout);
        shalatRecyclerAdapter = new AdapterRecycler(hal_04shalatcowok.this, videolist);
        shalatRecycler.setAdapter(shalatRecyclerAdapter);
    }
}
