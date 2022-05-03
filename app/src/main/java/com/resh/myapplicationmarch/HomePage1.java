package com.resh.myapplicationmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.cert.Extension;

public class HomePage1 extends AppCompatActivity {

    RadioGroup gender;
    Button show;
    RadioButton r1, r2;
    CheckBox C1, C2, C3, C4;
    Spinner sp;
    ArrayAdapter arrayadpater;
    String states[] = {"Select State", "Kerala", "Tamil Nadu", "Karnataka", "Goa", "Rajasthan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page1);

        gender = (RadioGroup) findViewById(R.id.rg);
        r1 = (RadioButton) findViewById(R.id.female);
        r2 = (RadioButton) findViewById(R.id.male);
                //////Spinner//////
        sp = (Spinner) findViewById(R.id.spinner);
        arrayadpater = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, states);
        sp.setAdapter(arrayadpater);

        //click on spinner
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getItemAtPosition(i).equals("-Select States-")) {

                } else {

                    Toast.makeText(getApplicationContext(), states[i], Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }


        //  gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

        //      @Override
        //      public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //          RadioButton rb = (RadioButton) findViewById(gender.getCheckedRadioButtonId());
        //         String value = rb.getText().toString();
        //        Toast.makeText(getApplicationContext(), "Gender is " + value, Toast.LENGTH_LONG).show();
        //       }
        //    });
        // }

        public void show (View view){

            Boolean Checkedcheckbox = ((CheckBox) view).isChecked();
            String lang = "";
            switch (view.getId()) {
                case R.id.checkBox1:
                    lang = Checkedcheckbox ? "Malayalam selected" : "Malayalam Deselected";
                    break;
                case R.id.checkBox2:
                    lang = Checkedcheckbox ? "English selected" : "English Deselected";
                    break;
                case R.id.checkBox3:
                    lang = Checkedcheckbox ? "Tamil selected" : "Tamil Deselected";
                    break;
                case R.id.checkBox4:
                    lang = Checkedcheckbox ? "Hindi selected" : "Hindi Deselected";
                    break;
            }
            Toast.makeText(getApplicationContext(), "Languages known are " + lang, Toast.LENGTH_LONG).show();

        }
    }




                //gender.setOnClickListener(new View.OnClickListener(){
/*r1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String value=r1.getText().toString();
         Toast.makeText(getApplicationContext(), "Gender is " +value, Toast.LENGTH_LONG).show();

    }
});

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=r2.getText().toString();
                Toast.makeText(getApplicationContext(), "Gender is " +value, Toast.LENGTH_LONG).show();

            }
        });
            //@Override
            //public void onClick(View view) {

              //  RadioButton rb=(RadioButton)findViewById(gender.getCheckedRadioButtonId());//ethu radio button ano select ayirikune radiobuttone rb yileku st cheyithu. rb yile textviewnte corresponding value eduthu value store cheyithu.

               // String value=r1.getText().toString();
               // Toast.makeText(getApplicationContext(), "Gender is " +value, Toast.LENGTH_LONG).show();

          //  }
       // });*/

