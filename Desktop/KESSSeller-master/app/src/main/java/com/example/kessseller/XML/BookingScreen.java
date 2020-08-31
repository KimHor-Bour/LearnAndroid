package com.example.kessseller.XML;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.kessseller.Java.Viewpager;
import com.example.kessseller.R;
import com.google.android.material.tabs.TabLayout;

public class BookingScreen extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Viewpager viewpagerAdapter;
    private OrderMyorder tab1;
    private BookingMyorder tab2;
    private StatusMyorderBooking tab3;

    LinearLayout filter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar);

        //Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //set the Toolbar tto act as the Action bar for this activity window
        //make sure the toolbar exists in the activity  and is not null
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        viewpagerAdapter = new Viewpager(getSupportFragmentManager());
         tab1= new OrderMyorder();
         tab2 = new BookingMyorder();
         tab3 = new StatusMyorderBooking();

        viewpagerAdapter.addItem(tab1, "Order");
        viewpagerAdapter.addItem(tab2, "Booking");
        viewpagerAdapter.addItem(tab3, "Status");
        viewPager.setAdapter(viewpagerAdapter);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }
    //Menu icons are inflated just as they were with actionbar

}
