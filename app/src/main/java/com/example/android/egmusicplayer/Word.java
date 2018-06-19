package com.example.android.egmusicplayer;


// Represents the vocabulary word that the user wants to learn
// As well as the default(English) translation
// Also contains the Miwok translation


public class Word {

    private String mSongName;
    private String mArtistName;


    // Public WOrd class
    public Word(String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }

    // Method to get the translation
    public String getDefaultSong() {
        return mSongName;
    }

    // Method to get miwok translation
    public String getSongArtist() {
        return mArtistName;
    }




}
