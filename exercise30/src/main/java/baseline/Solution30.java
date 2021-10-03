/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

public class Solution30 {
    public static void main(String[] args){
        Solution30 s = new Solution30();
        //calls the print times table method
        s.printTimesTable();
    }

    public void printTimesTable(){
        //use two nested loops each printing out 1-12 inclusive
        //calls the multiplication method with the loop variables as input
        for (int i=1; i<=12; i++){
            for(int j=1; j<=12; j++){
                System.out.printf("%5d", multiplication(i,j));
            }
            System.out.printf("%n");
        }

    }

    public int multiplication(int a, int b){
        //returns a * b
        return a*b;
    }
}
