package com.matheuspatriota.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private String[] signos = {
            "Aries", "Touro", "Gêmeos", "Câncer",
            "Virgem", "Leão", "Libra", "Escorpião",
            "Peixes", "Sargitário", "Aquário", "Capricórnio"
    };

    private String[] perfis = {
            "O Ariano clássico é impulsivo, irreprimível, corajoso, impaciente, ativo, muitas vezes hiperativo, não consegue ficar parado, pavio curto, ousado, tem muita energia e é rápido em tudo. ",
            "Touro quer amar e ser amado com segurança, adora fazer carinho, seu toque é gostoso, traz paz e é suave, tem uma energia que emana das mãos que traz conforto a quem é tocado por ele, e geralmente o Taurino tem pele macia, gostosa de tocar.",
            "O Geminiano clássico é múltiplo, diverso, multifacetado e curioso em todos os sentidos, por isso sabe de tudo um pouco e devido a sua velocidade de aprendizado supersônica, não se aprofunda em nenhum assunto ou atividade, que não seja sua especialidade.",
            "O Canceriano clássico é profundamente sentimental, intuitivo, maternal, protetor, patriótico e nostálgico. Busca sempre segurança emocional, mas também material, afinal o símbolo de Câncer, o caranguejo, vive tanto na ÁGUA (elemento da emoção) como na TERRA (elemento da materialidade).",
            "O Virginiano clássico é prático, planejado, observador, detalhista, eficaz, analítico, crítico, pontual, asseado e seletivo. Adora um padrão e é muito organizado, faz lista para tudo e sempre tem uma agenda.",
            "O Leonino clássico ama brilhar, é exuberante, inspirador, generoso, egocêntrico, fascinante e dominador, afinal não poderia ser diferente já que tem a nobreza de um Rei unida a ferocidade do Leão, despertando ao mesmo tempo admiração, respeito, medo e fascínio.",
            "O Libriano clássico é harmônico, amistoso, cortês, imparcial, compreensivo, justo, perfeccionista, refinado, diplomático, polido, pacífico, elegante, estético, às vezes indeciso e vive em busca de um ideal de beleza, equilíbrio entre as partes e da Paz entre as pessoas. Tudo isso está enraizado no anseio pelo belo e pelo civilizado que esse signo tem em sua essência!",
            "O Escorpiano clássico é profundo, denso, intenso, magnético, emotivo, desconfiado, controlador, misterioso, cauteloso, sensível, resiliente, intuitivo, vingativo, forte, apaixonado, verdadeiro, reservado, investigador, persistente, passional e questionador. Vive em eterna transformação, e tem excelente memória, principalmente emocional.",
            "Como todo bom signo de água, é um pouco pessimista e melancólico. Emocionalmente reservado, absorve o “astral” do ambiente por vibração e confunde-se com ele, um verdadeiro radar que capta todos os sentimentos que estão ao seu redor, uma “esponjinha sentimental”.",
            "Assim como Gêmeos, seu oposto complementar, Sagitário é um signo dual, representado pelo Centauro, unindo homem e animal no mesmo corpo, significa o humano em busca do divino, pondo as rédeas no irracional.",
            "O Aquariano clássico* é visionário, sábio, inventivo, amigo, diferente, espacial e estelar, independente, intuitivo, inovador, transformador, líder, tecnológico, curioso, criativo, rebelde, prático, humanitário, excêntrico, revolucionário, radical e livre. O gênio reformista e original do Zodíaco, sempre preocupado com o futuro e com o progresso!",
            "É mais do tipo pé no chão, nada de relações frio na barriga, estilo montanha russa, com pitadas de infidelidade, isso está totalmente fora de suas histórias de amor, o bom Capricorniano tem o coração dominado pela razão e prefere a segurança do amar e ser amado, se não age assim é porque o medo de relacionar-se seriamente é maior do que ele próprio."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = findViewById(R.id.listViewID);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        lista.setAdapter( adaptador );


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String texto = perfis[position];
                Toast.makeText(getApplicationContext(),texto,Toast.LENGTH_LONG).show();
            }
        });




    }



}
