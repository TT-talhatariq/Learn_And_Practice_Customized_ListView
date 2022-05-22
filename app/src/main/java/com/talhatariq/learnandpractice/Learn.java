package com.talhatariq.learnandpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Learn extends AppCompatActivity {
    Button basics, intro, loop, arrays, oop;

    String [] data = {
            "<h2>What is Java?</h2>\n" +
            "<p>Java is a popular programming language, created in 1995.</p>\n" +
            "<p>It is owned by Oracle, and more than <strong>3 billion</strong> devices run Java.</p>\n" +
            "<p>It is used for:</p>\n" +
            "\n" +
            "<ul>\n" +
            "<li>Mobile applications (specially Android apps)</li>\n" +
            "<li>Desktop applications</li>\n" +
            "<li>Web applications</li>\n" +
            "<li>Web servers and application servers</li>\n" +
            "<li>Games</li>\n" +
            "<li>Database connection</li>\n" +
            "<li>And much, much more!</li>\n" +
            "</ul>\n" +
            "<hr>\n" +
            "\n" +
            "<h2>Why Use Java?</h2>\n" +
            "<ul>\n" +
            "<li>Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)</li>\n" +
            "<li>It is one of the most popular programming language in the world</li>\n" +
            "<li>It is easy to learn and simple to use</li>\n" +
            "<li>It is open-source and free</li>\n" +
            "<li>It is secure, fast and powerful</li>\n" +
            "<li>It has a huge community support (tens of millions of developers)</li>\n" +
            "<li>Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs</li>\n" +
            "<li>As Java is close to <a href=\"/cpp/default.asp\">C++</a> and <a href=\"/cs/default.asp\">C#</a>, it makes it easy for programmers to switch to Java or vice versa</li>\n" +
            "</ul>\n" +
            "<hr>\n" +
                    "<h2>Why to Learn Java?</h2>" +
                    "\n" +
                    "<p>Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. This tutorial gives a complete understanding of Java. This reference will take you through simple and practical approaches while learning Java Programming language.</p>\n" +
                    "<h2>Why to Learn java Programming?</h2>\n" +
                    "<p>Java is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Software Development Domain. I will list down some of the key advantages of learning Java Programming:</p>\n" +
                    "<ul class=\"list\">\n" +
                    "<li><p><b>Object Oriented</b> &minus; In Java, everything is an Object. Java can be easily extended since it is based on the Object model.</p></li>\n" +
                    "<li><p><b>Platform Independent</b> &minus; Unlike many other programming languages including C and C&plus;&plus;, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.</p></li>\n" +
                    "<li><p><b>Simple</b> &minus; Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.</p></li>\n" +
                    "<li><p><b>Secure</b> &minus; With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.</p></li>\n" +
                    "<li><p><b>Architecture-neutral</b> &minus; Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java runtime system.</p></li>\n" +
                    "<li><p><b>Portable</b> &minus; Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset.</p></li>\n" +
                    "<li><p><b>Robust</b> &minus; Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.</p></li>\n" +
                    "</ul>\n" +
                    "<h2>Hello World using Java Programming.</h2>\n" +
                    "<p>Just to give you a little excitement about Java programming, I'm going to give you a small conventional C Programming Hello World program, You can try it using Demo link.</p>\n",
            "","", "", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        basics = findViewById(R.id.basics);
        arrays= findViewById(R.id.arrays);
        loop = findViewById(R.id.loops);
        intro = findViewById(R.id.intro);
        oop = findViewById(R.id.oop);

        //On contribute Click Listener
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(Learn.this, LearnEach.class);
             intent.putExtra("title", "Introduction");
             intent.putExtra("content", data[0]);
             startActivity(intent);
            }
        });

    }
}
