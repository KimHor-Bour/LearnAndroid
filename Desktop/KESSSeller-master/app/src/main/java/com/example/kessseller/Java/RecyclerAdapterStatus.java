package com.example.kessseller.Java;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecyclerAdapterStatus extends RecyclerView.Adapter<RecyclerAdapterStatus.DataViewHolder> {
    List<DataRecyclerViewStatus.DataStatus> status;
    public RecyclerAdapterStatus(List<DataRecyclerViewStatus.DataStatus> data) {

    }
    @Override
    public RecyclerAdapterStatus.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterStatus.DataViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
