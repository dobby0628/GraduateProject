package com.example.shinhancampusmap.campusmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.shinhancampusmap.R;

public class CampusmapFragment extends Fragment {
    private ImageButton campusmap_imagebutton_microphone;
    private EditText campusmap_edittext_destination;
    private ImageButton campusmap_imagebutton_search;
    private FrameLayout campusmap_framelayout;
    private FragmentTransaction transaction;
    private CampusmapMainFragment campusmapMainFragment;
    private CampusmapListFragment campusmapListFragment;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_campusmap, container, false);

        campusmap_imagebutton_microphone = v.findViewById(R.id.campusmap_imagebutton_microphone);
        campusmap_edittext_destination = v.findViewById(R.id.campusmap_edittext_destination);
        campusmap_imagebutton_search = v.findViewById(R.id.campusmap_imagebutton_search);
        campusmap_framelayout = v.findViewById(R.id.campusmap_framelayout);

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        campusmapMainFragment = new CampusmapMainFragment();
        campusmapListFragment = new CampusmapListFragment();
        transaction = getChildFragmentManager().beginTransaction();

        campusmap_imagebutton_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.campusmap_framelayout, campusmapListFragment).commit();
            }
        });

        transaction.replace(R.id.campusmap_framelayout, campusmapMainFragment).commit();
    }
}