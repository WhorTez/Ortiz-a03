/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution28 {
    private int total;
    private static final Scanner in = new Scanner(System.in);

    public int input() {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }
    public int addNumbers(int num){
        //prompt user to enter a number 5 times using a loop
        //each time a number is entered add it to the sum of all numbers
        total += num;
        //return the sum
        return total;
    }
    public static void main(String[] args){
        Solution28 s = new Solution28();
        //set total equal to the return value of method addNumbers
        for(int i =0; i<5; i++){
            s.addNumbers(s.input());
        }
        //print out the sum of all numbers
        System.out.println("The sum is "+ s.total);
    }
}
