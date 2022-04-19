package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
     Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView user =(TextView) findViewById(R.id.user);

        i=getIntent();
        String username = i.getStringExtra("user");
        user.setText("Hello " +username+ ", Welcome to MyappMarch ");


    }
}