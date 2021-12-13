package com.dataart.school.lessons.Lecture9.PrintingHouse;

public class MainForPrintingHouse {
    public static void main(String[] args) {
        IPrintingHouse khersonPrintingHouse = new IPrintingHouse() {
            @Override
            public String printBook(String name, String book) {
                return name + " wrote the book " + book;
            }
        };
        System.out.println(khersonPrintingHouse.printBook("Bram Stoker","Dracula."));

        //Lambda printing house for functional interface
        IPrintingHouse londonOrintingHouse = ((name, book) -> name+ " wrote the book " + book);
        System.out.println(londonOrintingHouse.printBook("Bram Stoker","Dracula".concat(".")));
    }
}
