package com.talhatariq.learnandpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LearnEach extends AppCompatActivity {

    Button contribute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute);

        //On contribute Click Listener
        contribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Your Q will be reviewed shortly!", Toast.LENGTH_SHORT).show();
                //    Intent intent = new Intent(Contribute.this, MainActivity.class);
              //  startActivity(intent);
            }
        });
    }
}
