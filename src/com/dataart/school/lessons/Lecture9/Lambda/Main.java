package com.dataart.school.lessons.Lecture9.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> travelers = new ArrayList<>();
        travelers.add("Dmytro");
        travelers.add("Bogdan");
        travelers.add("Nika");

        //Anonymous class
    travelers.forEach(new Consumer<String>() {
        @Override
        public void accept(String traveler) {

        }
    });
        //Lambda expression
        travelers.forEach(traveler -> System.out.println("Hi, traveller " + traveler));

        //Ctrl+Alt+V makes variable lambda
        travelers.forEach(traveler -> {
            String traveler1 = traveler;
            System.out.println("Hi, traveller " + traveler1);
        });
    }
}
