/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

public class Solution32 {
    private int difficulty;
    private int randomNumber;

    public static void main(String[] args){
        Solution32 s = new Solution32();
        //print a welcome message
        // calls the getDifficulty method
        //check game difficulty using if statements and calls the proper random number generator for the difficulty chosen
        //calls guessTheNumber
    }

    public void guessTheNumber(int randomNumber){
        int counter =1;
        //prompt the user to  guess a number for the first time

        //while userGuess doesn't equal the random number
            //check whether number is too low or too high and print the proper message to the user
            //clear out hte user's guess and prompt for another guess
            //increment the counter +1

        //print out the amount of guesses it took the user
    }

    public int getDifficulty(){
        //prompt 1,2 or 3 for the difficulty
        // return the difficulty chosen
    }

    public int difficulty1RNG(){
        //return an int between 1 and 10
    }

    public int difficulty2RNG(){
        //return an int between 1 and 100
    }

    public int difficulty3RNG(){
        //return an int between 1 and 1000
    }


}
