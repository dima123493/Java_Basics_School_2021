package com.dataart.school.lessons.Lecture1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add two numbers? (y/n)");
        String shouldAdd = scanner.next();
        if("y".equals(shouldAdd)){
            System.out.println("I will add two numbers for you!");
            System.out.println("Please, enter the first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Please, enter the second number");
            int secondNumber = scanner.nextInt();
            int sum = firstNumber+secondNumber;
            System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        }
        System.out.println("Thank you! It was a pleasure to work with you!");
    }
}
