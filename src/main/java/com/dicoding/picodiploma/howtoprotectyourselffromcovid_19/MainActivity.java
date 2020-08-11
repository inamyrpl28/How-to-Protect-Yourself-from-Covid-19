package com.dicoding.picodiploma.howtoprotectyourselffromcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{


        @Override
        protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button btnAyoJagaDiri =
                    findViewById(R.id.btn_ayo_jaga_diri);
            btnAyoJagaDiri.setOnClickListener(this);

            Button btnCuciTangan =
                    findViewById(R.id.btn_cuci_tangan);
            btnCuciTangan.setOnClickListener(this);

            Button btnCaraPakaiMasker =
                    findViewById(R.id.btn_cara_pakai_masker);
            btnCaraPakaiMasker.setOnClickListener(this);

            Button btnPolaHidupSehat =
                    findViewById(R.id.btn_pola_hidup_sehat);
            btnPolaHidupSehat.setOnClickListener(this);

    }
    @Override
            public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_ayo_jaga_diri:
                    Intent moveIntent = new Intent(MainActivity.this, jagadiri.class);
                            startActivity(moveIntent);
                    break;

                case R.id.btn_cuci_tangan:
                    Intent movecuci = new Intent(MainActivity.this, cuci.class);
                            startActivity(movecuci);
                    break;

                case R.id.btn_cara_pakai_masker:
                    Intent movemasker = new Intent(MainActivity.this, masker.class);
                            startActivity(movemasker);
                    break;

                case R.id.btn_pola_hidup_sehat:
                    Intent movehidupsehat = new Intent(MainActivity.this, hidupsehat.class);
                            startActivity(movehidupsehat);
                    break;





            }

            }
        }

