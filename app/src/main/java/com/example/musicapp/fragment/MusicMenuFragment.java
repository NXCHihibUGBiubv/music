package com.example.musicapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.musicapp.R;

import androidx.fragment.app.Fragment;

public class MusicMenuFragment extends Fragment implements View.OnClickListener {
    private View view;


    private ImageView play_mode;
    private ImageView previous_music;
    private ImageView play_music;
    private ImageView next_music;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_music_menu,container,false);
        play_music = view.findViewById(R.id.play_music);
        play_mode = view.findViewById(R.id.play_mode);
        previous_music = view.findViewById(R.id.previous_music);
        next_music = view.findViewById(R.id.next_music);
        play_mode.setOnClickListener(this);
        previous_music.setOnClickListener(this);
        play_music.setOnClickListener(this);
        next_music.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }
    }
}
