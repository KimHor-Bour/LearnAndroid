package com.example.kessseller.XML;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.kessseller.Java.AlertDialogRadio;
import com.example.kessseller.Java.DataRecyclerView;
import com.example.kessseller.Java.RecyclerAdapter;
import com.example.kessseller.R;
import java.util.ArrayList;
import java.util.List;
public class BookingMyorder extends DialogFragment implements View.OnClickListener {
    LinearLayout linearLayout;
    AlertDialog alertDialog;
    String[] values = {"All","Booking Request","Booking List","Completed","Cancelled","Booking History",};
    TextView textView;
    List<DataRecyclerView.DataRecycler> data;
    //    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.booking_myorder, container, false);
        DataRecyclerView dataRecyclerView = new DataRecyclerView();
        data = dataRecyclerView.getData();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_rebooking);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);
        textView = rootView.findViewById(R.id.txtfilter);
        textView.setText(values[0]);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(data);
        recyclerView.setAdapter(recyclerAdapter);
        linearLayout = (LinearLayout)rootView.findViewById(R.id.filterbtn);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCreateDialog(savedInstanceState);
            }
        });
        return rootView;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selected Filter");
        builder.setSingleChoiceItems(values,-1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                textView.setText(values[0]);
                TextView txt = (TextView)getActivity().findViewById(R.id.txtfilter);
                txt.setText(values[i]);
                dialogInterface.dismiss();
            };
        });
        builder.create();
        return builder.show();
    }
    @Override
    public void onClick(View view) {
    }
}