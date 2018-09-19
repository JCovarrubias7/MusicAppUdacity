package com.example.android.musicappudacity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        // Getting Music from Music.java
        Music allMusic = new Music();
        final ArrayList<CompositionClass> music = allMusic.getMusicList();

        // Passing the ArrayList into our custom adapter
        SongAdapter adapter = new SongAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Listener for when an item is clicked from the generated list
        // This wasn't a copy but I learned it from watching
        // https://www.youtube.com/watch?time_continue=491&v=D3OP14jZcxY
        // Credit goes to Matthew Bailey
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CompositionClass currentSong = music.get(i);
                String songName = currentSong.getSong();
                String artistName = currentSong.getArtist();
                int albumImage = currentSong.getImageResourceId();
                // This will start the activity when the item is clicked
                Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("song", songName);
                nowPlayingIntent.putExtra("artist", artistName);
                nowPlayingIntent.putExtra("album", albumImage);
                startActivity(nowPlayingIntent);

            }
        });

    }
}
