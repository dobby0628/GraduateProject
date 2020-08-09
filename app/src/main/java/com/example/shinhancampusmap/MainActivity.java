package com.example.shinhancampusmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.shinhancampusmap.bus.BusFragment;
import com.example.shinhancampusmap.campusmap.CampusmapFragment;
import com.example.shinhancampusmap.link.LinkFragment;
import com.example.shinhancampusmap.timetable.TimetableFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private CampusmapFragment fragmentCampusmap = new CampusmapFragment();
    private BusFragment fragmentBus = new BusFragment();
    private TimetableFragment fragmentTimetable = new TimetableFragment();
    private LinkFragment fragmentLink = new LinkFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentCampusmap).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.campusmapItem:
                    transaction.replace(R.id.frameLayout, fragmentCampusmap).commitAllowingStateLoss();
                    break;
                case R.id.busItem:
                    transaction.replace(R.id.frameLayout, fragmentBus).commitAllowingStateLoss();
                    break;
                case R.id.timetableItem:
                    transaction.replace(R.id.frameLayout, fragmentTimetable).commitAllowingStateLoss();
                    break;
                case R.id.linkItem:
                    transaction.replace(R.id.frameLayout, fragmentLink).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}