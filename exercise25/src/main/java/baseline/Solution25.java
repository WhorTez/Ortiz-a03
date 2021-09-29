/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution25 {

    private String password;
    private int strength;
    private static final Scanner in = new Scanner(System.in);

    public String input(){
        return in.nextLine();
    }
    public int passwordValidator(char[] password){
        boolean num = false;
        boolean character = false;
        boolean length = false;
        boolean specialChar = false;

        for(int i=0; i<password.length; i++){
            if (password[i] >= 48 && password[i] < 58){
                num = true;
            }
            if(password.length >=8){
                length = true;
            }
            if ((password[i] >= 65 && password[i] < 91) || (password[i] >=97 && password[i] < 123)){
                character = true;
            }
            if ((password[i] >= 33 && password[i] < 48) || (password[i] >=58 && password[i] < 65) || (password[i] >= 91 && password[i] < 97) || (password[i] >= 123 && password[i] < 127)){
                specialChar = true;
            }

        }

        if(num && !length && !specialChar && !character){
            return 1;
        }
        if(character && !length && !specialChar && !num){
            return 2;
        }
        if(num && character && length){
            if(specialChar){
                return 4;
            }
            return 3;
        }
       return 0;
    }
public static void main(String[] args) {
    //Get a password from the user
    //Prompt for password
    //Store password

    //---------------------------------------

    //Call function passwordValidator
    //Function will contain an if statement to determine the strength of the password entered
    //if password contains only numbers and is fewer than 8 characters
    //password is very weak
    //if password contains only letters and is fewer than 8 characters
    //password is weak
    //if password contains letters and at least one number and is at least eight characters
    //password is strong
    //if password  contains letters, numbers, and special characters and is at least eight characters
    //password is as good as it can be and is very strong
    //----------------------------------------
    //Output will let user know the strength of the password they entered and recommend an appropriate action
    Solution25 s = new Solution25();
    System.out.println("Enter your password: ");
    s.password = s.input();

    s.strength = s.passwordValidator(s.password.toCharArray());

    if (s.strength == 1) {
        System.out.printf("The password \"%s\" is very weak.", s.password);
    }

    if (s.strength == 2) {
        System.out.printf("The password \"%s\" is weak.", s.password);
    }

    if (s.strength == 3) {
        System.out.printf("The password \"%s\" is strong.", s.password);
    }

    if (s.strength == 4) {
        System.out.printf("The password \"%s\" is very strong.", s.password);
    }

    if (s.strength == 0) {
        System.out.printf("Strength of the password could not be determined", s.password);
    }
}
}