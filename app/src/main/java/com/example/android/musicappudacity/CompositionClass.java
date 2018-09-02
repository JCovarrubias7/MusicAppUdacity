package com.example.android.musicappudacity;

import android.content.Intent;

public class CompositionClass {

    /** Set the state of the class */

    // Artist name
    private String mArtistName;

    // Album name
    private String mArtistAlbum;

    // Album Track Total
    private int mAlbumTotalTracks;

    // Album Length
    private String mAlbumLength;

    // Song title
    private String mAlbumSong;

    // Song length in minutes and seconds
    private String mSongLength;

    /** Constructor, used to create the object with the required inputs the caller has to pass in */

    public CompositionClass(String artist, String album, String albumlength, int tracks, String song, String length) {
        mArtistName = artist;
        mArtistAlbum = album;
        mAlbumLength = albumlength;
        mAlbumTotalTracks = tracks;
        mAlbumSong = song;
        mSongLength = length;
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

    // Get  Album Length
    public String getAlbumLength() {
        return mAlbumLength;
    }

    // Get  Album
    public int getTotalTracks() {
        return mAlbumTotalTracks;
    }

    // Get Song
    public String getSong() {
        return mAlbumSong;
    }

    // Get Song
    public String getSongLength() {
        return mSongLength;
    }

}
