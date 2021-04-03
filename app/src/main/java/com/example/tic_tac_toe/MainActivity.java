package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean clickable = true;
//    ImageView red11, red12, red13, red21, red22, red23, red31, red32, red33;
//    ImageView yellow11, yellow12, yellow13, yellow21, yellow22, yellow23, yellow31, yellow32, yellow33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        red11 = (ImageView) findViewById(R.id.imageView2);
//        red12 = (ImageView) findViewById(R.id.imageView3);
//        red13 = (ImageView) findViewById(R.id.imageView4);
//        red21 = (ImageView) findViewById(R.id.imageView5);
//        red22 = (ImageView) findViewById(R.id.imageView6);
//        red23 = (ImageView) findViewById(R.id.imageView7);
//        red31 = (ImageView) findViewById(R.id.imageView8);
//        red32 = (ImageView) findViewById(R.id.imageView10);
//        red33 = (ImageView) findViewById(R.id.imageView9);
//
//        yellow11 = (ImageView) findViewById(R.id.imageView11);
//        yellow12 = (ImageView) findViewById(R.id.imageView12);
//        yellow13 = (ImageView) findViewById(R.id.imageView13);
//        yellow21 = (ImageView) findViewById(R.id.imageView14);
//        yellow22 = (ImageView) findViewById(R.id.imageView14);
//        yellow23 = (ImageView) findViewById(R.id.imageView15);
//        yellow31 = (ImageView) findViewById(R.id.imageView16);
//        yellow32 = (ImageView) findViewById(R.id.imageView17);
//        yellow33 = (ImageView) findViewById(R.id.imageView18);
//

    }


    public void click(View v) {
        if (clickable){
        v.animate().alpha(1).setDuration(500);
            clickable = false;
        }
        else {
            v.animate().alpha(1).setDuration(500);
            ImageView imageView = (ImageView) v; 
            imageView.setImageResource(R.drawable.red);
            clickable = true;
        }
    }
}




