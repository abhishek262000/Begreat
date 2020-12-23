package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapShader;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;

public class Solutions extends AppCompatActivity {
    ImageView basic,video,meditation,therapists;
    TextView basictv,videotv,meditationtv,therapiststv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);


        basic=findViewById(R.id.basic);
        therapists=findViewById(R.id.therapist1);
        video=findViewById(R.id.videotv);
        meditation=findViewById(R.id.meditation);


        basictv=findViewById(R.id.basictv);
        therapiststv=findViewById(R.id.maps);
        videotv=findViewById(R.id.play);
        meditationtv=findViewById(R.id.meditationtv);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Basicpage.class));
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Videopage.class));

            }
        });

        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Meditationpage.class));

            }
        });

        therapists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this,Therapists.class));
            }
        });


        basictv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Basicpage.class));
            }
        });

        videotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Videopage.class));

            }
        });

        meditationtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this, Meditationpage.class));

            }
        });

        therapiststv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Solutions.this,Therapists.class));
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(Solutions.this, Login1.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}