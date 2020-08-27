package com.example.kessseller.XML;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kessseller.Java.AlertDialogRadio;
import com.example.kessseller.Java.Recycler1;
import com.example.kessseller.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity{

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.booking_detail_view_seller);
   }

}