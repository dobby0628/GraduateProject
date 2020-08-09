package com.example.shinhancampusmap.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shinhancampusmap.R;

public class TimetableSearchActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_search);

        Button timetable_search_addBtn = (Button) findViewById(R.id.timetable_search_addBtn);

        timetable_search_addBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TimetableSearchActivity.this, TimetableAddActivity.class);
                startActivity(intent);
            }
        });

        ImageButton timetable_search_cancleBtn = (ImageButton) findViewById(R.id.timetable_search_cancleBtn);

        timetable_search_cancleBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TimetableSearchActivity.this, TimetableFragment.class);
                startActivity(intent);
            }
        });

    }

}
