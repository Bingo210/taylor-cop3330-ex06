/*
 * UCF COP3330 Fall 2021 Assignment 6 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int year = LocalDate.now().getYear();

        System.out.println( "What is your current age?" );
        String userAge = input.nextLine();
        int num1 = Integer.valueOf(userAge);

        System.out.println( "At what age would you like to retire?" );
        String userRetirementAge = input.nextLine();
        int num2 = Integer.valueOf(userRetirementAge);

        int yearsLeft = num2 - num1;
        int retireYear = year + yearsLeft;

        System.out.println("It's " + year + ", so you can retire in " + retireYear + ".");
    }
}
