package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tamm on 9/18/18.
 */

public class GoodMood extends CurrentMood {
    private String currentMood;

    GoodMood(){
        super();
    }

    GoodMood(Date date){
        super(date);
    }

    @Override
    public String showMood(){
        this.currentMood = "I am in a good mood!";
        return currentMood;
    }

    @Override
    public Boolean isGoodMood(){
        return true;
    }
}
