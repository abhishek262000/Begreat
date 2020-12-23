package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.text.method.LinkMovementMethod;

import com.example.begrateful.GeoLocation;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Therapists extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapists);

        TextView kol=(TextView)findViewById(R.id.kolkata);
        TextView kal=(TextView)findViewById(R.id.kalyan);
        TextView mum=(TextView)findViewById(R.id.mumbai);
        TextView pune=(TextView)findViewById(R.id.pune);
        TextView pun=(TextView)findViewById(R.id.punjab);
        TextView ker=(TextView)findViewById(R.id.kerela);
        TextView odi=(TextView)findViewById(R.id.odisha);
        TextView bang=(TextView)findViewById(R.id.banglore);
        TextView nag=(TextView)findViewById(R.id.nagpur);
        TextView nas=(TextView)findViewById(R.id.nasik);
        TextView del=(TextView)findViewById(R.id.delhi);
        TextView che=(TextView)findViewById(R.id.chennai);
        TextView guj=(TextView)findViewById(R.id.gujrat);
        TextView tel=(TextView)findViewById(R.id.telangana);
        TextView up=(TextView)findViewById(R.id.UP);
        TextView bho=(TextView)findViewById(R.id.bhopal);
        TextView uttar=(TextView)findViewById(R.id.uttarakhand);
        TextView dhar=(TextView)findViewById(R.id.dharamsala);
        TextView gur=(TextView)findViewById(R.id.gurgaon);
        TextView jai=(TextView)findViewById(R.id.jaipur);


        kol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.kolkata);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });


        kal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.kalyan);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        pune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.pune);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        pun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.punjab);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        mum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.mumbai);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        ker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.kerela);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        odi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.odisha);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.banglore);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        nag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.nagpur);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        nas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.nasik);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.delhi);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.chennai);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        guj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.gujrat);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.telangana);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.UP);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        bho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.bhopal);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        uttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.uttarakhand);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        dhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.dharamsala);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        gur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.gurgaon);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

        jai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView linkTextView = findViewById(R.id.jaipur);
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });



    }




}