package com.lcwd.test;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Last Name:");
        String lastName =scanner.nextLine();

        if(isValid(lastName)){
            System.out.println("Valid Last name");
        }else {
            System.out.println("Invalid Last name:");
        }
    }
    public static boolean isValid(String lastName){
        if(lastName==null || lastName.isEmpty() || lastName.length()<3){
            return false;
        }
        char lastChar = lastName.charAt(0);
        return Character.isUpperCase(lastChar);
    }

}

