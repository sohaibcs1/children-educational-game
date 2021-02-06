package com.example.ravian.sounds;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener  {
    Button gun,dog,kid,fight,bird,laugh,jungle,alert,music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gun=(Button) findViewById(R.id.button);
        gun.setOnClickListener(this);
        dog=(Button) findViewById(R.id.button2);
        dog.setOnClickListener(this);
        kid=(Button) findViewById(R.id.button3);
        kid.setOnClickListener(this);

        fight=(Button) findViewById(R.id.button5);
        fight.setOnClickListener(this);
        bird=(Button) findViewById(R.id.button6);
        bird.setOnClickListener(this);
        laugh=(Button) findViewById(R.id.button7);
        laugh.setOnClickListener(this);
        jungle=(Button) findViewById(R.id.button8);
        jungle.setOnClickListener(this);
        alert=(Button) findViewById(R.id.button9);
        alert.setOnClickListener(this);

        music=(Button) findViewById(R.id.button12);
        music.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v==gun){
            Intent intent = new Intent(getApplicationContext(),gun_sound.class);
            startActivity(intent);
            finish();

        }
        if(v==dog){
            Intent intent = new Intent(getApplicationContext(),dog_sound.class);
            startActivity(intent);
            finish();
        }
        if(v==kid){
            Intent intent = new Intent(getApplicationContext(),kid.class);
            startActivity(intent);
            finish();
        }

        if(v==fight){
            Intent intent = new Intent(getApplicationContext(),fight.class);
            startActivity(intent);
            finish();
        }
        if(v==bird){
            Intent intent = new Intent(getApplicationContext(),bird.class);
            startActivity(intent);
            finish();
        }
        if(v==laugh){
            Intent intent = new Intent(getApplicationContext(),laugh.class);
            startActivity(intent);
            finish();
        }
        if(v==jungle){
            Intent intent = new Intent(getApplicationContext(),jungle.class);
            startActivity(intent);
            finish();
        }
        if(v==alert){
            Intent intent = new Intent(getApplicationContext(),alert.class);
            startActivity(intent);
            finish();
        }

        if(v==music){
            Intent intent = new Intent(getApplicationContext(),music.class);
            startActivity(intent);
            finish();
        }

    }
}
