package bigatimapps.com.example.diegol.caracoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView btn_jogar;
    private ImageView logo;
    private String[] opcao = {"cara" , "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.img_logo);

        btn_jogar = findViewById(R.id.img_btn_jogar);

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*logo.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,
                        R.drawable.moeda_cara));*/

                Random r = new Random();
                int nr = r.nextInt(2);

                Toast.makeText(MainActivity.this,
                        "Passando: " + opcao[nr],
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,
                        DetalheActivity.class);

                intent.putExtra("opcao", opcao[nr]);


                startActivity(intent);

            }
        });


    }
}
