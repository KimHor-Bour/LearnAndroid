package com.example.kessseller.Data;

import java.util.ArrayList;
import java.util.List;

public class DataItemBookingEvent {
    public class DataItemEvent{
        //data items of table
        public String event_name;
        public String ticket;
        public String ticket_price;
        public String special_price_event;
        public String start_date_event;
        public String end_date_event;
        public String description_event;

        DataItemEvent(String event_name, String ticket, String ticket_price,String special_price_event,String start_date_event, String end_date_event,String description_event){
            this.event_name = event_name;
            this.ticket = ticket;
            this.ticket_price = ticket_price;
            this.special_price_event = special_price_event;
            this.start_date_event= start_date_event;
            this.end_date_event = end_date_event;
            this.description_event = description_event;
        }

    }
    public DataItemBookingEvent(){
        initDataItemTable();
    }

    private List<DataItemEvent> dataItemEvents;
    private  void initDataItemTable(){
        dataItemEvents = new ArrayList<>();
        dataItemEvents.add(new DataItemEvent("Buffet","200","$20","$15","19/09/2020","20/08/2020","write description about event"));
        dataItemEvents.add(new DataItemEvent("white Party","500","$40","$20","19/09/2020","20/08/2020","write description about event"));
        dataItemEvents.add(new DataItemEvent("Lovely Day","350","$15.5","$10","19/09/2020","20/08/2020","write description about event"));
        dataItemEvents.add(new DataItemEvent("Dinner Time","290","$20","$10","19/09/2020 ","20/08/2020","write description about event"));
        dataItemEvents.add(new DataItemEvent("Red Light","50","$80","$70","19/09/2020","20/08/2020","write description about event"));
    }

    public List<DataItemEvent> getData_eventitem(){return  dataItemEvents;}

}
