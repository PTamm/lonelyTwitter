package ca.ualberta.cs.lonelytwitter;  //groupings of classes related in some way

import java.util.Date;

/**
 * Created by tamm on 9/18/18.
 */

public abstract class Tweet implements Tweetable{

    private Date date; //Only this class has access to this data. most restricted to least: private --> no modifier --> protected --> public
    private String message; // non-static; defined with respect to particular instance
    private static final Integer MAX_CHARS = 140; //For instance of class; true for all of them. final makes it a constant

    Tweet() {
        this.date = new Date(); //this --> like self in Python
        this.message = "I am a default message";

    }

    Tweet(String message) {
        this.date = new Date();
        this.message = message; //Tweet myTweet = new Tweet('Test');
    }

    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }

    public String toString(){
        return getMessage();
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS){
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public abstract Boolean isImportant(); // no implementation; hence, abstract
}
