package com.dataart.school.practice.HomeTask2;

import java.util.ArrayList;

public class Calculation {

    public static void allInfoDisplay(ArrayList<Animals> animal) {
        animal.forEach(System.out::println);
    }

    public static void nutrition(ArrayList<Animals> listOfAnimals) {
        String[] foodMenu = {"meat", "plants"};
        listOfAnimals.forEach(animal -> {
            for (String food : foodMenu) animal.eat(food);
        });
        System.out.println();
    }

}
