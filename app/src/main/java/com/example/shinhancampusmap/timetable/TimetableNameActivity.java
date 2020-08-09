package com.example.shinhancampusmap.timetable;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.shinhancampusmap.R;

public class TimetableNameActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_name);

        Button timetable_name_cancleBtn = (Button)findViewById(R.id.timetable_name_cancleBtn);
        timetable_name_cancleBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick (View v){
                //Intent intent = new Intent(TimetableNameActivity.this, TimetableFragment.class);
                //startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.timetable_name_addBtn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.timetable_name_addBtn:
                    new AlertDialog.Builder(TimetableNameActivity.this)
                            .setMessage("추가하시겠습니까?")
                            .setPositiveButton("추가", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //Intent intent = new Intent(TimetableNameActivity.this, TimetableFragment.class);
                                    //startActivity(intent);
                                    finish();
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

