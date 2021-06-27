package com.jkdajac.lesson_1_5;

import android.util.Log;

public class Human {
    String humanName;
    String humanLastName;

    public Human(String humanName, String humanLastName) {
        this.humanName = humanName;
        this.humanLastName = humanLastName;
    }

    public Human(String spiderman) {

    }

    public String getHumanName() {
        Log.d("MyLOG", "Peter");
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;

    }

    public String getHumanLastName() {
        Log.d("MyLOG", "Parker");
        return humanLastName;

    }

    public void setHumanLastName(String humanLastName) {
        this.humanLastName = humanLastName;

    }



}
