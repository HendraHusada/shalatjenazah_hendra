package com.example.hendra.shalatjenazah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class hal_04cewekcowok extends AppCompatActivity {

    Button but;
    Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_04cewekcowok);

        but = (Button) findViewById(R.id.buttoncowok);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cowok",Toast.LENGTH_LONG).show();
                Intent intent_shalatco = new Intent(hal_04cewekcowok.this, hal_04shalatcowok.class);
                startActivity(intent_shalatco);
            }
        });
        but2 = (Button) findViewById(R.id.buttoncewek);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cewek",Toast.LENGTH_LONG).show();
                Intent intent_shalatce = new Intent(hal_04cewekcowok.this, hal_04shalatcewek.class);
                startActivity(intent_shalatce);
            }
        });
    }
}
