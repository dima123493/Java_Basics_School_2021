package com.dataart.school.lessons.Lecture9.FunctionalInterface;

import com.dataart.school.lessons.Lecture9.Dancing.IDancer;
import com.dataart.school.lessons.Lecture9.PrintingHouse.IPrintingHouse;

public class Main {
    public static void main(String[] args) {
        //TODO Implement Dancer as normal interface
        IDancer iDancer = new IDancer() { //Connected to Dancing package
            @Override
            public void dance() {
                System.out.println("Test");
            }
        };
        //TODO Call the implementation method
        iDancer.dance();
        //TODO Implement lambda for Dancer
        IDancer iDancer1 = () -> System.out.println("Test text");
        iDancer1.dance();

        //TODO Implement Printing house as normal interface
        IPrintingHouse printingHouse = new IPrintingHouse() {
            @Override
            public String printBook(String name, String book) {
                return name + " wrote the book " + book;
            }
        };
        System.out.println(printingHouse.printBook("Bram Stocker","Dracula"));

        //TODO Implement lambda for Printing house
        IPrintingHouse printingHouse1 = (name,  book) -> name + " wrote the book " + book;
        System.out.println(printingHouse1.printBook("Bram Stocker","Dracula"));
    }

    private static void callDancer(IDancer dancer) {
        dancer.dance();
    }

}
