package com.example.shinhancampusmap.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.shinhancampusmap.R;

public class TimetableFragment extends Fragment {

    ImageView timetable_main_addBtn, timetable_main_nameBtn;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timetable, container, false);

        timetable_main_nameBtn = (ImageView) view.findViewById(R.id.timetable_main_nameBtn);
        timetable_main_nameBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TimetableNameActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        timetable_main_addBtn = (ImageView) view.findViewById(R.id.timetable_main_addBtn);
        timetable_main_addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TimetableSearchActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        return view;
    }
}



