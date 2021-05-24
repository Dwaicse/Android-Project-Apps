package com.example.myimgapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  int flag=0;
    public void clickFunction(View view){
        ImageView changeimage = (ImageView) findViewById(R.id.imageView);
        if(flag==0) {
            changeimage.setImageResource(R.drawable.cat2);
            flag=1;
        }
        else if(flag==1)
        {
            changeimage.setImageResource(R.drawable.cat1);
            flag=0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}