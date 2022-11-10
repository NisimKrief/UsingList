package com.example.usinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    EditText mispar, kofetz;
    String st;
    double sifra, kfitza;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tB1);
        mispar = (EditText) findViewById(R.id.eTa1);
        kofetz = (EditText) findViewById(R.id.eTD);

        tb.setText("Mathematical");
        mispar.setHint("enter the first nunber: ");
        kofetz.setHint("enter the seder kfitza: ");




    }

    public void Done(View view) {
        st  = mispar.getText().toString();
        sifra = Double.parseDouble(st);
        st  = kofetz.getText().toString();
        kfitza = Double.parseDouble(st);
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("firstnumber", sifra);
        si.putExtra("kofetznumber", kfitza);
        // si.putExtra("MathOrGeo", tb.isChecked());
        startActivity(si);
    }

    public void onoff(View view) {
        if(tb.isChecked()){
            tb.setText("Geometrical");
        }
        else{
            tb.setText("Mathematical");

        }
    }
}