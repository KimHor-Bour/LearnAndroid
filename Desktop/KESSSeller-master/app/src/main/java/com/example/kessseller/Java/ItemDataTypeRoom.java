package com.example.kessseller.Java;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Adapter.AdapterOfItemRoom;
import com.example.kessseller.Data.DataItemBookingRoom;
import com.example.kessseller.Data.DataItemTableBooking;
import com.example.kessseller.Adapter.AdapterOfItemTable;
import com.example.kessseller.R;

import java.util.List;

public class ItemDataTypeRoom extends Fragment {
    RecyclerView recyclerView;
    List<DataItemBookingRoom.DataItemRoom> dataItemRooms;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_data,container,false);
        DataItemBookingRoom dataItemBookingRoom = new DataItemBookingRoom();
        dataItemRooms = dataItemBookingRoom.getData_roomitem();
        recyclerView = (RecyclerView)view.findViewById(R.id.re_item);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterOfItemRoom adapterOfItemRoom = new AdapterOfItemRoom(dataItemRooms);
        recyclerView.setAdapter(adapterOfItemRoom);

//        TextView tv = (TextView)view.findViewById(R.id.room_price);
//        tv.setText("Hello");
//        tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        return view;

    }
}
