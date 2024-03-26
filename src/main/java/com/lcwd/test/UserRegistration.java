package com.lcwd.test;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Phone Number:");
        String password =scanner.nextLine();

        if(isValid(password)){
            System.out.println("Valid Password:");
        }else {
            System.out.println("Invalid Password:");
        }


    }
    public static boolean isValid(String password){

        String Regex = "[0-9]*[a-zA-Z0-9]{8,}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();

    }

}

