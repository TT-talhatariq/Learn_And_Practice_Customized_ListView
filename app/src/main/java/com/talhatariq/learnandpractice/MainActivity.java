    package com.talhatariq.learnandpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

    Button learn, practice, contribute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn = (Button) findViewById(R.id.question);
        practice = (Button) findViewById(R.id.practice);
        contribute = (Button) findViewById(R.id.contribute);

        //On contribute Click Listener
        contribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Contribute.class);
                startActivity(intent);
            }
        });

        //Quiz Taken
         contribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                startActivity(intent);
            }
        });
    }
}