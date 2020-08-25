package com.example.kessseller.Java;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.kessseller.R;
import com.example.kessseller.XML.BookingMyorder;

public class AlertDialogRadio extends AppCompatActivity {

    LinearLayout linearLayout;
    AlertDialog alertDialog;
    CharSequence[] values = {"All","Booking Request","Booking List","Completed","Cancelled","Booking History",};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_myorder);

        linearLayout = (LinearLayout)findViewById(R.id.filterbtn);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateAlertDialogWithRadioButtonGroup();
            }
        });

    }
    public void CreateAlertDialogWithRadioButtonGroup(){
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogRadio.this);
        builder.setTitle("Selected Filter");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i){
                    case 0:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                        case 2:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                        case 3:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                        case 4:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                        case 5:
                        Toast.makeText(AlertDialogRadio.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                        break;
                }
                alertDialog.dismiss();
            }
        });
        alertDialog = builder.create();
        alertDialog.show();
    }





}
