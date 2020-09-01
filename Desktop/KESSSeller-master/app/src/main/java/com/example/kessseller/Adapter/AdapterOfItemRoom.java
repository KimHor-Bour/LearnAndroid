package com.example.kessseller.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Data.DataItemBookingRoom;
import com.example.kessseller.Data.DataItemTableBooking;
import com.example.kessseller.R;

import java.util.List;

public class AdapterOfItemRoom extends RecyclerView.Adapter<AdapterOfItemRoom.DataViewHolder> {
    List<DataItemBookingRoom.DataItemRoom> dataItemRooms;
    public AdapterOfItemRoom(List<DataItemBookingRoom.DataItemRoom> dataItemRooms) {
        this.dataItemRooms=dataItemRooms;

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
        dataViewHolder.dataRoomNum.setText(dataItemRooms.get(position).room_number);
        dataViewHolder.dataNumPeople.setText(dataItemRooms.get(position).num_people);
//        dataViewHolder.dataFloor.setText(dataItemTables.get(position).floor);
        dataViewHolder.dataPrice.setText(dataItemRooms.get(position).price_table);
        dataViewHolder.dataSpecialPrice.setText(dataItemRooms.get(position).special_price_room);
//        dataViewHolder.dataShap.setText(dataItemRooms.get(position).shape_table);
        dataViewHolder.dataDepositRoom.setText(dataItemRooms.get(position).deposit_room);

    }



    @Override
    public int getItemCount() {
        return dataItemRooms.size();
//        return 0;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView dataRoomNum;
//        TextView dataFloor;
        TextView dataNumPeople;
        TextView dataPrice;
        TextView dataSpecialPrice;
        TextView dataShap;
        TextView dataDepositRoom;

        DataViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_table_id);
            dataRoomNum = (TextView)itemView.findViewById(R.id.table_num);
//            dataFloor = (TextView)itemView.findViewById(R.id.table_floor);
            dataNumPeople = (TextView)itemView.findViewById(R.id.table_num_people);
            dataPrice = (TextView)itemView.findViewById(R.id.table_price);
            dataSpecialPrice = (TextView)itemView.findViewById(R.id.table_special_price);
            dataShap = (TextView)itemView.findViewById(R.id.table_shape);
            dataDepositRoom = (TextView)itemView.findViewById(R.id.table_deposit);

        }
    }
}
