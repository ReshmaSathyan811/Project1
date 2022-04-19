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
    EditText un, pwd, reg;
    Button login;
    int clickcount = 3;
    String username = "admin";
    String password = "abc123";
    Intent i;
    String user1, pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        Button login = (Button) findViewById(R.id.button);


        un = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);

        TextView reg = (TextView) findViewById(R.id.user1);

        EditText unamer= (EditText) findViewById(R.id.username1);
        EditText pwordr= (EditText) findViewById(R.id.password1);

        /*i=getIntent();
        String userr = i.getStringExtra("user1");
        String passwordr = i.getStringExtra("pass1");
        username.setText("+userr");
        password.setText("passwordr");*/



        login.setOnClickListener(this);

        reg.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {



       String uname = un.getText().toString();
       String pword = pwd.getText().toString();
       Intent in = new Intent(getApplicationContext(), RegisterPage.class);
        startActivity(in);
        if (username.equals(uname) && password.equals(pword)) {
            Intent i = new Intent(getApplicationContext(), HomePage.class);
            //passing username to homepage through intent
            i.putExtra("user",uname);//user enna keyileku uname yil ullathine eduthu save cheyithu, ennittu intent vazhi homepagileku pass cheyyum
            startActivity(i);
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

