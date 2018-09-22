package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tamm on 9/18/18.
 */

public class BadMood extends CurrentMood {
    private String currentMood;

    BadMood(){
        super();
    }

    BadMood(Date date){
        super(date);
    }

    public Date getDate(){
        return super.getDate();
    }

    public void setDate(Date date){
        super.setDate(date);
    }

    @Override
    public String showMood(){
        this.currentMood = "I am in a bad mood!";
        return currentMood;
    }


    @Override
    public Boolean isGoodMood(){
        return false;
    }
}
