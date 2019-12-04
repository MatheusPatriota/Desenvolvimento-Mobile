package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {
            "A vida é boa, aproveite cada momento!",
            "Você faz seu própio destino!",
            "Nesse mundo Conhecimento é tudo!",
            "Se você desiste, você já perdeu!",
            "Você vai vencer Hoje, vai fundo Campeão!",
            "Você pode, Você consegue, Matheus Você é bom!!!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.TextoNovaFrase);
        botaoNovaFrase = findViewById(R.id.BotaoNovaFrase);


        textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomizacao = new Random();

                int numSorteado = randomizacao.nextInt(frases.length);

                while (frases[numSorteado].equals(textoNovaFrase.getText()))
                {
                     randomizacao = new Random();

                     numSorteado = randomizacao.nextInt(frases.length);
                }

                textoNovaFrase.setText(frases[numSorteado]);
            }
        }));
    }
}
