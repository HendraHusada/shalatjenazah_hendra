package com.example.hendra.shalatjenazah;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by Hendra on 28/04/2017.
 */

public class AdapterRecycler2 extends RecyclerView.Adapter<AdapterRecycler2.ViewHolder> {
    Context con;
    VideoView videolist;
    public AdapterRecycler2(hal_04shalatcewek hal_03con, VideoView videolistshalat){
        con = hal_03con;
        videolist = videolistshalat;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View barisbacaan = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_hal_04pilihanbaca,parent,false);
        ViewHolder bc = new ViewHolder(barisbacaan);
        barisbacaan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN)
                {
                    v.setBackgroundColor(Color.parseColor("#f0f0f0"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                {
                    v.setBackgroundColor(Color.TRANSPARENT);
                }
                return false;
            }
        });
        return bc;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        if (position==0) {
            holder.bcsh.setBackgroundResource(R.drawable.niatcewek);
        }
        else if(position==1){
            holder.bcsh.setBackgroundResource(R.drawable.takbir_1trans);
        }
        else if(position==2){
            holder.bcsh.setBackgroundResource(R.drawable.takbir_2trans);
        }
        else if(position==3){
            holder.bcsh.setBackgroundResource(R.drawable.takbir_3perempuan);
        }
        else if(position==4){
            holder.bcsh.setBackgroundResource(R.drawable.takbir_4perempuan);
        }
        else if(position==5){
            holder.bcsh.setBackgroundResource(R.drawable.salamtrans);
        }

        holder.bcsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_url = "android.resource://" + con.getPackageName() + "/raw/";
                if (position==0){
                    Toast.makeText(con.getApplicationContext(),"niat",Toast.LENGTH_LONG).show();
                    video_url += "niat_perempuan";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
                else if(position==1){
                    Toast.makeText(con.getApplicationContext(),"takbir1",Toast.LENGTH_LONG).show();
                    video_url += "takbir1";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
                else if(position==2){
                    Toast.makeText(con.getApplicationContext(),"takbir2",Toast.LENGTH_LONG).show();
                    video_url += "takbir2";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
                else if(position==3){
                    Toast.makeText(con.getApplicationContext(),"takbir3",Toast.LENGTH_LONG).show();
                    video_url += "takbir3_perempuan";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
                else if(position==4){
                    Toast.makeText(con.getApplicationContext(),"takbir4",Toast.LENGTH_LONG).show();
                    video_url += "takbir4_perempuan";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
                else if(position==5){
                    Toast.makeText(con.getApplicationContext(),"salam",Toast.LENGTH_LONG).show();
                    video_url += "salam";
                    Uri video = Uri.parse(video_url);
                    videolist.setVideoURI(video);
                    videolist.start();
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return 6;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bcsh;
        public ViewHolder(View itemView) {
            super(itemView);
            bcsh = (ImageView) itemView.findViewById(R.id.imageView3);
        }
    }
}


