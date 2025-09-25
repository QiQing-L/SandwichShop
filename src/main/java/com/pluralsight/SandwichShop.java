package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //Exercises — Sandwich Shop: Exercise 1
        //This will be a point of sale application to calculate the cost of a sandwich.


        // We need user input, start with a scanner, then if else statement for sandwich size.
        Scanner userInput = new Scanner(System.in);

        //Prompt the user for the size of the sandwich (1 or 2):
        // a. 1: Regular: base price $5.45
        // b. 2: Large: base price $8.95
        //ask for size input

        System.out.println("What size of sandwich would you like?");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.println("Please enter 1 or 2");
        int sizeInput = userInput.nextInt();

        float regular = 5.45f;
        float large = 8.95f;

        //Prompt the user for their age:
        //a. Student (17 years old or younger) — receive a 10% discount
        //b. Seniors (65 years old or older) — receive a 20% discount
        //Display the cost of the sandwich to the screen
        //ask for age.

        System.out.println("What is your age?");
        int ageInput = userInput.nextInt();


















    }
}
