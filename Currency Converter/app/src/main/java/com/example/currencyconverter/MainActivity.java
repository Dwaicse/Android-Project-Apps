package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertCurrency(View view)
    {
        EditText amount = (EditText) findViewById(R.id.editTextTextPersonName);
        float a = Float.parseFloat(amount.getText().toString());
        double b = a*72.91;
        String str = String.format("%.2f",b);
       Toast.makeText(this, str + "$", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}