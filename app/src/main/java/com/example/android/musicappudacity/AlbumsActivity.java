package com.example.android.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        // Create an array of English words
        ArrayList<Music> albums = new ArrayList<>();
        albums.add(new Music("Jams 2018", "Shakira"));
        albums.add(new Music("Jams 2018", "Beyonce"));
        albums.add(new Music("Jams 2018", "Post Malone"));
        albums.add(new Music("Jams 2018", "Bryan"));
        albums.add(new Music("Jams 2018", "Justin Timberlake"));
        albums.add(new Music("Jams 2018", "Usher"));
        albums.add(new Music("Jams 2018", "Alicia Keys"));
        albums.add(new Music("Jams 2018", "Demi Lovato"));
        albums.add(new Music("Jams 2018", "Ariana Grande"));
        albums.add(new Music("Jams 2018", "Bone Thugs"));
        albums.add(new Music("Jams 2018", "Pitbull"));
        albums.add(new Music("Jams 2018", "Britney Spears"));
        albums.add(new Music("Jams 2018", "Selina Gomez"));
        albums.add(new Music("Jams 2018", "Predro Fernandez"));
        albums.add(new Music("Jams 2018", "Joan Sebastian"));


        MusicAdapter adapter = new MusicAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

