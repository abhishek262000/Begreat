package com.example.begrateful;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Forgotp extends AppCompatActivity {

    private EditText et;
    private Button bt1;
    private FirebaseAuth fbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotp);

        et=(EditText)findViewById(R.id.emailp);
        bt1=(Button)findViewById(R.id.passreset);
        fbt=FirebaseAuth.getInstance();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String pass2 = et.getText().toString();
               if(pass2.equals("")){
                   Toast.makeText(Forgotp.this, "please enter your password..", Toast.LENGTH_SHORT).show();
               }else{
                   fbt.sendPasswordResetEmail(pass2).addOnCompleteListener(new OnCompleteListener<Void>() {
                       @Override
                       public void onComplete(@NonNull Task<Void> task) {
                           if(task.isSuccessful()){
                               Toast.makeText(Forgotp.this, "password reset email sent..", Toast.LENGTH_SHORT).show();
                               finish();
                               startActivity(new Intent(Forgotp.this,Login1.class));
                           }
                           else{
                               Toast.makeText(Forgotp.this, "Email reset sending error!!!", Toast.LENGTH_SHORT).show();
                           }
                       }
                   });
               }
               
            }
        });
    }
}