package com.talhatariq.learnandpractice;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LearnEach extends AppCompatActivity {

    TextView title, article;
    Button backToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_each);
        title = findViewById(R.id.article_heading);
        article = findViewById(R.id.article);
        backToHome = findViewById(R.id.button);


        Intent intent = getIntent();
        String tit = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        title.setText(tit);
        article.setText(Html.fromHtml(content));

        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LearnEach.this, Learn.class);
                startActivity(intent);
            }
        });

    }
}

