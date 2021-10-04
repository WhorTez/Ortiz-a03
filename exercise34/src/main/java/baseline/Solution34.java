/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in);
    private String removed;
    private final String[] employees = {"Bruce Banner", "Wonder Woman", "Tony Stark", "Dr. Strange", "Your Mom"};

    private String nameToRemove(){
        //ask user which name they want to remove
        System.out.println("\nWhich name would you like to remove?");
        // return input
        return in.nextLine();
    }

    public void initialArray(String[] employees){
        //print how many people are employed
        System.out.printf("There are %d people:%n", employees.length);
        // use a for loop to print each employees name
        for(int i=0;i< employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    public String[] removeFromInitialArray(String removed, String[] names){
        //make a copy of the first array with one less entry
        String[] copy = new String[names.length -1];
        int j =0;

        for(int i=0; i< employees.length; i++){
            if(!names[i].equals(removed)){
                copy[j++] = names[i];
            }
        }
        return copy;
    }

    public static void main(String[] args){
        Solution34 s = new Solution34();
        //print the first array with 5 employees
        s.initialArray(s.employees);
        //ask which name to be removed
        s.removed = s.nameToRemove();
        //call the first array but with new arrays parameters
        s.initialArray(s.removeFromInitialArray(s.removed, s.employees));
    }

}
