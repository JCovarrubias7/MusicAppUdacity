package com.example.android.musicappudacity;

import android.content.Intent;

public class CompositionClass {

    /** Set the state of the class */

    // Artist name
    private String mArtistName;

    // Album name
    private String mArtistAlbum;

    // Song title
    private String mAlbumSong;

    // Song length in minutes:seconds
    private String mSongLength;

    // Image resource id to display album art
    private int mImageResourceId;

    /** Constructor, used to create the object with the required inputs the caller has to pass in */

    public CompositionClass(String artist, String album, String song, String length, int imageResourceId) {
        mArtistName = artist;
        mArtistAlbum = album;
        mAlbumSong = song;
        mSongLength = length;
        mImageResourceId = imageResourceId;
    }

    /** Set methods to get information from this class */

    // Get  Album
    public String getArtist() {
        return mArtistName;
    }

    // Get  Album
    public String getAlbum() {
        return mArtistAlbum;
    }

    // Get Song
    public String getSong() {
        return mAlbumSong;
    }

    // Get Song
    public String getSongLength() {
        return mSongLength;
    }

    //Get Image
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
