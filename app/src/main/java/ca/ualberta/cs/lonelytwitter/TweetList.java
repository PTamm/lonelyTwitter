package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int idx){
        //return new NormalTweet("some new tweet");

        return tweets.get(idx);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
}
