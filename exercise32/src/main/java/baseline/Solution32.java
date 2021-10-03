/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    private int difficulty;
    private int randomNumber;
    private static final String ERROR = "That was not a number.";
    private static final Scanner in = new Scanner(System.in);
    public static final Random num = new Random();

    public void guessTheNumber(int randomNumber) {
        int counter = 1;
        int guess;

        while (true) {
            try {
                //prompt the user to  guess a number for the first time
                System.out.println("I've got a number in mind, lets see if you can guess it: ");
                guess = in.nextInt();
                counter++;
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERROR);
                in.nextLine();
                counter++;
            }
        }
        while (true) {
            try {
                //while userGuess doesn't equal the random number
                while (guess != randomNumber) {
                    //check whether number is too low or too high and print the proper message to the user
                    if (guess < randomNumber) {
                        System.out.println("Good try but you gotta guess a little higher than that.");
                    } else {
                        System.out.println("Too high try going a little lower.");
                    }
                    //clear out hte user's guess and prompt for another guess
                    guess = in.nextInt();
                    //increment the counter +1
                    counter++;
                    //print out the amount of guesses it took the user
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(ERROR);
                in.nextLine();
                counter++;
            }
        }
        System.out.printf("Congrats you guessed the right number in %d trys!", counter);
    }


    public int getDifficulty() {

            while (true) {
                try {
                    //prompt 1,2 or 3 for the difficulty
                    System.out.println("Choose the difficulty of the game: ");
                    // return the difficulty chosen
                    return in.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println(ERROR);
                    in.nextLine();
                }
            }
        }

    public int difficulty1RNG(){
        //return an int between 1 and 10
        return num.nextInt(10) +1;
    }

    public int difficulty2RNG(){
        //return an int between 1 and 100
        return num.nextInt(100) +1;
    }

    public int difficulty3RNG(){
        //return an int between 1 and 1000
        return num.nextInt(1000) +1;
    }

    public static void main(String[] args){
        Solution32 s = new Solution32();
        //print a welcome message
        System.out.println("I want to play a game, I choose a number you guess it.");
        // calls the getDifficulty method
        s.difficulty = s.getDifficulty();
        //check game difficulty using if statements and calls the proper random number generator for the difficulty chosen
        if(s.difficulty == 1){
            s.randomNumber = s.difficulty1RNG();
        }
        if(s.difficulty == 2){
            s.randomNumber = s.difficulty2RNG();
        }
        if(s.difficulty == 3){
            s.randomNumber = s.difficulty3RNG();
        }
        //calls guessTheNumber
        s.guessTheNumber(s.randomNumber);
    }



}
