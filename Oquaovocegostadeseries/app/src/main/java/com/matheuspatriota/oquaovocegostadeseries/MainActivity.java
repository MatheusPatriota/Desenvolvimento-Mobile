package com.matheuspatriota.oquaovocegostadeseries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private SeekBar barra;
    private ImageView imagem;
    private TextView  textoReposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra = findViewById(R.id.barraID);
        imagem = findViewById(R.id.imagemRespostaID);
        textoReposta = findViewById(R.id.textoExibicaoID);

        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;

                if (valorProgresso == 1){
                    imagem.setImageResource(R.drawable.pouco);
                    textoReposta.setText("POXAAA, COMO VOCÊ É MESQUINHO :(");
                }
                else if (valorProgresso == 2){
                    imagem.setImageResource(R.drawable.medio);
                    textoReposta.setText("OLHA AIII, TA MELHORANDO EM!!");
                }
                else if (valorProgresso == 3){
                    imagem.setImageResource(R.drawable.muito);
                    textoReposta.setText("AI SIMMMMM, TA BOMBANDO!");
                }
                else{
                    imagem.setImageResource(R.drawable.susto);
                    textoReposta.setText("DEUXXXXXX DAS SÉRIES");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
