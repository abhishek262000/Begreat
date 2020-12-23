package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Meditationpage extends AppCompatActivity {
    TextView playposition,playduration;
    SeekBar sb;
    ImageView play,pause,ff,rew;
    MediaPlayer mp;
    private Handler handler = new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditationpage);
        playposition=findViewById(R.id.start);
        playduration=findViewById(R.id.duration);
        sb=findViewById(R.id.seekBarmed);
        play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        ff=findViewById(R.id.ff);
        rew=findViewById(R.id.rew);

        mp=MediaPlayer.create(this,R.raw.meditation);
        runnable=new Runnable() {
            @Override
            public void run() {
                sb.setProgress(mp.getCurrentPosition());
                handler.postDelayed(this,500);

            }
        };
        int duration =mp.getDuration();
        String sDuration =convertFormat(duration);
        playduration.setText(sDuration);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.setVisibility(View.GONE);
                pause.setVisibility(View.VISIBLE);
                mp.start();
                sb.setMax(mp.getDuration());
                handler.postDelayed(runnable,0);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause.setVisibility(View.GONE);
                play.setVisibility(View.VISIBLE);
                mp.pause();
                handler.removeCallbacks(runnable);
            }
        });
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cposition;
                cposition=mp.getCurrentPosition();
                int duration= mp.getDuration();
                if(mp.isPlaying() && duration!=cposition)
                {
                    cposition=cposition+5000;
                    playposition.setText(convertFormat(cposition));
                    mp.seekTo(cposition);
                }
            }
        });
        rew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cposition=mp.getCurrentPosition();
                if(mp.isPlaying() && cposition > 5000)
                {
                    cposition=cposition-5000;
                    playposition.setText(convertFormat(cposition));
                    mp.seekTo(cposition);
                }
            }
        });
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser)
                {
                    mp.seekTo(progress);
                }
                playposition.setText(convertFormat(mp.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                pause.setVisibility(View.GONE);
                play.setVisibility(View.VISIBLE);
                mp.seekTo(0);
            }
        });
    }

    private String convertFormat(int duration) {
        return String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(duration), TimeUnit.MILLISECONDS.toSeconds(duration)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }
}