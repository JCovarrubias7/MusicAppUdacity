package com.example.android.musicappudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        // Create an array of English words
        ArrayList<CompositionClass> music = new ArrayList<>();
        music.add(new CompositionClass("Shakira", "Sale el Sol", "46:04", 15, "Rabiosa", "2:52"));
        music.add(new CompositionClass("Beyonce", "Lemonade", "45:42", 12, "Sorry", "3:52"));
        music.add(new CompositionClass("Post Malone", "Beerbongs & Bentleys", "64:26", 18, "Rockstar", "3:39"));
        music.add(new CompositionClass("Bryan Adams", "11", "47:12", 11, "Somethin' to Believe in", "4:01"));
        music.add(new CompositionClass("Justin Timberlake", "Justified", "63:15", 13, "Cry Me a River", "4:48"));
        music.add(new CompositionClass("Usher", "Confessions", "60:30", 17, "Burn", "4:16"));
        music.add(new CompositionClass("Alicia Keys", "The Diary of Alicia Keys", "57:45", 15, "If I Ain't Got You", "3:48"));
        music.add(new CompositionClass("Demi Lovato", "Confident", "38:59", 11, "Stone Cold", "3:11"));
        music.add(new CompositionClass("Ariana Grande", "Dangerous Woman", "39:31", 11, "Dangerous Woman", "3:55"));
        music.add(new CompositionClass("Bone Thugs N Harmony", "BTNHResurrection", "75:53", 16, "Change The World", "4:31"));
        music.add(new CompositionClass("Pitbull", "Globalization", "38:48", 11, "Time of Our Lives", "3:49"));
        music.add(new CompositionClass("Britney Spears", "Glory", "41:26", 12, "Slumber Party", "3:34"));
        music.add(new CompositionClass("Selena Gomez", "Stars Dance", "38:59", 11, "Come & Get It", "3:51"));
        music.add(new CompositionClass("Predro Fernandez", "Aventurero", "43:56", 12, "Yo Soy El Aventurero", "3;00"));
        music.add(new CompositionClass("Joan Sebastian", "Mas Alla Del Sol", "35:28", 12, "Eso Y Mas", "2:39"));


        AlbumAdapter adapter = new AlbumAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

