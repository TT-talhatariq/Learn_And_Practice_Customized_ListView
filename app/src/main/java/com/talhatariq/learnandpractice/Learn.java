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
                    "</ul>\n",

            "\n" +
                   "<h2>Basic Terminologies"+
                    "<div class=\"clearer\"></div>\n" +
                    "<p>When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.</p>\n" +
                    "<ul class=\"list\">\n" +
                    "<li><p><b>Object</b> &minus; Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.</p></li>\n" +
                    "<li><p><b>Class</b> &minus; A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.</p></li>\n" +
                    "<li><p><b>Methods</b> &minus; A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.</p></li>\n" +
                    "<li><p><b>Instance Variables</b> &minus; Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.</p></li>\n" +
                    "</ul>\n" +
                    "<h2>First Java Program</h2>\n" +
                    "<p>Let us look at a simple code that will print the words <b><i>Hello World</i></b>.</p>\n" +
                    "<h3>Example</h3>\n" +
                    "<div class=\"demo-view\">\n" +
                    "<a href=\"http://tpcg.io/tv5b2l\" target=\"_blank\" class=\"demo\" rel=\"nofollow\"><i class=\"fa-external-link\"></i> Live Demo</a>\n" +
                    "</div>\n" +
                    "<pre class=\"prettyprint notranslate\">\n" +
                    "public class MyFirstJavaProgram {\n" +
                    "\n" +
                    "  <br> public static void main(String []args) {\n" +
                    "      <br><br> System.out.println(\"Hello World\"); <br>\n" +
                    "   }<br>\n" +
                    "}\n" +
                    "</pre>\n" +
                    "<p>Let's look at how to save the file, compile, and run the program. Please follow the subsequent steps &minus;</p>\n" +
                    "<ul class=\"list\">\n" +
                    "<li><p>Open notepad and add the code as above.</p></li>\n" +
                    "<li><p>Save the file as: MyFirstJavaProgram.java.</p></li>\n" +
                    "<li><p>Open a command prompt window and go to the directory where you saved the \tclass. Assume it's C:\\.</p></li>\n" +
                    "<li><p>Type 'javac MyFirstJavaProgram.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line (Assumption : The path variable is set).</p></li>\n" +
                    "<li><p>Now, type ' java MyFirstJavaProgram ' to run your program.</p></li>\t\n" +
                    "<li><p>You will be able to see ' Hello World ' printed on the window.</p></li>\n" +
                    "</ul>\n" +


                    "</body>\n" +
                    "</html>\n","\n" +
            "<h1 class=\"h1\">Loops in Java</h1>\n" +
            "<p>The Java <em>for loop</em> is used to iterate a part of the program several times. If the number of iteration is <strong>fixed</strong>, it is recommended to use for loop.</p>\n" +
            "<p>There are three types of for loops in Java.</p>\n" +
            "<img src=\"https://static.javatpoint.com/images/java-loops.png\" alt=\"Loops in Java\" />\n" +
            "<ul class=\"points\">\n" +
            "<li>Simple for Loop</li>\n" +
            "<li><a href=\"https://www.javatpoint.com/for-each-loop\">For-each</a> or Enhanced for Loop</li>\n" +
            "<li>Labeled for Loop</li>\n" +
            "</ul>\n" +
            "<h2 class=\"h2\">Java Simple for Loop</h2>\n" +
            "<p>A simple for loop is the same as <a href=\"https://www.javatpoint.com/c-programming-language-tutorial\">C</a>/<a href=\"https://www.javatpoint.com/cpp-tutorial\">C++</a>. We can initialize the <a href=\"https://www.javatpoint.com/java-variables\">variable</a>, check condition and increment/decrement value. It consists of four parts:</p>\n" +
            "<ol class=\"points\">\n" +
            "<li><strong>Initialization</strong>: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.</li>\n" +
            "<li><strong>Condition</strong>: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.</li>\n" +
            "<li><strong>Increment/Decrement</strong>: It increments or decrements the variable value. It is an optional condition.</li>\n" +
            "<li><strong>Statement</strong>: The statement of the loop is executed each time until the second condition is false.</li>\n" +
            "</ol>\n" +
            "<p><strong>Syntax:</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "for(initialization; condition; increment/decrement){  \n" +
            "//statement or code to be executed  \n" +
            "}  \n" +
            "</textarea></div>\n" +
            "<p><strong>Flowchart:</strong></p>\n" +
            "<img src=\"https://static.javatpoint.com/cpages/images/forloop.png\" alt=\"for loop in java flowchart\" />\n" +
            "<p><strong>Example:</strong></p>\n" +
            "<p><strong>ForExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "//Java Program to demonstrate the example of for loop\n" +
            "//which prints table of 1\n" +
            "public class ForExample {\n" +
            "public static void main(String[] args) {\n" +
            "    //Code of Java for loop\n" +
            "\tfor(int i=1;i<=10;i++){\n" +
            "\t\tSystem.out.println(i);\n" +
            "\t}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<span class=\"testit\"><a href=\"https://compiler.javatpoint.com/opr/test.jsp?filename=ForExample\" target=\"_blank\">Test it Now</a></span>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "5\n" +
            "6\n" +
            "7\n" +
            "8\n" +
            "9\n" +
            "10\n" +
            "</pre></div>\n" +
            "<h2 class=\"h2\">Java Nested for Loop</h2>\n" +
            "<p>If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.</p>\n" +
            "<p><strong>Example:</strong></p>\n" +
            "<p><strong>NestedForExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "public class NestedForExample {\n" +
            "public static void main(String[] args) {\n" +
            "//loop of i\n" +
            "for(int i=1;i<=3;i++){\n" +
            "//loop of j\n" +
            "for(int j=1;j<=3;j++){\n" +
            "\t\tSystem.out.println(i+\" \"+j);\n" +
            "}//end of i\n" +
            "}//end of j\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>1 1\n" +
            "1 2\n" +
            "1 3\n" +
            "2 1\n" +
            "2 2\n" +
            "2 3\n" +
            "3 1\n" +
            "3 2\n" +
            "3 3\n" +
            "</pre></div>\n" +
            "<p><strong>Pyramid Example 1:</strong></p>\n" +
            "<p><strong>PyramidExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "public class PyramidExample {\n" +
            "public static void main(String[] args) {\n" +
            "for(int i=1;i<=5;i++){\n" +
            "for(int j=1;j<=i;j++){\n" +
            "\t\tSystem.out.print(\"* \");\n" +
            "}\n" +
            "System.out.println();//new line\n" +
            "}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>* \n" +
            "* * \n" +
            "* * * \n" +
            "* * * * \n" +
            "* * * * * \n" +
            "</pre></div>\n" +
            "<p><strong>Pyramid Example 2:</strong></p>\n" +
            "<p><strong>PyramidExample2.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "public class PyramidExample2 {\n" +
            "public static void main(String[] args) {\n" +
            "int term=6;\n" +
            "for(int i=1;i<=term;i++){\n" +
            "for(int j=term;j>=i;j--){\n" +
            "\t\tSystem.out.print(\"* \");\n" +
            "}\n" +
            "System.out.println();//new line\n" +
            "}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>* * * * * * \n" +
            "* * * * * \n" +
            "* * * * \n" +
            "* * * \n" +
            "* * \n" +
            "*  \n" +
            "</pre></div>\n" +
            "<h2 class=\"h2\">Java for-each Loop</h2>\n" +
            "<p>The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.</p>\n" +
            "<p>It works on the basis of elements and not the index. It returns element one by one in the defined variable.</p>\n" +
            "<p><strong>Syntax:</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "for(data_type variable : array_name){  \n" +
            "//code to be executed  \n" +
            "}  \n" +
            "</textarea></div>\n" +
            "<p><strong>Example:</strong></p>\n" +
            "<p><strong>ForEachExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "//Java For-each loop example which prints the\n" +
            "//elements of the array\n" +
            "public class ForEachExample {\n" +
            "public static void main(String[] args) {\n" +
            "    //Declaring an array\n" +
            "\tint arr[]={12,23,44,56,78};\n" +
            "\t//Printing array using for-each loop\n" +
            "\tfor(int i:arr){\n" +
            "\t\tSystem.out.println(i);\n" +
            "\t}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<span class=\"testit\"><a href=\"https://compiler.javatpoint.com/opr/test.jsp?filename=ForEachExample\" target=\"_blank\">Test it Now</a></span>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>12\n" +
            "23\n" +
            "44\n" +
            "56\n" +
            "78\n" +
            "</pre></div>\n" +
            "<h2 class=\"h2\">Java Labeled For Loop</h2>\n" +
            "<p>We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful while using the nested for loop as we can break/continue specific for loop.</p>\n" +
            "<h4 class=\"n\">Note: The break and continue keywords breaks or continues the innermost for loop respectively.</h4>\n" +
            "<p><strong>Syntax:</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "labelname:  \n" +
            "for(initialization; condition; increment/decrement){  \n" +
            "//code to be executed  \n" +
            "}  \n" +
            "</textarea></div>\n" +
            "<p><strong>Example:</strong></p>\n" +
            "<p><strong>LabeledForExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "//A Java program to demonstrate the use of labeled for loop\n" +
            "public class LabeledForExample {\n" +
            "public static void main(String[] args) {\n" +
            "    //Using Label for outer and for loop\n" +
            "\taa:\n" +
            "\t\tfor(int i=1;i<=3;i++){\n" +
            "\t\t\tbb:\n" +
            "\t\t\t\tfor(int j=1;j<=3;j++){\n" +
            "\t\t\t\t\tif(i==2&amp;&amp;j==2){\n" +
            "\t\t\t\t\t\tbreak aa;\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t\tSystem.out.println(i+\" \"+j);\n" +
            "\t\t\t\t}\n" +
            "\t\t}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>1 1\n" +
            "1 2\n" +
            "1 3\n" +
            "2 1\n" +
            "</pre></div>\n" +
            "<p>If you use <strong>break bb;</strong>, it will break inner loop only which is the default behaviour of any loop.</p>\n" +
            "<p><strong>LabeledForExample2.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "public class LabeledForExample2 {\n" +
            "public static void main(String[] args) {\n" +
            "\taa:\n" +
            "\t\tfor(int i=1;i<=3;i++){\n" +
            "\t\t\tbb:\n" +
            "\t\t\t\tfor(int j=1;j<=3;j++){\n" +
            "\t\t\t\t\tif(i==2&amp;&amp;j==2){\n" +
            "\t\t\t\t\t\tbreak bb;\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t\tSystem.out.println(i+\" \"+j);\n" +
            "\t\t\t\t}\n" +
            "\t\t}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>1 1\n" +
            "1 2\n" +
            "1 3\n" +
            "2 1\n" +
            "3 1\n" +
            "3 2\n" +
            "3 3\n" +
            "</pre></div>\n" +
            "<h2 class=\"h2\">Java Infinitive for Loop</h2>\n" +
            "<p>If you use two semicolons ;; in the for loop, it will be infinitive for loop.</p>\n" +
            "<p><strong>Syntax:</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "for(;;){\n" +
            "//code to be executed\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Example:</strong></p>\n" +
            "<p><strong>ForExample.java</strong></p>\n" +
            "<div class=\"codeblock\"><textarea name=\"code\" class=\"java\">\n" +
            "//Java program to demonstrate the use of infinite for loop\n" +
            "//which prints an statement\n" +
            "public class ForExample {\n" +
            "public static void main(String[] args) {\n" +
            "    //Using no condition in for loop\n" +
            "\tfor(;;){\n" +
            "\t\tSystem.out.println(\"infinitive loop\");\n" +
            "\t}\n" +
            "}\n" +
            "}\n" +
            "</textarea></div>\n" +
            "<p><strong>Output:</strong></p>\n" +
            "<div class=\"codeblock3\"><pre>infinitive loop\n" +
            "infinitive loop\n" +
            "infinitive loop\n" +
            "infinitive loop\n" +
            "infinitive loop\n" +
            "ctrl+c\n" +
            "</pre></div>\n" +
            "<p>Now, you need to press ctrl+c to exit from the program.</p>\n" +
            "<h2 class=\"h2\">Java for Loop vs while Loop vs do-while Loop</h2>\n" +
            "<table class=\"alt\">\n" +
            "<tr>\n" +
            "<th>Comparison</th>\n" +
            "<th>for loop</th>\n" +
            "<th>while loop</th>\n" +
            "<th>do-while loop</th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>Introduction</td>\n" +
            "<td>The Java for loop is a control flow statement that iterates a part of the <a href=\"java-programs\">programs</a> multiple times. </td>\n" +
            "<td>The Java while loop is a control flow statement that executes a part of the programs repeatedly on the basis of given boolean condition.</td>\n" +
            "<td>The Java do while loop is a control flow statement that executes a part of the programs at least once and the further execution depends upon the given boolean condition.</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>When to use</td>\n" +
            "<td>If the number of iteration is fixed, it is recommended to use for loop.</td>\n" +
            "<td>If the number of iteration is not fixed, it is recommended to use while loop.</td>\n" +
            "<td>If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use the do-while loop.</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>Syntax</td>\n" +
            "<td>for(init;condition;incr/decr){ <br>\n" +
            "// code to be executed <br>\n" +
            "}\n" +
            "</td>\n" +
            "<td>\n" +
            "while(condition){ <br>\n" +
            "//code to be executed <br>\n" +
            "}\n" +
            "</td>\n" +
            "<td>\n" +
            "do{ <br>\n" +
            "//code to be executed <br>\n" +
            "}while(condition);\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>Example</td>\n" +
            "<td>\n" +
            "//for loop <br>\n" +
            "for(int i=1;i&lt;=10;i++){ <br>\n" +
            "System.out.println(i); <br>\n" +
            "}\n" +
            "</td>\n" +
            "<td>\n" +
            "//while loop <br>\n" +
            "int i=1; <br>\n" +
            "while(i&lt;=10){ <br>\n" +
            "System.out.println(i);<br>\n" +
            "i++; <br>\n" +
            "} </td>\n" +
            "<td>\n" +
            "//do-while loop <br>\n" +
            "int i=1; <br>\n" +
            "do{ <br>\n" +
            "System.out.println(i);<br>\n" +
            "i++; <br>\n" +
            "}while(i&lt;=10);\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>Syntax for infinitive loop</td>\n" +
            "<td>\n" +
            "for(;;){ <br>\n" +
            "//code to be executed <br>\n" +
            "}</td>\n" +
            "<td>\n" +
            "while(true){ <br>\n" +
            "//code to be executed <br>\n" +
            "}</td>\n" +
            "<td>\n" +
            "do{ <br>\n" +
            "//code to be executed <br>\n" +
            "}while(true);\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "<hr />", "", ""};

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

        //On contribute Click Listener
        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Learn.this, LearnEach.class);
                intent.putExtra("title", "Basics");
                intent.putExtra("content", data[1]);
                startActivity(intent);
            }
        });
        //Loops
        loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Learn.this, LearnEach.class);
                intent.putExtra("title", "Loops");
                intent.putExtra("content", data[2]);
                startActivity(intent);
            }
        });


    }
}
