package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secondm extends AppCompatActivity {

    Intent intent;
    Button start;
    CardView cr1,cr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondm);
        cr1 = (CardView) findViewById(R.id.cardView3);
        cr2 = (CardView) findViewById(R.id.cardView6);
        cr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Secondm.this,Testp.class));
            }
        });

        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Secondm.this,Stressinfo.class));
            }
        });
    }
}