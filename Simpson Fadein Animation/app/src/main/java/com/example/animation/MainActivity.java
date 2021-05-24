package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //int flag = 0;

    public void fade(View view) {
        Log.i("Info", "Worked!");
        ImageView bratsimp = (ImageView) findViewById(R.id.bratSimpson);
        ImageView homerSimp = (ImageView) findViewById(R.id.homerSimpson);

        bratsimp.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);



     /*
        if (flag == 0) {
            flag=1;
            bratsimp.animate().alpha(0).setDuration(2000);
            homerSimp.animate().alpha(1).setDuration(2000);
        } else if (flag == 1) {
            flag=0;
            bratsimp.animate().alpha(1).setDuration(2000);
            homerSimp.animate().alpha(0).setDuration(2000);

        }*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bratsimp = (ImageView) findViewById(R.id.bratSimpson);
        bratsimp.setX(-1000);
        bratsimp.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}