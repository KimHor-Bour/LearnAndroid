package com.example.kessseller.XML;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kessseller.Java.DataRecyclerViewBooking;
import com.example.kessseller.Java.DataRecyclerViewStatus;
import com.example.kessseller.Java.RecyclerAdapterBooking;
import com.example.kessseller.Java.RecyclerAdapterStatus;
import com.example.kessseller.R;

import java.util.List;
public class StatusMyorder extends Fragment implements View.OnClickListener {
    LinearLayout linearLayout;
    AlertDialog alertDialog;
    String[] values = {"Table","Room","Event",};
    TextView textView;
    List<DataRecyclerViewStatus.DataStatus> data;
    //    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.status_myorder, container, false);
        DataRecyclerViewStatus dataRecyclerViewStatus = new DataRecyclerViewStatus();
        data = dataRecyclerViewStatus.getData();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_restatus);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

//        recyclerView.setLayoutManager(llm);
//        textView = rootView.findViewById(R.id.type_status);
//        textView.setText(values[0]);

        RecyclerAdapterStatus recyclerAdapterStatus = new RecyclerAdapterStatus(data);
        recyclerView.setAdapter(recyclerAdapterStatus);
//        linearLayout = (LinearLayout)rootView.findViewById(R.id.filterbtntype);
//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onCreateDialog(savedInstanceState);
//            }
//        });
        return rootView;
    }

//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Selected Filter");
//        builder.setSingleChoiceItems(values,-1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                textView.setText(values[0]);
//                TextView txt = (TextView)getActivity().findViewById(R.id.type_status);
//                txt.setText(values[i]);
//                dialogInterface.dismiss();
//            };
//        });
//        builder.create();
//        return builder.show();
//    }
    @Override
    public void onClick(View view) {
    }
}