package com.lcwd.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.PatternSyntaxException;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your Phone Number:");
            String password = scanner.nextLine();

            if(isValid(password)){
                System.out.println("Valid Password:");
            } else {
                System.out.println("Invalid Password:");
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter a valid input.");
        }
    }

    public static boolean isValid(String password){
        try {
            String Regex = "[0-9]*[a-zA-Z0-9]{8,}";
            Pattern pattern = Pattern.compile(Regex);
            Matcher matcher = pattern.matcher(password);

            return matcher.matches();
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid regular expression pattern.");
            return false;
        }
    }
}

