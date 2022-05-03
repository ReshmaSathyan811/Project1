package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity implements View.OnClickListener {
    String username1, password1;
    RadioButton r1, r2;
    CheckBox c1, c2, c3, c4;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Button register = (Button) findViewById(R.id.Register);

        r1 = (RadioButton) findViewById(R.id.male);
        r2 = (RadioButton) findViewById(R.id.female);
        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);


        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = r2.getText().toString();
                Toast.makeText(getApplicationContext(), "Gender is " + value, Toast.LENGTH_LONG).show();

            }
        });
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = r1.getText().toString();
                Toast.makeText(getApplicationContext(), "Gender is " + value, Toast.LENGTH_LONG).show();

            }
        });

        register.setOnClickListener(this);
    }
        @Override
        public void onClick (View view){

            EditText unr = (EditText) findViewById(R.id.username1);
            EditText pwdr = (EditText) findViewById(R.id.password1);

            String runame = unr.getText().toString();
            String rpwd = pwdr.getText().toString();

            Intent i = new Intent(getApplicationContext(), LoginPage.class);
            i.putExtra("user1", runame);
            i.putExtra("pass1", rpwd);
            startActivity(i);
        }

        public void display (View view){
            String langg = "languages known are";
            if (c1.isChecked()) {
                langg += "\nMalayalam";
            }
            if (c2.isChecked()) {
                langg += "\nEnglish";
            }
            if (c3.isChecked()) {
                langg += "\nTamil";
            }
            Toast.makeText(getApplicationContext(), "Languages known are " + langg, Toast.LENGTH_LONG).show();

        }
}