package com.dataart.school.lessons.Lecture8;

import java.util.*;

public class GenericsExamples {
    public static void main(String[] args) {
        arrayListExample();
        hashMapExample();
        ONotationExample.sample();
    }

    public static void arrayListExample() {

        ArrayList<Integer> myNumbersOk = new ArrayList<Integer>();//internal incapsulation

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //iterate throw
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));

        System.out.println(cars.size());

        //change Volvo to Opel
        cars.set(0, "Opel");

        Collections.sort(cars);

        cars.remove(3);

        cars.clear();
    }

    public static void LinkedListExample() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Tesla");
        cars.addLast("Zaz");
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.removeFirst();
        cars.removeLast();
    }

    public static void hashMapExample() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Ukraine", "Kyiv");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Ukraine"));
        capitalCities.size();

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.format("{0}: {1}%n", i, capitalCities.get(i));
        }
        capitalCities.remove("England");
        capitalCities.clear();
    }

    public static void iteratorExample() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> iterator = cars.iterator();
        for (String carElement : cars) {
            System.out.println(carElement);
        }
        iterator = cars.iterator();
        for (; iterator.hasNext(); )
            System.out.println(iterator.next());

        while (iterator.hasNext())
            System.out.println(iterator.next());

        while (iterator.hasNext())
            iterator.remove();
    }

    public static void hashSet() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);
        }
        cars.contains("Mazda");
        cars.remove("Volvo");
        cars.clear();

        HashMap<Integer, String> angularDevelopers = new HashMap<Integer, String>();
        angularDevelopers.put(1, "Havdeep");
        angularDevelopers.put(4, "Anil");
        angularDevelopers.put(5, "Lokesh");
        angularDevelopers.put(2, "Sushil");
        angularDevelopers.put(3, "Amrita");

        //Printing HashMap objects
        for (Map.Entry entry : angularDevelopers.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();

        Iterator<String> backward = arrayDeque.descendingIterator();
    }
}

    class ONotationExample {
        public static void sample() {
            ONotationExample.logariphmic(10);
            ONotationExample.quasilineal(10);
            ONotationExample.quadratic(10);
        }

        public static void logariphmic(int n) {
            int counter = 0;
            for (int i = 1; i < n; i = i * 2) {
                System.out.printf("Doing iteration: %s;%n", i);
                counter++;
            }
            System.out.println("Total " + counter);
        }

        public static void quasilineal(int n) {
            int counter = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < n; j = j * 2)
                    System.out.printf("Doing iteration: %s-%s;%n", i, j);
                counter++;
            }
            System.out.println("Total " + counter);
        }

        public static void quadratic(int n) {
            int counter = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.printf("Doing iteration: %s;%n", i, j);
                counter++;
            }
            System.out.println("Total " + counter);
        }

    }