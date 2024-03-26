package com.lcwd.test;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first Name:");
        String firstName =scanner.nextLine();

        if(isValid(firstName)){
            System.out.println("Valid first name");
        }else {
            System.out.println("Invalid first name:");
        }
    }
    public static boolean isValid(String firstName){
        if(firstName==null || firstName.isEmpty() || firstName.length()<3){
            return false;
        }
        char lastChar = firstName.charAt(0);
        return Character.isUpperCase(lastChar);
    }

}

