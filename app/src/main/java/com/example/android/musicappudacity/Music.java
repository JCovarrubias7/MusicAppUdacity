package com.example.android.musicappudacity;

public class Music {

    /** Set the state of the class */

    // Album name
    private String mMusicAlbum;

    // Song title
    private String mMusicSong;

    /** Constructor, used to create the object with the required inputs the caller has to pass in */

    public Music(String album, String song) {
        mMusicAlbum = album;
        mMusicSong = song;
    }

    /** Set methods to get information from this class */

    // Get default translation of the word
    public String getAlbum() {
        return mMusicAlbum;
    }

    // Get Miwork translation of the word
    public String getSong() {
        return mMusicSong;
    }
}
