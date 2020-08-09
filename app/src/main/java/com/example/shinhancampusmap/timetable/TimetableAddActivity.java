package com.example.shinhancampusmap.timetable;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.shinhancampusmap.R;

public class TimetableAddActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_add);

        Button timetable_add_cancleBtn = (Button) findViewById(R.id.timetable_add_cancleBtn);
        timetable_add_cancleBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick (View v){
                Intent intent = new Intent(TimetableAddActivity.this, TimetableSearchActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.timetable_add_addBtn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.timetable_add_addBtn:
                    new AlertDialog.Builder(TimetableAddActivity.this)
                            .setMessage("추가하시겠습니까?")
                            .setPositiveButton("추가", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(TimetableAddActivity.this, TimetableSearchActivity.class);
                                    startActivity(intent);
                                }
                            })
                            .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                    break;
            }
        }
    };
}