package com.example.dd.dashb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


            GridView androidGridView;

            String[] gridViewString = {
                    "LABOR", "INVENTORY",
                    "EQUIPMENT", "TASK",
                    "REQUIRMENT", "REPORT",
            } ;
            int[] gridViewImageId = {
                    R.drawable.workers, R.drawable.inven,
                    R.drawable.equpiment, R.drawable.task,
                    R.drawable.requir, R.drawable.reports,

            };

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
                androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
                androidGridView.setAdapter(adapterViewAndroid);
                androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int i, long id) {
                        Toast.makeText(MainActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
                    }
                });

            }
        }


