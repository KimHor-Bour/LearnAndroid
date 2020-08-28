package com.example.kessseller.Java;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.Data.DataRecyclerViewStatus;
import com.example.kessseller.R;

import java.util.List;


public class RecyclerAdapterStatus extends RecyclerView.Adapter<RecyclerAdapterStatus.DataViewHolder> {
    List<DataRecyclerViewStatus.DataStatus> status;
    BookingListener bookinglistener;

    public void setBookinglistener(BookingListener bookinglistener) {
        this.bookinglistener = bookinglistener;
    }

    public RecyclerAdapterStatus(List<DataRecyclerViewStatus.DataStatus> status) {
        this.status = status;

    }
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_of_filter_status,parent,false);
        DataViewHolder dataViewHolder = new DataViewHolder(v);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, final int position) {
        holder.dataNumId.setText(status.get(position).number_type);
        holder.dataNumPeople.setText(status.get(position).num_people);
        holder.dataNumFloor.setText(status.get(position).number_floor);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bookinglistener != null){
                    bookinglistener.onItemClick(status.get(position));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        TextView dataNumId;
        TextView dataNumPeople;
        TextView dataNumFloor;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            dataNumId=(TextView)itemView.findViewById(R.id.number_type);
            dataNumPeople=(TextView)itemView.findViewById(R.id.num_people);
            dataNumFloor=(TextView)itemView.findViewById(R.id.num_floor);
            recyclerView=(RecyclerView) itemView.findViewById(R.id.my_restatus);

        }
    }
}
