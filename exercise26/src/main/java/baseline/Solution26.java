/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution26 {
private static final Scanner in = new Scanner(System.in);

 public float getAPR(){
       // this method will get the APR in percentage from the user
           // Ask user for the APR
     System.out.println("What is the APR on the card (as a percent)? ");
     float apr = in.nextInt();
        //Divide the input by 100 to get the percentage
     apr = apr/100;
        // Divide APR by 365 to get daily rate i
     apr = apr/365;
         //return the APR
     return apr;
         }

 public float getBalance(){
     //this method will ask the user for the credit card balance
 System.out.println("What is the balance on the card? ");
     // return the balance
return in.nextFloat();
 }

 public float getMonthlyPayment(){
        //Get the minimum monthly payment the User can make
     System.out.println("What is the minimum monthly payment you're willing to do? ");
       // return monthly payment
     return in.nextFloat();
        }

    public static void main(String[] args){
        Solution26 s = new Solution26();
        //Call method calculateMonthsUntilPaidOff using variables obtained from this class
        PaymentCalculator calc = new PaymentCalculator(s.getBalance(), s.getMonthlyPayment(), s.getAPR());
        //print out the value returned from the above method
        System.out.printf("It will take %d months to pay off this card.", calc.calculateMonthsUntilPaidOff());
    }

}
