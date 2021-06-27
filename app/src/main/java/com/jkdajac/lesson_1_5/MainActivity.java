package com.jkdajac.lesson_1_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("Peter", "Parker");
        human.getHumanName();
        human.getHumanLastName();





        Worker worker = new Worker("Spiderman");
        worker.createSignature();




    }
}