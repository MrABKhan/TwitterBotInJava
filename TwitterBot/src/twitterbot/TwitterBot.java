package twitterbot;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.*;

public class TwitterBot {

    public static void main(){
        TweetFromSource();
    }

    private static void TweetFromSource(){
        try {
            InputStream inputStream = new FileInputStream("C:\\gitrepo\\TwitterBotInJava\\TwitterBot\\resources\\tweets.txt"); // To Be Added.
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String readLine;

            while((readLine = bufferedReader.readLine())!=null){

                SendTweet(readLine);
                System.out.println("Sending Tweet :" + readLine);
            }


        } catch (FileNotFoundException e) {

            System.out.println("File Not Found Exception");

            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("IO exception");

            e.printStackTrace();
        }

        //Insert Method for getting tweets after sentiment analysis
    }

    private static void SendTweet(String inputTweet){
        Twitter twitter = TwitterFactory.getSingleton();
        Status status;

        try {
            status = twitter.updateStatus(inputTweet);
            System.out.println("Sending Status: " + status);
        } catch (TwitterException e) {
            System.out.println("Exception related to twitter4j");
            e.printStackTrace();
        }
    }

}
