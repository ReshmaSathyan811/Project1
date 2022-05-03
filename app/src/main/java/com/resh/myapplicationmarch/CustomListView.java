package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {

    ListView flist;
    String foodnames[] = {"apple", "banana", "donut", "chocolate", "grapes"};

    int foodimages[] = {R.drawable.apple, R.drawable.banana, R.drawable.donut, R.drawable.chocolate, R.drawable.grapesicon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        flist = (ListView) findViewById(R.id.foodlist);
        //2 arrayne process cheyithu listviewlottu set cheyyan e adapter class vazhiye pattu

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), foodnames, foodimages);
        flist.setAdapter(customAdapter);

        flist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}