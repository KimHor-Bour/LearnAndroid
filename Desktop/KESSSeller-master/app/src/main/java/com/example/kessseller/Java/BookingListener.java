package com.example.kessseller.Java;


import com.example.kessseller.Data.DataItemBookingRoom;

import java.util.Date;

public interface BookingListener {
    void onItemClick(DataItemBookingRoom.DataItemRoom dataItemRoom);
    void onAccept(Date date);
}
