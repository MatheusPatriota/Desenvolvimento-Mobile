package com.matheuspatriota.sonsanimais;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView dog;
    private ImageView cat;
    private ImageView lion;
    private ImageView monkey;
    private ImageView ovelha;
    private ImageView cow;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dogId);
        cat = findViewById(R.id.catId);
        lion = findViewById(R.id.lionId);
        monkey = findViewById(R.id.monkeyId);
        ovelha = findViewById(R.id.ovelhaId);
        cow = findViewById(R.id.cowId);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
        lion.setOnClickListener(this);
        monkey.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        cow.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.dogId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom();
                break;
            case R.id.catId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom();
                break;
            case R.id.lionId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom();
                break;
            case R.id.monkeyId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom();
                break;
            case R.id.ovelhaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocarSom();
                break;
            case R.id.cowId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom();
                break;
        }
    }

    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
