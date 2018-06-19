package com.example.android.egmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.util.Log;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // the <Word> comes from the Word.java file.
        ArrayList<Word> songs = new ArrayList<Word>();

        songs.add(new Word("Abra kababra,", "French Montana"));
        songs.add(new Word("Two of a kind", "Heliko"));
        songs.add(new Word("Three", "Tolookosu"));
        songs.add(new Word("Famous", "French Montana"));
        songs.add(new Word("Five", "massokka"));
        songs.add(new Word("Six", "temmokka"));
        songs.add(new Word("Seven", "Kenekako"));
        songs.add(new Word("Eight", "Kawinta"));
        songs.add(new Word("Nine", "Wo'e"));
        songs.add(new Word("Ten", "Na'aacha"));

        songs.add(new Word("Abra kababra,", "French Montana"));
        songs.add(new Word("Two of a kind", "Heliko"));
        songs.add(new Word("Three", "Tolookosu"));
        songs.add(new Word("Four", "oyyisa"));
        songs.add(new Word("Five", "massokka"));
        songs.add(new Word("When you were young", "The Killers"));
        songs.add(new Word("Seven", "Kenekako"));
        songs.add(new Word("Eight", "Kawinta"));
        songs.add(new Word("Nine", "Wo'e"));
        songs.add(new Word("Ten", "Na'aacha"));

        //connects to the id property in activity_songs.xml
        // - this is the square that the song names are stored in

        WordAdapter adapter = new WordAdapter(this, songs);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);




    }
}
