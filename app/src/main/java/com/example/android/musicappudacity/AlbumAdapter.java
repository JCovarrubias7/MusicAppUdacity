package com.example.android.musicappudacity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<CompositionClass> {
    public AlbumAdapter(Activity context, ArrayList<CompositionClass> albums) {
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
                    R.layout.adapter_view_albums_grid, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        CompositionClass currentAlbum = getItem(position);

        // Find the TextView in the adapter_view_albums_grid via ID
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_grid_text_view);
        // Set this text on the artist TextView
        artistTextView.setText(currentAlbum.getArtist());

        // Find the TextView in the adapter_view_albums_grid via ID
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_grid_text_view);
        // Set this text on the album TextView
        albumTextView.setText(currentAlbum.getAlbum());

        // Find the ImageView in the adapter_view_albums_grid via ID
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_image_view);
        // Set the image on the album imageView
        iconView.setImageResource(currentAlbum.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

