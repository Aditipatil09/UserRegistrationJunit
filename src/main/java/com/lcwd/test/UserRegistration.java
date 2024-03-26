package com.lcwd.test;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Email Id:");
        String emialId =scanner.nextLine();

        if(isValid(emialId)){
            System.out.println("Valid Email Id:");
        }else {
            System.out.println("Invalid Email Id:");
        }


    }
    public static boolean isValid(String emialId){

        String Regex = "[a-z 0-9]+[@][a-z]+[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(emialId);

        return matcher.matches();

    }

}

