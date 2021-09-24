/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);
    // Get strings from the user
        // prompt for string1
            //store string1
        // prompt for string2
            //store string2

    // use boolean to return true or false isAnagram

        // compare strings
            //check if they contain the same amount of characters
                // if not they're not anagrams

            //if they contain the same amount proceed
                //check if the characters of both strings are the same
                    //if they are the same then we have an anagram
                    //if they are not the same then they are not anagrams

        // output will say if strings are anagrams or not

    public static void main(String[] args){
        System.out.println("Enter two strings and this program will tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String string1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = in.nextLine();

        if(Anagram.isAnagram(string1, string2)){
            System.out.println("The two strings are anagrams of each other.");
        }else{
            System.out.println("The two strings you entered are not anagrams of each other.");
        }
    }
}
