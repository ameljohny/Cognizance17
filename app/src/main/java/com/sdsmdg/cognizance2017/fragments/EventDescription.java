package com.sdsmdg.cognizance2017.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdsmdg.cognizance2017.R;

public class EventDescription extends Fragment {


    public static EventDescription newInstance(int page, int choice) {
        EventDescription fragment = new EventDescription();
        Bundle args = new Bundle();
        //page is 0 indexed, to get Day number add 1 to it
        args.putInt("Page Number", page);
        args.putInt("choice", choice);
        fragment.setArguments(args);
        return fragment;
    }
    public EventDescription() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_description, container, false);


        return view;
    }

}
