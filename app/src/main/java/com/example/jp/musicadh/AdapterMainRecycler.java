package com.example.jp.musicadh;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMainRecycler extends RecyclerView.Adapter{

    private Context context;
    private ArrayList<MusicDTO> musicList;

    public AdapterMainRecycler(Context context, ArrayList<MusicDTO> musicList) {
        this.context = context;
        this.musicList = musicList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View cellView = layoutInflater.inflate(R.layout.celda_recycler_main, parent, false);
        MusicViewHolder musicViewHolder = new MusicViewHolder(cellView);
        return musicViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MusicViewHolder musicViewHolder = (MusicViewHolder) holder;
        musicViewHolder.loadMusic(musicList.get(position));
    }

    @Override
    public int getItemCount() {
        return  musicList.size();
    }

    private class MusicViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView image;

        public MusicViewHolder(View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.nameTextView);
            this.image = itemView.findViewById(R.id.imageViewCellMain);

        }

        public void loadMusic(MusicDTO music){

            name.setText(music.getName());
            image.setImageResource(R.drawable.acdc_cover);
        }
    }
}
