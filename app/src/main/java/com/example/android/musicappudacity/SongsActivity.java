package com.example.android.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
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

    }
}
