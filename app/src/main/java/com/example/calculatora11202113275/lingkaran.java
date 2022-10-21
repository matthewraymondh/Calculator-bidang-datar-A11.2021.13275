package com.example.calculatora11202113275;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        final EditText jari = (EditText) findViewById(R.id.jari);
        final Button hitung = (Button) findViewById(R.id.tombolhitunglingkaran);
        final TextView hasil = (TextView) findViewById(R.id.hasillingkaran);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jari1 = jari.getText().toString();
                double jari2 = Double.parseDouble(jari1);
                if(jari2%7==0){
                    double luas = 22/7 * jari2 * jari2;
                    double keliling = 2 * 22/7 * jari2;
                    hasil.setText("Luas = " + luas + ", = " + keliling);


                }else{
                    double luas = 3.14 * jari2 * jari2;
                    double keliling = 2 * 3.14 * jari2;
                    hasil.setText("Luas = " + luas +", Keliling = " + keliling);
                }
            }
        });

    }




}