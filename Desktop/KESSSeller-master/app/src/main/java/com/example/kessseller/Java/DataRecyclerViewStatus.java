package com.example.kessseller.Java;

import java.util.ArrayList;
import java.util.List;

public class DataRecyclerViewStatus {
    public class DataStatus{
        String number_type;
        String num_people;
        String number_floor;

        DataStatus(String number_type, String num_people, String number_floor){
            this.number_type = number_type;
            this.num_people = num_people;
            this.number_floor = number_floor;
        }
    }
    public DataRecyclerViewStatus() {

        initDataStatus();
    }

    private List<DataStatus> data;
    private void  initDataStatus(){
        data = new ArrayList<>();
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));
        data.add(new DataStatus("1","2","1st"));


    }

    public List<DataStatus> getData() {

        return data;
    }
}
