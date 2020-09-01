package com.example.kessseller.Data;

import java.util.ArrayList;
import java.util.List;

public class DataItemBookingRoom {
    public class DataItemRoom{
        //data items of table
        public String room_number;
        public String floor;
        public String num_people;
        public String price_table;
        public String special_price_room;
        public String description_room;
        public String deposit_room;

        DataItemRoom(String room_number, String floor, String num_people,String price_table,String special_price_room, String description_room,String deposit_room){
            this.room_number = room_number;
            this.floor = floor;
            this.num_people = num_people;
            this.price_table = price_table;
            this.special_price_room= special_price_room;
            this.description_room = description_room;
            this.deposit_room = deposit_room;
        }

    }
    public DataItemBookingRoom(){
        initDataItemTable();
    }

    private List<DataItemRoom> data_tableitem;
    private  void initDataItemTable(){
        data_tableitem = new ArrayList<>();
        data_tableitem.add(new DataItemRoom("Room Number 01","Ground floor","2","$10","$8","write description about table","10%"));
        data_tableitem.add(new DataItemRoom("Room Number 02","1st floor","4","$10","$8","write description about table","10%"));
        data_tableitem.add(new DataItemRoom("Room Number 03","1st floor","2","$0","$8","write description about table","10%"));
        data_tableitem.add(new DataItemRoom("Room Number 04","2rd floor","2","$10"," ","write description about table","10%"));
        data_tableitem.add(new DataItemRoom("Room Number 05","2rd floor","8","$10","$8","write description about table","10%"));
    }

    public List<DataItemRoom> getData_tableitem(){return  data_tableitem;}

}
