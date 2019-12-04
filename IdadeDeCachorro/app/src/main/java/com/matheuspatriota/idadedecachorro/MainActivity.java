package com.matheuspatriota.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        caixaTexto = findViewById(R.id.entradaIdadeId);
        botaoIdade = findViewById(R.id.botaoCalcularId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String anosDeCachorroDigitado = caixaTexto.getText().toString();

                if (anosDeCachorroDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum Número digitado!");
                }
                else {
                    int valorDigitado = Integer.parseInt(anosDeCachorroDigitado);
                    int valorFinal = valorDigitado * 7;

                    resultadoIdade.setText("Seu doguinho tem " + valorFinal + " ano(s) humanos" );

                }
            }
        });


    }
}
