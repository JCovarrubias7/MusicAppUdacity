package com.example.android.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.now_playing_layout);

        String songName = getIntent().getStringExtra("song");
        String artistName = getIntent().getStringExtra("artist");
        int albumImage = getIntent().getIntExtra("album",0);

        TextView songTextView = (TextView) findViewById(R.id.now_playing_song_view);
        // Set this text on the artist TextView
        songTextView.setText(songName);

        TextView artistTextView = (TextView) findViewById(R.id.now_playing_artist_view);
        // Set this text on the artist TextView
        artistTextView.setText(artistName);

        // Find the ImageView in the adapter_view_albums_grid via ID
        ImageView albumView = (ImageView) findViewById(R.id.now_playing_image_view);
        // Set the image on the album imageView
        albumView.setImageResource(albumImage);

    }
}
