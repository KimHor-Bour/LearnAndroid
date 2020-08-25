//package com.example.kessseller.XML;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.app.Activity;
//import android.app.FragmentManager;
//import android.graphics.Color;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.example.kessseller.Java.AlertDialogRadio;
//import com.example.kessseller.Java.AlertString;
//import com.example.kessseller.Java.DataRecyclerView;
//import com.example.kessseller.Java.Recycler1;
//import com.example.kessseller.Java.RecyclerAdapter;
//import com.example.kessseller.R;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainActivity extends Activity implements AlertDialogRadio.AlertPositiveListener {
//
//    int position = 0;
//
////    List<DataRecyclerView.DataRecycler> data;
//   @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.booking_myorder);
//
//       View.OnClickListener listener = new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               //Getting the fragment manger
//               FragmentManager manager = getFragmentManager();
//
//               //Instantiation the DialogFragmentManager
//               AlertDialogRadio alertDialogRadio = new AlertDialogRadio();
//
//               //Creating a bundle object to store the selected item
//               Bundle b = new Bundle();
//
//               //Storing the selected item's index in the bundle object
//               b.putInt("position",position);
//
//               //Settingh the bundle object to the dialog fragment object
//               alertDialogRadio.setArguments(b);
//
//               //Creating the dialog fragment object, which will in turn open the alert
//               alertDialogRadio.show(manager, "alert_dialog_radio");
//
//           }
//       };
//       //Getting the reference of the button from the main layout
//       LinearLayout linearLayout = (LinearLayout) findViewById(R.id.filterbtn);
//
//       //Setting a button click listener for the choose button
//       linearLayout.setOnClickListener(listener);
//
//
//
//
//
//
//
//
//
////        DataRecyclerView dataRecyclerView = new DataRecyclerView();
////        data = dataRecyclerView.getData();
////
////
////        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.my_rebooking);
////        recyclerView.setHasFixedSize(true);
////        LinearLayoutManager llm = new LinearLayoutManager(this);
////        llm.setOrientation(LinearLayoutManager.VERTICAL);
////        recyclerView.setLayoutManager(llm);
////
////
////        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(data);
////        recyclerView.setAdapter(recyclerAdapter);
//   }
//   //Definig button click listener for the ok button of the alert dialog window
//    @Override
//    public void onPositiveClick(int position){
//       this.position = position;
//
//       //Getting the reference of the textview from the main
//        TextView tv = (TextView) findViewById(R.id.txtfilter);
//        tv.setText(AlertString.code[this.position]);
//    }
//
//}