package bigatimapps.com.example.diegol.caracoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = findViewById(R.id.img_moeda);
        voltar = findViewById(R.id.img_btn_voltar);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("cara")) {
                //exibir imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,
                        R.drawable.moeda_cara));

            } else if (opcaoEscolhida.equals("coroa")) {
                //exibir imagem coroa
                imagem.setImageDrawable((ContextCompat.getDrawable(DetalheActivity.this,
                        R.drawable.moeda_coroa)));

            }
        }


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalheActivity.this,
                        MainActivity.class));
            }
        });

    }
}
