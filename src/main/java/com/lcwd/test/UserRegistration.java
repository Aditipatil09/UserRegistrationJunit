package com.lcwd.test;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Phone Number:");
        String phoneNumber =scanner.nextLine();

        if(isValid(phoneNumber)){
            System.out.println("Valid Phone Number:");
        }else {
            System.out.println("Invalid Phone number:");
        }


    }
    public static boolean isValid(String phoneNumber){

        String Regex = "[91][0-9]{10}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();

    }

}

