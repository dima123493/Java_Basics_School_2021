package com.dataart.school.lessons.Lecture9.ForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> travelers = new ArrayList<>();
        travelers.add("Dmytro");
        travelers.add("Bogdan");
        travelers.add("Nika");

        for (String traveler:travelers) {
            System.out.println("Hi, traveler" + traveler);
        }
        //anonymous forEach realisation
        travelers.forEach(new Consumer<String>() {
        @Override
        public void accept(String traveler1) {
            System.out.println("Hi, traveler" + traveler1);
    }
});
        //parameterized realisation
        travelers.forEach(new StringConsumer());
    }
        //TODO Move consumer to inner class
         private static class StringConsumer implements Consumer<String> {
        @Override
        public void accept(String traveler2) {
            System.out.println("Hi, traveler" + traveler2);
        }
    }
}
