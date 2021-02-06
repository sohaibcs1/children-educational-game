package com.example.ravian.sounds;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class bird extends AppCompatActivity {
    Button b1;
    ImageView g1,g2,g3;
    MediaPlayer mySound,mySound2,mySound3;
    protected void onPause() {
        super.onPause();
        mySound.release();
        mySound2.release();
        mySound3.release();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);
        g1 = (ImageView) findViewById(R.id.iv1);
        g2 = (ImageView) findViewById(R.id.iv2);
        g3 = (ImageView) findViewById(R.id.iv3);
        b1 = (Button) findViewById(R.id.b1);
        mySound = MediaPlayer.create(this, R.raw.p);
        mySound2 = MediaPlayer.create(this, R.raw.q);
        mySound3 = MediaPlayer.create(this, R.raw.r);

    }
    public void playMusic(View v){
        if(v==g1) {
            mySound.start();

        }
        if(v==g2){
            mySound2.start();
        }
        if(v==g3){
            mySound3.start();
        }
        if(v==b1){
            mySound.stop();
            mySound2.stop();
            mySound3.stop();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();

        }
    }
}