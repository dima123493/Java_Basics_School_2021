package com.dataart.school.lessons.Lecture3;

public class IfExamples {

    public static void main(String[] args) {

        int age1 = 20;

        if (age1>18){
            System.out.println("Age is greater than 18");
        }

        int number = 13;

        if (number %2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        String result = (number %2==0) ? "Even number" : "Odd number";
        System.out.println(result);

        int number1=-13;

        if (number1>0){
            System.out.println("Positive");
    } else if(number1<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

        int age =25;
        int weight =48;

        if (age>=18){
            if (weight>50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible to donate blood");
            }
            }else{
            System.out.println("Your age must be greater then 18");
        }
        }
}
