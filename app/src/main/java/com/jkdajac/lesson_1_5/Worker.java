package com.jkdajac.lesson_1_5;

import android.util.Log;

public class Worker extends Human{
    String author;

    public Worker(String spiderman) {
        super(spiderman);
    }

    @Override
    public void setHumanName(String humanName) {
        super.setHumanName(humanName);
    }

    @Override
    public void setHumanLastName(String humanLastName) {
        super.setHumanLastName(humanLastName);
    }

      String createSignature(){
          Log.d("MyLOG", "Spiderman");
        return author;

    }
}
