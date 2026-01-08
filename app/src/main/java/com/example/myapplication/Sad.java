package com.example.myapplication;

import java.util.Date;

public class Sad extends Mood {
    private Date moodDate;

    public Sad(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Sad() {
        this.moodDate = new Date();
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public String mood() {
        return "Sad";
    }
}
