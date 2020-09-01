package com.example.kessseller.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Data.DataItemBookingEvent;
import com.example.kessseller.Data.DataItemBookingRoom;
import com.example.kessseller.Data.DataItemTableBooking;
import com.example.kessseller.R;

import java.util.List;

public class AdapterOfItemEvent extends RecyclerView.Adapter<AdapterOfItemEvent.DataViewHolder> {
    List<DataItemBookingEvent.DataItemEvent> dataItemEvents;
    public AdapterOfItemEvent(List<DataItemBookingEvent.DataItemEvent> dataItemEvents) {
        this.dataItemEvents=dataItemEvents;

    }


    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_table, parent , false);
        DataViewHolder dataViewHolder = new DataViewHolder(v);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int position) {
        dataViewHolder.dataEventName.setText(dataItemEvents.get(position).event_name);
        dataViewHolder.dataTicket.setText(dataItemEvents.get(position).ticket);
        dataViewHolder.dataPrice.setText(dataItemEvents.get(position).ticket_price);
        dataViewHolder.dataSpecialPrice.setText(dataItemEvents.get(position).special_price_event);
        dataViewHolder.dataStartDate.setText(dataItemEvents.get(position).start_date_event);
        dataViewHolder.dataEndDate.setText(dataItemEvents.get(position).end_date_event);

    }



    @Override
    public int getItemCount() {
        return dataItemEvents.size();
//        return 0;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView dataEventName;
        TextView dataTicket;
        TextView dataPrice;
        TextView dataSpecialPrice;
        TextView dataStartDate;
        TextView dataEndDate;
//        TextView dataDescription;

        DataViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_event_id);
            dataEventName = (TextView)itemView.findViewById(R.id.event_name);
            dataTicket = (TextView)itemView.findViewById(R.id.ticket);
            dataPrice = (TextView)itemView.findViewById(R.id.event_price);
            dataSpecialPrice = (TextView)itemView.findViewById(R.id.event_special_price);
            dataStartDate = (TextView)itemView.findViewById(R.id.start_date_event);
            dataEndDate = (TextView)itemView.findViewById(R.id.end_date);
//            dataDescription = (TextView)itemView.findViewById(R.id.);

        }
    }
}
