package com.example.jp.musicadh;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        return new MusicViewHolder(LayoutInflater.from(context).inflate(R.layout.celda_recycler_main, parent, false));
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
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

        }

        public void loadMusic(MusicDTO music){

            name.setText(music.getName());
            image.setImageResource(R.drawable.acdc_cover);
        }
    }
}
