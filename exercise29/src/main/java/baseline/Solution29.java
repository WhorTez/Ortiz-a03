/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args){
       //print out the total
        Solution29 s = new Solution29();

        s.ruleOf72Calc(s.input());
    }

    public double input(){
        //Prompt a user to enter rate of return(r)
        while(true){
            System.out.println("Enter your rate of return (r): ");

            try{
                if(in.nextInt() <= 0) {
                    throw new IllegalArgumentException();
                }
                break;
            }catch(IllegalArgumentException | InputMismatchException e){
                System.out.print("That is an invalid input try again.");
                in.nextLine();
            }
        }
        // if user enters any invalid input such as a zero or any non-numeric value don't exit program loop to allow new input
        //use chapter 11 sample code for assistance on tha
        //return valid input
        return in.nextInt();
    }

    public double ruleOf72Calc(double rateOfReturn){
        //use formula provided and r to calculate years
        // return total
        return 72/rateOfReturn;
    }
}
