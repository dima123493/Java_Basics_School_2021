package com.dataart.school.lessons.Lecture2;

public class StringExample {
    public static void main(String[] args) {
        String greeting ="Hello world!";
        String greeting1 = new String("Hello world!");
        String greeting2= new String(greeting1);

        char[] helloArray = {'H','e','l','l','o','.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        int len = helloString.length();
        System.out.println("String length is "+len);

        System.out.println(greeting.concat(helloString));

        String name = "My name is ".concat("Dmytro");
        System.out.println(name);

        System.out.println("Hello,"+" world"+"!");

        String name1 = "Dmytro";
        String formatedString = String.format("My name is %s. I live in %s!",name1,"Kryvyi Rih");
        System.out.println(formatedString);

        char ch = formatedString.charAt(0);
        System.out.println(ch);
    }
}
