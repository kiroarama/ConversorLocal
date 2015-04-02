package com.example.dash.gradosconverter;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{

    RadioGroup rg1;
    RadioButton rbF,rbC;
    EditText etNum1;
    TextView tvResult;
    Button btnConvert;
    String c4;
    double c5;
    double c;
    String o;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rg1=(RadioGroup)findViewById(R.id.rg1);
        rbC=(RadioButton)findViewById(R.id.rbC);
        rbF=(RadioButton)findViewById(R.id.rbF);
        etNum1=(EditText)findViewById(R.id.etNum1);
        tvResult=(TextView)findViewById(R.id.tvResult);
        btnConvert=(Button)findViewById(R.id.btnConvert);
        rg1=(RadioGroup)findViewById(R.id.rg1);

        rg1.setOnCheckedChangeListener(this);

        btnConvert.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {



        if (rbC.isChecked()) {

            o="c";



        }
        if (rbF.isChecked()) {

            o="f";

    }

        }
        @Override
        public void onClick (View v) {

            if (etNum1.getText().toString().equals("")) {
                Toast t0 = Toast.makeText(this, "No hay nada que convertir", Toast.LENGTH_LONG);
                t0.show();
            } else {


                c = Double.parseDouble(etNum1.getText().toString());

                switch (o) {
                    case "c":
                        tvResult.setText(c4);
                        c5=(c-32)/1.8;
                        //c5 = c4 + 1;

                        tvResult.setText("" + c5);
                        break;
                    case "f":
                        c5 = (c  * 1.8)+32;


                        tvResult.setText(""+c5);
                        break;

                }

                rbC.setChecked(false);
                rbF.setChecked(false);

            }
        }

}
