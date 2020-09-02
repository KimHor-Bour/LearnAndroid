package com.example.kessseller.XML;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.kessseller.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ITemTabType extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_items);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.navi_dashboard:
                break;
            case R.id.navi_myorder:
                startActivity(new Intent(this,BookingScreen.class));
                break;
            case R.id.navi_myitems:
                break;
            case R.id.navi_cupon:
                break;
            case R.id.navi_account:
                break;
        }
        return false;
    }
}
