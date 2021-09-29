/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

public class Solution27 {
    private boolean error;
    private String firstName;
    private String lastName;
    private String employeeID;
    private int zipCode;

    public static void main(String[] args){
        // calls a user input function
        // calls validateInput
    }

    public void input(){
        //prompt user for firstName
        //prompt user for lastName
        //prompt user for ID
        //prompt user for zipCode
    }

    public boolean validateInput(String firstName, String lastName, String employeeID, int zipCode){
        //check length of first and last name to be greater than 2
        //check if first and last name are filled in
        //check employeeID is in correct format
        //check zipCode is 5 digits
        //method returns true if all statements are correctly met
        //if any condition is false print out an error message
    }

    public boolean validateNameLength(String name){
        //return true if first and last names are at least 2 chars long
    }

    public boolean validateNameFilledOut(String name){
        //return true if name is NOT null
    }

    public boolean validateEmployeeID(String employeeID){
        //take input and place into a character array
            //check for 2 letters, a hyphen, and 4 numbers
        //return true if the condition is met
    }

    public boolean validateZipCode(int zipCode){
        // check if zipCode is < 100000 && zipcode is > 9999
    }
}
