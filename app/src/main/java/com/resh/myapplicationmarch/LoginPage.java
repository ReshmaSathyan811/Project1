package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {//implements View.OnClickListener
    EditText unamer, pwordr;

    Button login;
    int clickcount=3;
    String uname;
    String pwd;
    Intent i;
    String user1, pass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        Button login = (Button) findViewById(R.id.button);


        TextView reg = (TextView) findViewById(R.id.user1);

        unamer = (EditText) findViewById(R.id.username);
        pwordr = (EditText) findViewById(R.id.password);

        i = getIntent();
        String uname = i.getStringExtra("user1");
        String pwd = i.getStringExtra("pass1");
        unamer.setText(uname);
        pwordr.setText(pwd);


        login.setOnClickListener(this);

         reg.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String un = unamer.getText().toString();
        String pwd = pwordr.getText().toString();

        Intent in = new Intent(getApplicationContext(), RegisterPage.class);
        startActivity(in);

        if (un.equals(uname) && pwd.equals(pwd)) {
            Intent i1 = new Intent(getApplicationContext(), HomePage.class);
            startActivity(i1);
            //passing username to homepage through intent
            //   i.putExtra("user",uname);//user enna keyileku uname yil ullathine eduthu save cheyithu, ennittu intent vazhi homepagileku pass cheyyum

            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_LONG).show();
            clickcount--;
            if (clickcount == 0) {

                login.setEnabled(false);

            }
        }

    }

}



    //     1.  ***USING ANONYMOUS INNER CLASS****
     //   login.setOnClickListener(new View.OnClickListener()

    //event perform cheyyan vendi use cheyyunna interfaces anu listener
    //    @Override
     //   public void onClick (View view){
       // Intent i = new Intent(getApplicationContext(), HomePage.class);
       // startActivity(i);

  //  }
//    });

//}
        //       2. ***USING XML****

        // public void login(View view) {
        //    Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_LONG).show();
        //}

        //  3. ***** IMPLEMENT LISTENER *******

      //  login.setOnClickListener(this);

   // }

  //  @Override
 //   public void onClick(View view) {

   // }
//}

