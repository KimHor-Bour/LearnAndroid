package com.example.kessseller.XML;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Java.AlertDialogRadio;
import com.example.kessseller.Java.DataRecyclerView;
import com.example.kessseller.Java.RecyclerAdapter;
import com.example.kessseller.R;

import java.util.ArrayList;
import java.util.List;

public class BookingMyorder extends Fragment{
    LinearLayout linearLayout;
    AlertDialog alertDialog;
    CharSequence[] values = {"All","Booking Request","Booking List","Completed","Cancelled","Booking History",};

    List<DataRecyclerView.DataRecycler> data;
    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.booking_myorder,container,false);

//        linearLayout = (LinearLayout)rootView.findViewById(R.id.filterbtn);
//
//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                CreateAlertDialogWithRadioButtonGroup();
//            }
//        });

                DataRecyclerView dataRecyclerView = new DataRecyclerView();
        data = dataRecyclerView.getData();

        recyclerView = (RecyclerView)rootView.findViewById(R.id.my_rebooking);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);


        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(data);
        recyclerView.setAdapter(recyclerAdapter);

        AlertDialogRadio alertDialogRadio = new AlertDialogRadio();

    return  rootView;



    }
//    public void CreateAlertDialogWithRadioButtonGroup(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Selected Filter");
//        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                switch (i){
//                    case 0:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                    case 1:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                        case 2:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                        case 3:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                        case 4:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                        case 5:
//                        Toast.makeText(BookingMyorder.this, "First Item Clicked", Toast.LENGTH_LONG).show();
//                        break;
//                }
//                alertDialog.dismiss();
//            }
//        });
//        alertDialog = builder.create();
//        alertDialog.show();
//    }
////
////    @Override
////    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
}
