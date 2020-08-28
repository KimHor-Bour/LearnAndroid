package com.example.kessseller.Java;


import com.example.kessseller.Data.DataRecyclerViewStatus;

import java.util.Date;

public interface BookingListener {
    void onItemClick(DataRecyclerViewStatus.DataStatus dataStatus);
    void onAccept(Date date);
}
