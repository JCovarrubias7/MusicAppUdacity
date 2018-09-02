package com.example.android.musicappudacity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<CompositionClass> {
    public SongAdapter(Activity context, ArrayList<CompositionClass> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.adapter_view_songs_layout, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        CompositionClass currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songTextView.setText(currentAlbum.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText(currentAlbum.getArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songLengthTextView = (TextView) listItemView.findViewById(R.id.length_of_song_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songLengthTextView.setText(currentAlbum.getSongLength());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

