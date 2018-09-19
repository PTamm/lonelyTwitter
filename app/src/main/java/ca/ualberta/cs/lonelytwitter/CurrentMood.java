package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tamm on 9/18/18.
 */

public abstract class CurrentMood {
    private Date date;

    CurrentMood(){
        this.date = new Date();
    }

    CurrentMood(Date givenDate){
        this.date = givenDate;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date newDate){
        this.date = newDate;
    }

    // Abstract method ...
    public abstract Boolean isGoodMood();
    public abstract String showMood();
}
