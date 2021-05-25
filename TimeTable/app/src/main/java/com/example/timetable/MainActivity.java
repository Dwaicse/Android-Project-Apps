package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView tableListView;


    public void generateTimesTable(int timeTableNumber){
        ArrayList<Integer> table = new ArrayList<Integer>();
        for(int i=1;i<11;i++)
        {
            table.add(i*timeTableNumber);
        }
        ArrayAdapter<Integer> tableAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,table);

        tableListView.setAdapter(tableAdapter);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       tableListView = findViewById(R.id.tableListView);

        SeekBar tableSeekBar = (SeekBar) findViewById(R.id.tableSeekBar);

        int max = 20;
        int startingPosition = 10;

        tableSeekBar.setMax(max);
        tableSeekBar.setProgress(startingPosition);
        generateTimesTable(startingPosition);


        tableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min =1;
                int timeTableNumber;
                if(progress<min)
                {
                    timeTableNumber = min;
                    tableSeekBar.setProgress(min);
                }
                else {
                    timeTableNumber = progress;
                }
               generateTimesTable(timeTableNumber);




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}