package com.matheuspatriota.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoAlcool;
    private EditText textoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoAlcool = findViewById(R.id.textoAlcoolId);
        textoGasolina = findViewById(R.id.textoGasolinaID);
        botaoVerificar = findViewById(R.id.botaoVerificar);
        textoResultado = findViewById(R.id.textoResultadoID);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              recupera valores digitados
                String textoPrecoAlcool = textoAlcool.getText().toString();
                String textoPrecoGasolina = textoGasolina.getText().toString();

//              converte para numeros
                Double precoAlcool = Double.parseDouble(textoPrecoAlcool);
                Double precoGasolina = Double.parseDouble(textoPrecoGasolina);

//              lógica de implementação

                Double resultado = precoAlcool / precoGasolina;
                if (resultado >= 0.7){
//                  usar gasolina
                    textoResultado.setText("Vai de Gasosa Brow :P");
                }
                else{
//                    vai de alcool
                    textoResultado.setText("Melhor ir de Alcool Irmão :)");
                }

            }
        });

    }
}
