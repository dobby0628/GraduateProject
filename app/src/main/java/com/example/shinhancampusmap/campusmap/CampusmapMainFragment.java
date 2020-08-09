package com.example.shinhancampusmap.campusmap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.shinhancampusmap.CampusmapBuildingFragment;
import com.example.shinhancampusmap.R;

public class CampusmapMainFragment extends Fragment {
    private ImageButton campusmap_main_imageview;
    private FragmentTransaction transaction;
    private CampusmapBuildingFragment campusmapBuildingFragment;

    public CampusmapMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_campusmap_main, container, false);

//        campusmap_main_imageview = v.findViewById(R.id.campusmap_main_imageview);
//
//        campusmap_main_imageview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                transaction = getChildFragmentManager().beginTransaction();
//                transaction.replace(R.id.campusmap_framelayout, campusmapBuildingFragment).commit();
//            }
//        });

        return v;
    }
}