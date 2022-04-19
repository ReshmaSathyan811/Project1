package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity implements View.OnClickListener {
     EditText unr,pwdr;
     String username1, password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Button Register= (Button)findViewById(R.id.Register);

        EditText unr= (EditText) findViewById(R.id.username1);
        EditText pwdr= (EditText) findViewById(R.id.password1);


        Register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String  runame= unr.getText().toString();
        String rpwd= pwdr.getText().toString();
        Toast.makeText(getApplicationContext(), "Registration Success", Toast.LENGTH_LONG).show();
        if(username1.equals(runame)&& password1.equals(rpwd)){
            Intent i = new Intent(getApplicationContext(),LoginPage.class);
            i.putExtra("user1", runame);
            i.putExtra("pass1", rpwd);
            startActivity(i);

        }
    }
}