package com.example.mylogindemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void clickFunction(View view)
    {
        EditText editText = (EditText) findViewById(R.id.nameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Values","It's Working");
        Log.i("Values",editText.getText().toString());
        Log.i("Values", password.getText().toString());
        Toast.makeText(this,"Hi There!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}