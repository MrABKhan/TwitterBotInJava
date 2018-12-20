package twitterbot;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.InputStream;

public class TwitterBot {

    public static void main(){

    }

    private static void TweetFromSource(){
        InputStream inputStream = null; // To Be Added.

        //Insert Method for getting tweets after sentiment analysis
    }

    private static void SendTweet(String inputTweet){
        Twitter twitter = TwitterFactory.getSingleton();
        Status status;

        try {
            status = twitter.updateStatus(inputTweet);
            System.out.println("Sending Status: " + status);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
