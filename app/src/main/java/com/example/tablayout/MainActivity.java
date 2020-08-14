package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab = findViewById(R.id.tab);
        ViewPager pager = findViewById(R.id.pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addPager(new Fragment_1() , "1");
        adapter.addPager(new Fragment_2() , "2");
        adapter.addPager(new Fragment_3() , "3");
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);
    }
}