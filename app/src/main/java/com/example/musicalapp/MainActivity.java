package com.example.musicalapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ArrayList<Songs> songsList = new ArrayList<>();
    TextView textViewSongName;
    ImageView imageViewArtist;
    ImageView play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewSongName=findViewById(R.id.song_title_play);
        imageViewArtist=findViewById(R.id.image_artist);
        play=findViewById(R.id.ic_play);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(new PagerAdapter(this));
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("All Songs");
                                tab.setIcon(R.drawable.all_songs);
                        break;
                    case 1:
                        tab.setText("Artists");
                        tab.setIcon(R.drawable.albums);
                        break;
                }
            }
        });
       tabLayoutMediator.attach();
    }
public void playSong(Songs song){
    if (song == null) return;
    imageViewArtist.setImageResource(song.getImage());
    textViewSongName.setText(song.getSongTitle());
       final MediaPlayer mpp = MediaPlayer.create(this, song.getSong());
       mpp.start();
    play.setImageResource(R.drawable.pause);
    play.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i=0;
            if (i%2==0){
                play.setImageResource(R.drawable.play);
                mpp.pause();
                i++;
            }else {
                play.setImageResource(R.drawable.pause);
                mpp.start();
                i++;

            }
        }
    });

}
}