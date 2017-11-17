package com.example.hendra.shalatjenazah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hal_06hasil_nilai extends AppCompatActivity {

    TextView textviewJumlahBenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_06hasil_nilai);

        textviewJumlahBenar = (TextView) findViewById(R.id.textviewjumlahbenar);
        textviewJumlahBenar.setText(Integer.toString(evaluasi.jumlahbenar));
    }
}
