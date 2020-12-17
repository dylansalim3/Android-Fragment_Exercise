package com.example.fragmentviajava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentPenguin extends Fragment {

    public FragmentPenguin() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_penguin, container, false);
        TextView TVPenguin = (TextView) view.findViewById(R.id.TVPenguin);
        TVPenguin.setText("Penguin");
        return view;

    }
}