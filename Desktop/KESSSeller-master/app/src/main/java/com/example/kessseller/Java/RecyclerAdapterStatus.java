package com.example.kessseller.Java;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kessseller.R;

import java.util.List;


public class RecyclerAdapterStatus extends RecyclerView.Adapter<RecyclerAdapterStatus.DataViewHolder> {
    List<DataRecyclerViewStatus.DataStatus> status;
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
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.dataNumId.setText(status.get(position).number_type);
        holder.dataNumPeople.setText(status.get(position).num_people);
        holder.dataNumFloor.setText(status.get(position).number_floor);

    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linear;
        TextView dataNumId;
        TextView dataNumPeople;
        TextView dataNumFloor;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            dataNumId=(TextView)itemView.findViewById(R.id.number_type);
            dataNumPeople=(TextView)itemView.findViewById(R.id.num_people);
            dataNumFloor=(TextView)itemView.findViewById(R.id.num_floor);
            linear=(LinearLayout) itemView.findViewById(R.id.linear_datastatus);

        }
    }
}
