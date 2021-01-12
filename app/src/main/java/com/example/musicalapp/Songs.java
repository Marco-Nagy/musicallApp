package com.example.musicalapp;

public class Songs {
  private   int image;
  private   String songTitle;
  private   String artistName;
  private   int song;
  private   String duration;

    public Songs() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Songs(int image, String songTitle, String artistName, int song, String duration) {
        this.image = image;
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.song = song;
        this.duration = duration;
    }

    public Songs(int image, String artistName) {
        this.image = image;
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "image=" + image +
                ", songTitle='" + songTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                ", song=" + song +
                ", duration='" + duration + '\'' +
                '}';
    }
}
