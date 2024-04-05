package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void sortear (View v){
        int n = new Random().nextInt(5);
        String m;
        String t;         ;
        if (n== 0){
            t= "Queima minha pele";
            m = "Nosso amor era tudo, espero que 'cê se recorde\n" +
                    "Livrarias, café chiques, tênis caros, vários kits\n" +
                    "Nossos sonhos, mesmos brindes\n" +
                    "Mesmas brigas, mesmos brindes\n" +
                    "Livrarias, café chiques, tênis caros, vários kits\n" +
                    "Nossos sonhos, mesmos brindes\n" +
                    "Mesmas brigas, mesmos brindes\n" +
                    "Eu não sou o homem que você sonhava\n" +
                    "Garota eu quero ser o homem que você sonhava";
        }
        else
        if (n== 1){
            t= "Triste pra sempre";
            m = "Eu quero ser maior\n" +
                    "Eu quero ser melhor\n" +
                    "Me quero mais bonito\n" +
                    "Eu quero estar contente\n" +
                    "Mas eu simplesmente não consigo\n" +
                    "Eu ando pela rua\n" +
                    "E nada mais me surpreende\n" +
                    "Eu era melhor no passado\n" +
                    "Do que eu sou no presente\n" +
                    "Tenho medo de ser só isso\n" +
                    "Minha vida daqui pra frente";
        }
        else
        if (n== 2){
            t= "Ainda gosto dela";
            m = "E agora ela me deixou\n" +
                    "E eu ainda gosto dela\n" +
                    "Mas ela já não gosta tanto assim\n" +
                    "A porta ainda está aberta\n" +
                    "Mas da janela já não entra luz\n" +
                    "E eu ainda penso nela\n" +
                    "Mas ela já não pensa mais em mim\n" +
                    "Eu vou deixar a porta aberta\n" +
                    "Pra que ela entre e traga a sua luz";
        }
        else
        if (n== 3){
            t="Na sua estante";
            m = "Te vejo errando, isso não é pecado\n" +
                    "Exceto quando faz outra pessoa sangrar\n" +
                    "Te vejo sonhando e isso dá medo\n" +
                    "Perdido num mundo que não dá pra entrar\n" +
                    "Você está saindo da minha vida\n" +
                    "E parece que vai demorar\n" +
                    "Se não souber voltar, ao menos mande notícia\n" +
                    "Cê acha que eu sou louca\n" +
                    "Mas tudo vai se encaixar\n" +
                    "Tô aproveitando cada segundo\n" +
                    "Antes que isso aqui vire uma tragédia";
        }
        else {
            t="Música de amor nunca mais";
            m = "Não lembro do seu número de cabeça\n" +
                    "Se começamos em novembro ou se terminamos numa terça\n" +
                    "Nem sua cor preferida\n" +
                    "Já fechou a ferida, querida\n" +
                    "Não tenho mais medo da despedida (não, não, não, não)\n" +
                    "Eu já não sonho, não tenho pesadelo\n" +
                    "Já não odeio e nem desejo\n" +
                    "Os olhos não se enchem d'água\n" +
                    "Não me sinto afogado\n" +
                    "Lendo suas cartas, vendo seus retratos\n" +
                    "Músicas de amor nunca mais, bebê\n" +
                    "Músicas de amor nunca mais\n" +
                    "Você pede e me espera\n" +
                    "Mas a vida acelera\n" +
                    "O sorriso a dor leva";
        }
        TextView textResult = findViewById(R.id.result);
        textResult.setText("Sua música para sofrer:\n " + t + "\n" + m);
    }}