package com.example.kessseller.XML;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.kessseller.Java.ItemDataTypeEvent;
import com.example.kessseller.Java.ItemDataTypeRoom;
import com.example.kessseller.Java.ItemDataTypeTable;
import com.example.kessseller.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationScreen extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_bar_user);

        loadFragment(new BookingMyorder());
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.navi_dashboard:
                fragment = new StatusMyorderBooking();
                break;
            case R.id.navi_myorder:
                fragment = new BookingMyorder();
                break;
            case R.id.navi_myitems:
                fragment = new MyItemsBooking();
                break;
            case R.id.navi_cupon:
                fragment = new ItemDataTypeRoom();
                break;
            case R.id.navi_account:
                fragment = new ItemDataTypeEvent();
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
}
