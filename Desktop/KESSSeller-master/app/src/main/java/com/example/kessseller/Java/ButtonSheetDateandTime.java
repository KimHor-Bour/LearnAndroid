package com.example.kessseller.Java;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kessseller.R;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ButtonSheetDateandTime extends BottomSheetDialogFragment {
    private Context context;
    public BookingListener bookingListener;
    public ButtonSheetDateandTime (Context context){
        this.context = context;
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.date_picker_popup,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnok = view.findViewById(R.id.okbutton);
        final SingleDateAndTimePicker singleDateAndTimePicker = view.findViewById(R.id.singlepicker);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookingListener.onAccept(singleDateAndTimePicker.getDate());
                dismiss();
            }
        });
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}
