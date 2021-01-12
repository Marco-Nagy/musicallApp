package com.example.musicalapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//1-Context , ArrayList ( Constructor )-/
//2- Class ViewHolder extend RecyclerView.viewHolder (Define Views ) inner
//3- Adapter extend RecyclerView.Adapter<ViewHolder>
//4-1 getItemCount > arrayList.size
//4-2 onCreateViewHolder > layout
//4-3 onBindViewHolder > setText , onClick ,getText

public class AdapterArtist extends RecyclerView.Adapter<AdapterArtist.SongsViewHolder>{
     Context context;
     ArrayList<Songs> artistList;
    public AdapterArtist(Context context, ArrayList<Songs> artistList) {
        this.context = context;
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public SongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_artists,parent,false);
        SongsViewHolder songsViewHolder = new  SongsViewHolder(view);
        return songsViewHolder;
    }

    @Override

    public void onBindViewHolder(@NonNull SongsViewHolder holder,int  position) {
        holder.nameArtist.setText(artistList.get(position).getArtistName());
        holder.artistImage.setImageResource(artistList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "" + artistList.get(position).getArtistName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return artistList.size();
    }

    public class SongsViewHolder extends RecyclerView.ViewHolder {
        TextView nameArtist;
        ImageView artistImage;

        public SongsViewHolder(@NonNull View itemView) {
            super(itemView);
            nameArtist=itemView.findViewById(R.id.textView_artist);
            artistImage=itemView.findViewById(R.id.image_artist);
        }

    }


}

