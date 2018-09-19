package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tamm on 9/18/18.
 */

public class ImportantTweet extends Tweet {

    //ImportantTweet constructor is overloaded!

    ImportantTweet(){
        super(); // taking advantage of the superclass; simplifies things a lot!
    }

    ImportantTweet(String message){
        super(message);
    }

    @Override //An example of overriding!
    public Boolean isImportant(){
        return true;
    }
}
