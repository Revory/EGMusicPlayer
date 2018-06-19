package com.example.android.egmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import android.util.Log;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

    // the <Word> comes from the Word.java file.
    ArrayList<Word> songs = new ArrayList<Word>();


;
        songs.add(new Word("A little More", "Machine Gun Kelly"));
        songs.add(new Word("Again", "Flyleaf"));
        songs.add(new Word("All Around Me", "Flyleaf"));
        songs.add(new Word("Around the World", "The Game"));
        songs.add(new Word("All the Way Up", "Fat Joe"));
        songs.add(new Word("Block of Rock", "SPM"));
        songs.add(new Word("Bring Me to Life", "Evanescene"));
        songs.add(new Word("Can I", "Alina Baraz & Galimatias"));
        songs.add(new Word("Nine", "Reverie"));
        songs.add(new Word("Deer Dance", "System of a Down"));

        songs.add(new Word("Don't Matter", "Akon"));
        songs.add(new Word("Eddie Cane", "Machine Gun Kelly"));
        songs.add(new Word("Unforgettable", "French Montana"));
        songs.add(new Word("Everything at Once", "Lenka"));
        songs.add(new Word("Faded", "Zhu"));
        songs.add(new Word("When you were young", "The Killers"));
        songs.add(new Word("If I Die", "SPM"));
        songs.add(new Word("Ill Mind Of Hopsin 7", "Hopsin"));
        songs.add(new Word("In the Dark", "Flyleaf"));
        songs.add(new Word("Legacy", "Eminem"));

        //connects to the id property in activity_songs.xml
        // - this is the square that the song names are stored in

        WordAdapter adapter = new WordAdapter(this, songs);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);




    }
}
