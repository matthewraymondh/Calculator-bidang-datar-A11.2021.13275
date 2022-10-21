package com.example.calculatora11202113275;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText) findViewById(R.id.alas);
        final EditText tinggi = (EditText) findViewById(R.id.tinggi);
        final Button hitung = (Button) findViewById(R.id.hitungsegitiga);
        final TextView hasil = (TextView) findViewById(R.id.hasilsegitiga);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                double alas2 = Double.parseDouble(alas1);
                double tinggi2 = Double.parseDouble(tinggi1);
                double luas = 0.5 * alas2 * tinggi2;
                double keliling = alas2 + tinggi2 + Math.sqrt(alas2 * alas2 + tinggi2 * tinggi2);
                hasil.setText("Luas = " + luas +", Keliling = " + keliling);
            }
        });

    }




}