package com.talhatariq.learnandpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quiz extends AppCompatActivity {
    Button button;
    ListView listView;
    RadioGroup radioGroup;
    ArrayList<Question> questionList=new ArrayList<>();
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        button=findViewById(R.id.button);

        //List of Questions
        questionList.add(new Question("1. JVM Stands for?","Java Virtual Machine",new String[]{"Java Volcanic Machine","Java Verified Machine"}));
        questionList.add(new Question("2. What is the extension of java code files?",".java",new String[]{".txt",".js"}));
        questionList.add(new Question("3. Which one of the following is not an access modifier?","void",new String[]{"Protected","Private"}));
        questionList.add(new Question("4. Java is a?","language",new String[]{"framework","library"}));
        questionList.add(new Question("5. Loves this App?","Yes",new String[]{"No","Maybe"}));

        listView = (ListView) findViewById(R.id.listView);

        adapter=new MyAdapter(this, questionList);
        listView.setAdapter(adapter);
    }

    //For submitting quez
    public void submitQuiz(View view) {
        int score=0;
        ArrayList<String> selectedAnswers=adapter.selectedAnswers;

        //checking all answers
        for(int i=0;i<questionList.size();i++){
            if(questionList.get(i).getCorrectOption().equals(selectedAnswers.get(i))){
                score++;
            }
        }
        //showing results
        new AlertDialog.Builder(this)
                .setTitle("Result")
                .setMessage("Score is "+ score+" out of "+ questionList.size())
                .setPositiveButton("Go to Main",(dialogInterface, i) -> restart() )
                .setCancelable(false)
                .show();

    }

    //after finishing quiz
    void restart(){
        finish();
        Intent intent = new Intent(Quiz.this, MainActivity.class);
        startActivity(intent);
    }

}