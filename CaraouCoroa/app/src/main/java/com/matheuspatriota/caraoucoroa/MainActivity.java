package com.matheuspatriota.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.btJogarID);

        Random random = new Random();
        final int choice = random.nextInt(2);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice == 0){
                    startActivity(new Intent(MainActivity.this, CaraActivity.class));
                }
                else{
                    startActivity(new Intent(MainActivity.this, CoroaActivity.class));
                }

            }
        });
    }
}
