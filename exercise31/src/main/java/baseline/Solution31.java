/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31 {
    private int age;
    private int RHR;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Solution31 s = new Solution31();
        //get age and resting heart rate from the user
        s.age = s.getAge();
        s.RHR = s.getRestingHeartRate();
        //print said age and heart rate
        System.out.printf("Resting Pulse: 5d\t\t Age: 5d%n", s.RHR, s.age);
        //call a function that will print a table displaying the info
        s.printTable();
    }

    public int getAge() {
        int age;
        while (true) {
            //prompt the user for their age
            System.out.println("Please enter your age: ");
            try {
                age = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Only enter numbers");
                in.nextLine();
            }
            //return the input
        }
        return age;
    }

    public int getRestingHeartRate() {
        int heartRate;
        while (true) {
            //prompt the user for their resting heart rate
            System.out.println("Please enter your resting heart rate: ");
            try {
                heartRate = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Only enter numbers");
                in.nextLine();
            }
            //return the input
        }
        return heartRate;
    }


    public int karvonenHeartRateCalc(int age, int RHR, double intensity){
        //return the heart rate using the provided formula
        return (int) Math.round((((220-age)-RHR)*intensity)+RHR);
    }

    public void printTable(){
        char column = '|';
        System.out.printf("Intensity\t%cRate%n", column);
        System.out.printf("------------------%n");
        //loop starts at 55 and increases by 5
        for(int i = 55; i <= 95;i+=5){
            //print out the intensity followed by a dashed line
        System.out.printf("%d%%\t\t\t%c", i, column);
        System.out.printf("%d bpm", karvonenHeartRateCalc(age, RHR, i/100.0));
        System.out.printf("%n");
            }
    }
}