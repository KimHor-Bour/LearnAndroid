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






//    //Declaring the interface, to invoke a callback function in the implementing activity class
//    AlertPositiveListener alertPositiveListener;
//
//    public void show(FragmentManager manager, String alert_dialog_radio) {
//    }
//
//    //An interface to be implemented in the hosting activity for "OK" button click Listener
//    interface AlertPositiveListener{
//        public void onPositiveClick(int position);
//    }
//
//    //This is a callback method executed when this fragment is attached to an activity.
//    //This function ensurses that, the hosting activity implements the interface AlertPositiveListener
//    public void onAttach(android.app.Activity activity){
//        super.onAttach(activity);
//        try{
//            alertPositiveListener = (AlertPositiveListener) activity;
//        }catch (ClassCastException e){
//            //The hosting activity does not implement the interface AlertPositiveListener
//            throw new ClassCastException(activity.toString() + " must implement AlertPositiveListener");
//        }
//    }
//    //This is the OK button listener for the alert dialog, which in turn invokes the method onPositiveClick(position)
//    //of the hosting activity which is supposed to implement it
//    DialogInterface.OnClickListener positiveListener = new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialogInterface, int which) {
//            AlertDialog alertDialog = (AlertDialog) dialogInterface;
//            int position = alertDialog.getListView().getCheckedItemPosition();
//            alertPositiveListener.onPositiveClick(position);
//        }
//    };
//
//    //This is a callback method which will be executed on creating this fragment
//
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//
//        //getting the arguments passed to this fragment
//        Bundle bundle = getArguments();
//        int position = bundle.getInt("position");
//
//        //Creating a builder for the alert dialog window
//        AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
//
//        //setting a title item's index in the b
//        b.setTitle("Select Filters");
//
//        //Setting items to the alert dialog
//        b. setP(AlertString.code, position, positiveListener);
//
//        //creating the alert dialog window using the builder
//        AlertDialog d = b.create();
//        return d;
//    }
}
