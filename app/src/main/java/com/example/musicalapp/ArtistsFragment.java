package com.example.musicalapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Songs> artists = new ArrayList<>();

    public ArtistsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artists, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AdapterArtist adapterSongs =new AdapterArtist(getContext(),artists);
        recyclerView =view.findViewById(R.id.recycler_view_artist);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapterSongs);
        setArtists();

    }
    public void setArtists() {
        artists.add(new Songs(R.drawable.amr_diab,"Amr diab"));
        artists.add(new Songs(R.drawable.fayrouz,"Fayrouz"));
        artists.add(new Songs(R.drawable.hesham_kharma,"Hesham Kharma"));
        artists.add(new Songs(R.drawable.hussain_al_gasmy,"Hussain Al_Ggasmy"));
        artists.add(new Songs(R.drawable.mohamed_munir,"Mohamed Munir"));
        artists.add(new Songs(R.drawable.nancy_ajram,"Nancy Ajram"));
        artists.add(new Songs(R.drawable.amr_diab,"Amr diab"));
        artists.add(new Songs(R.drawable.fayrouz,"Fayrouz"));
        artists.add(new Songs(R.drawable.hesham_kharma,"Hesham Kharma"));
        artists.add(new Songs(R.drawable.hussain_al_gasmy,"Hussain Al_Ggasmy"));
        artists.add(new Songs(R.drawable.mohamed_munir,"Mohamed Munir"));
        artists.add(new Songs(R.drawable.nancy_ajram,"Nancy Ajram"));
    }


}