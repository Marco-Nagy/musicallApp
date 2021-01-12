package com.example.musicalapp;
import android.content.Context;
import android.content.Intent;
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

public class AdapterSongs extends RecyclerView.Adapter<AdapterSongs.SongsViewHolder>{
     Context context;
     ArrayList<Songs> songsList;
    SongsInterface songsI;
    public AdapterSongs(Context context, ArrayList<Songs> songsList,SongsInterface songsI) {
        this.context = context;
        this.songsList = songsList;
        this.songsI=songsI;

    }
    @NonNull
    @Override
    public SongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_song,parent,false);
        SongsViewHolder songsViewHolder = new  SongsViewHolder(view);
        return songsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongsViewHolder holder,int  position) {
        holder.songTitle.setText(songsList.get(position).getSongTitle());
        holder.artistName.setText(songsList.get(position).getArtistName());
        holder.duration.setText((songsList.get(position).getDuration()));
        holder.imageArtist.setImageResource(songsList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songsI.SetData(songsList.get(position));
                }
        });
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public class SongsViewHolder extends RecyclerView.ViewHolder {
        TextView songTitle, artistName, duration;
        ImageView imageArtist;

        public SongsViewHolder(@NonNull View itemView) {
            super(itemView);
            songTitle = itemView.findViewById(R.id.textView_song_title);
            artistName = itemView.findViewById(R.id.textView_artist_name);
            imageArtist = itemView.findViewById(R.id.image_artist_list);
            duration = itemView.findViewById(R.id.textView_song_duration);
        }
    }
}