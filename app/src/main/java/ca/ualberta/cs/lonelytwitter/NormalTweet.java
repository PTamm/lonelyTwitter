package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tamm on 9/18/18.
 */

public class NormalTweet extends Tweet {

    NormalTweet(){
        super();
    }

    NormalTweet(String message){
        super();
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
