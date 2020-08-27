package com.example.kessseller.XML;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Java.BookingListener;
import com.example.kessseller.Java.ButtonSheetDateandTime;
import com.example.kessseller.Java.DataRecyclerViewStatus;
import com.example.kessseller.Java.RecyclerAdapterStatus;
import com.example.kessseller.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class StatusMyorder extends Fragment implements View.OnClickListener {
    LinearLayout linearLayout;
    AlertDialog alertDialog;
    String[] values = {"Table","Room","Event",};
    TextView textView;
    List<DataRecyclerViewStatus.DataStatus> statuses;
    //    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    Context context;


    private BookingListener bookingListener = new BookingListener() {
        @Override
        public void onAccept(Date date) {
            TextView datetv = linearLayout.findViewById(R.id.txt_selecteddate);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE dd MMM hh:mm a");
            datetv.setText(simpleDateFormat.format(date).toString());
        };
    };



    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.status_myorder, container, false);
        DataRecyclerViewStatus dataRecyclerViewStatus = new DataRecyclerViewStatus();
        statuses = dataRecyclerViewStatus.getData();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_restatus);

        textView = rootView.findViewById(R.id.type_status);
        textView.setText(values[0]);

        RecyclerAdapterStatus recyclerAdapterStatus = new RecyclerAdapterStatus(statuses);
        recyclerView.setAdapter(recyclerAdapterStatus);

        RecyclerAdapterStatus recyclerAdapterStatus1 = new RecyclerAdapterStatus(statuses);
        recyclerView.setAdapter(recyclerAdapterStatus);
        linearLayout = (LinearLayout)rootView.findViewById(R.id.filterbtntype);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCreateDialog(savedInstanceState);
            }

        });

        linearLayout = rootView.findViewById(R.id.date_time_picker);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonSheetDateandTime buttonSheetDateandTime = new ButtonSheetDateandTime(context);
                buttonSheetDateandTime.bookingListener = bookingListener;
                buttonSheetDateandTime.show(getFragmentManager(),ButtonSheetDateandTime.class.getSimpleName());
            }
        });

        return rootView;
    }

    private Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selecte Filter");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                textView.setText(values[0]);
                TextView textView = (TextView)getActivity().findViewById(R.id.type_status);
                textView.setText(values[i]);
                dialogInterface.dismiss();
            }
        });
        builder.create();
        return builder.show();

    }

    @Override
    public void onClick(View view) {
    }

}