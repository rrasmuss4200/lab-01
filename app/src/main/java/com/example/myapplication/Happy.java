package com.example.myapplication;

import java.util.Date;

public class Happy extends Mood {
    private Date moodDate;

    public Happy(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Happy() {
        this.moodDate = new Date();
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public String mood() {
        return "Happy";
    }
}
