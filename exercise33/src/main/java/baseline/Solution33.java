/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);
    private static final Random r = new Random();
    public final String[] answers = {"Yes", "NO", "Maybe", "Ask again later."};

    public void askQuestion(){
        //ask for a question
        System.out.print("Ask me anything \n>");
        in.next();
    }

    public int RNG(){
        //return a random number 1-4
        return r.nextInt(4);
    }

    public String giveAnswer(int rng){
        //returns an answer as the string
        return answers[rng];
    }

    public static void main(String[] args){
        Solution33 s = new Solution33();
        //prompt user for a simple question
        s.askQuestion();
        //get a random number from an RNG
        //print out one of the answers listed above
        System.out.printf("%s", s.giveAnswer(s.RNG()));
    }


}
