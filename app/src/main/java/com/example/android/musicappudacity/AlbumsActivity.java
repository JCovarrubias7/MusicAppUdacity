package com.example.android.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        // Getting Music from Music.java
        Music allMusic = new Music();
        final ArrayList<CompositionClass> music = allMusic.getMusicList();

        // Passing the ArrayList into our custom adapter
        AlbumAdapter adapter = new AlbumAdapter(this, music);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(adapter);

    }
}