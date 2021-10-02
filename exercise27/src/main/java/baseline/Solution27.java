/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);
    private boolean error;
    private String firstName;
    private String lastName;
    private String employeeID;
    private String notifyError;
    private int zipCode;

    public static void main(String[] args){
        Solution27 s = new Solution27();
        // calls a user input function
        s.input();

        // calls validateInput
        s.error = s.validateInput(s.firstName, s.lastName, s.employeeID, s.zipCode);
        System.out.println(s.error ? "There were no errors found." : s.notifyError);
    }

    public void input(){
        //prompt user for firstName
        System.out.println("Enter your first name: ");
        firstName = in.nextLine();
        //prompt user for lastName
        System.out.println("Enter your last name: ");
        lastName = in.nextLine();
        //prompt user for ID
        System.out.println("Enter your employee ID: ");
        employeeID = in.nextLine();
        //prompt user for zipCode
        System.out.println("Enter your zipcode: ");
        zipCode = in.nextInt();
    }

    public boolean validateInput(String firstName, String lastName, String employeeID, int zipCode){
        //check length of first and last name to be greater than 2
        boolean fLength = validateNameLength(firstName);
        boolean lLength = validateNameLength(lastName);
        //check if first and last name are filled in
        boolean fFilled = validateNameFilledOut(firstName);
        boolean lFilled = validateNameFilledOut(lastName);
        //check employeeID is in correct format
        boolean idCorrectFormat = validateEmployeeID(employeeID);
        //check zipCode is 5 digits
        boolean zipCodeCorrect = validateZipCode(zipCode);
        //method returns true if all statements are correctly met
        if (fLength && lLength && fFilled && lFilled && idCorrectFormat && zipCodeCorrect)
        {
            return true;
        }else {
            notifyError = errorLocator(fLength, lLength, fFilled, lFilled, idCorrectFormat, zipCodeCorrect);
            return false;
        }
        //if any condition is false print out an error message
    }

    private String errorLocator(boolean fLength, boolean lLength, boolean fFilled, boolean lFilled, boolean idCorrectFormat, boolean zipCodeCorrect) {
        String completeError = "";
        if (!fLength) {
            completeError += "\nThe first name must be at least two letters long. ";
        }
        if (!lLength) {
            completeError += "\nThe last name must be at least two letters long. ";
        }
        if (!fFilled) {
            completeError += "\nThe first name must be filled in. ";
        }
        if (!lFilled) {
            completeError += "\nThe last name must be filled in. ";
        }
        if (!idCorrectFormat) {
            completeError += "\nYour employee ID should be in the format of 2 letters a hyphen followed by 4 numbers. ";
        }
        if (!zipCodeCorrect) {
            completeError += "\nThe zipcode must be 5 digits. ";
        }
            return completeError;
    }

    public boolean validateNameLength(String name){
        //return true if first and last names are at least 2 chars long
        if(name.length() >= 2){
            return true;
        }
        return false;
    }

    public boolean validateNameFilledOut(String name){
        //return true if name is NOT null
        if(name.length() != 0){
            return true;
        }
        return false;
    }

    public boolean validateEmployeeID(String employeeID){
        if(employeeID.length() != 7){
            return false;
        }

        //take input and place into a character array
            //check for 2 letters, a hyphen, and 4 numbers

        if(!Character.isLetter(employeeID.charAt(0)) || !Character.isLetter(employeeID.charAt(1))
                || employeeID.charAt(2) != '-' || !Character.isDigit(employeeID.charAt(3)) || !Character.isDigit(employeeID.charAt(4)) || !Character.isDigit(employeeID.charAt(5))
                || !Character.isDigit(employeeID.charAt(6)))
        {
            return false;
        }
        //return true if the condition is met
        return true;
    }

    public boolean validateZipCode(int zipCode){
        // check if zipCode is < 100000 && zipcode is > 9999
        if(zipCode > 9999 && zipCode < 100000){
            return true;
        }
        return false;
    }
}
