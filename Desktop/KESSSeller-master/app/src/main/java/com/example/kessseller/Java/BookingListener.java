package com.example.kessseller.Java;


import com.example.kessseller.Data.DataItemBookingRoom;
import com.example.kessseller.Data.DataRecyclerViewBooking;
import com.example.kessseller.Data.DataTypeItem;

import java.util.Date;

public interface BookingListener {
    void onItemClick1(DataRecyclerViewBooking.DataRecycler dataRecycler);

    void onItemClick(DataItemBookingRoom.DataItemRoom dataItemRoom);
    void onAccept(Date date);
}
