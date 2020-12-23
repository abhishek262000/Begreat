package com.example.begrateful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GraphActivity extends AppCompatActivity {

    ProgressBar stress,depression,anxiety;
    TextView stressText,depressionText,anxietyText,stressText1,depressionText1,anxietyText1;
    Button ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        stress = findViewById(R.id.stressBar);
        depression = findViewById(R.id.depressionBar);
        anxiety = findViewById(R.id.anxietyBar);
        stressText = findViewById(R.id.stress);
        depressionText = findViewById(R.id.depression);
        anxietyText = findViewById(R.id.anxiety);

        stressText1 = findViewById(R.id.stressC);
        depressionText1 = findViewById(R.id.DepressionC);
        anxietyText1 = findViewById(R.id.anxietyC);
        ex=findViewById(R.id.exit);
        int s,a,d;

        if(Testp.stress <= 9 && Testp.stress >=0){
             stressText1.setText("Your score indicates that you are experiencing NORMAL stress.");
        }
        else if (Testp.stress <= 13 && Testp.stress >=10){
            stressText1.setText("Your score indicates that you are experiencing MILD stress.");
        }
        else if(Testp.stress <= 20 && Testp.stress >=14){
            stressText1.setText("Your score indicates that you are experiencing MODERATE stress.");
        }
        else{
            stressText1.setText("Your score indicates that you are experiencing SEVERE stress.");
        }


        if(Testp.depression <= 9 && Testp.depression >=0){
            depressionText1.setText("Your score indicates that you are experiencing NORMAL depression.");
        }
        else if (Testp.depression <= 13 && Testp.depression >=10){
            depressionText1.setText("Your score indicates that you are experiencing MILD depression.");
        }
        else if(Testp.depression <= 20 && Testp.depression >=14){
            depressionText1.setText("Your score indicates that you are experiencing MODERATE depression.");
        }
        else{
            depressionText1.setText("Your score indicates that you are experiencing SEVERE depression.");
        }


        if(Testp.anxiety <= 9 && Testp.anxiety >=0){
            anxietyText1.setText("Your score indicates that you are experiencing NORMAL anxiety.");
        }
        else if (Testp.anxiety <= 13 && Testp.anxiety >=10){
            anxietyText1.setText("Your score indicates that you are experiencing MILD anxiety.");
        }
        else if(Testp.anxiety <= 20 && Testp.anxiety >=14){
            anxietyText1.setText("Your score indicates that you are experiencing MODERATE anxiety.");
        }
        else{
            anxietyText1.setText("Your score indicates that you are experiencing SEVERE anxiety.");
        }


        s = percent(Testp.stress);
        a = percent(Testp.anxiety);
        d = percent(Testp.depression);



        stress.setProgress(s,true);
        depression.setProgress(d,true);
        anxiety.setProgress(a,true);

        stressText.setText("Stress\n"+s+"%");
        anxietyText.setText("Anxiety\n"+a+"%");
        depressionText.setText("Depression\n"+d+"%");
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GraphActivity.this,Solutions.class));
            }
        });
    }

    int percent(int a){
        return a*100/21;
    }
}