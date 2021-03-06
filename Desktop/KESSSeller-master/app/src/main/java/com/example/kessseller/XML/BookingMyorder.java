package com.example.kessseller.XML;
import android.app.AlertDialog;
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
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kessseller.Data.DataItemBookingRoom;
import com.example.kessseller.Data.DataRecyclerViewBooking;
import com.example.kessseller.Adapter.RecyclerAdapterBooking;
import com.example.kessseller.Java.BTSDataStatus;
import com.example.kessseller.Java.BookingListener;
import com.example.kessseller.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class BookingMyorder extends DialogFragment implements View.OnClickListener {
    LinearLayout linearLayout;
    AlertDialog alertDialog;
    String[] values = {"All","Booking Request","Booking List","Completed","Cancelled","Booking History",};
    TextView textView;
    List<DataRecyclerViewBooking.DataRecycler> datas;
    //    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }
    private BookingListener bookingListener = new BookingListener() {
        @Override
        public void onItemClick1(DataRecyclerViewBooking.DataRecycler dataRecycler) {
//            System.out.print("click");
            BTSDataStatus btsDataStatus = new BTSDataStatus(context);
            btsDataStatus.show(getFragmentManager(),BTSDataStatus.class.getSimpleName());

        }

        @Override
        public void onItemClick(DataItemBookingRoom.DataItemRoom dataItemRoom) {

        }

        @Override
        public void onAccept(Date date) {
              };
    };


    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.booking_myorder, container, false);
        DataRecyclerViewBooking dataRecyclerViewBooking = new DataRecyclerViewBooking();
        datas = dataRecyclerViewBooking.getData();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_rebooking);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);
        textView = rootView.findViewById(R.id.txtfilter);
        textView.setText(values[0]);

        RecyclerAdapterBooking recyclerAdapter = new RecyclerAdapterBooking(datas);
        recyclerView.setAdapter(recyclerAdapter);
        linearLayout = (LinearLayout)rootView.findViewById(R.id.filterbtn);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCreateDialog(savedInstanceState);
            }
        });
        return rootView;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selected Filter");
        builder.setSingleChoiceItems(values,-1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                textView.setText(values[0]);
                TextView txt = (TextView)getActivity().findViewById(R.id.txtfilter);
                txt.setText(values[i]);
                dialogInterface.dismiss();
            };
        });
        builder.create();
        return builder.show();
    }
    @Override
    public void onClick(View view) {
    }
}