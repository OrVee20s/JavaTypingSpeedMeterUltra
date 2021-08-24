package com.company;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    //StringArray For Assigning the words. Can be accessed by everyone without a object
    static String[] words = {"dog", "deer", "cat", "monkey", "leo", "sherkhan", "fox", "cow", "elephant ", "cock", "Horse", "beer"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println(3);

        TimeUnit.SECONDS.sleep(1); //this is for making the intervals of counting startup
        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i=0; i<12; i++)
        {
            System.out.print(words[rand.nextInt(9)] + " ");//getting ready for writing
        }
        System.out.println();

        //--------------strategy: the counter will startdeeer counting from here---------------
        double start = LocalTime.now().toNanoOfDay();

        Scanner obj = new Scanner(System.in);
        String typedwords = obj.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        //--------------strategy: the counter will stop counting after this---------------
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;

        int numChars = typedwords.length();

        //the main strategy is: ( characters /5 )/ 1min = y WPM

        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

        System.out.println("Your WPM is: "+wpm + " !");

    }
}
