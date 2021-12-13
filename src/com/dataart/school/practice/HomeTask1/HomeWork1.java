package com.dataart.school.practice.HomeTask1;

import java.util.*;
import java.util.stream.IntStream;

public class HomeWork1 {
    public static void main(String[] args) {

        int input = 454;
        String task0Result = task0(input);
        System.out.println("Result of task 0: " + task0Result);

        String age = "1985";
        int task1Result = task1(age);
        System.out.println("Result of task 1: " + task1Result);

        int[] primes = new int[100];
        String task2Result = task2(primes);
        System.out.println("Result of task 2: " + task2Result);

        String task2_1Result = task2_1();
        System.out.println("Result of task 2_1: " + task2_1Result);

        double[] averageNumbers = {12, 22, 32, 42, 52, 62};
        double task3Result = task3(averageNumbers);
        System.out.println("Result of task 3: " + task3Result);

        double task3_1Result = task3_1(averageNumbers);
        System.out.println("Result of task 3_1: " + task3_1Result);

        double task3_2Result = task3_2();
        System.out.println("Result of task 3_2: " + task3_2Result);

        int[] numbersToBeSort = {55, 42, 16, 877, 24, 62, 56};
        String task4Result = task4(numbersToBeSort);
        System.out.println("Result of task 4: " + task4Result);

        String word = "Java";
        String sentence = "Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!";
        int task5Result = task5(word.toLowerCase(Locale.ROOT), sentence.toLowerCase(Locale.ROOT));
        System.out.println("Result of task 5: " + task5Result);

        System.out.println("Result of task 5_1: " + task5_1(sentence.toLowerCase(Locale.ROOT), word.toLowerCase(Locale.ROOT).charAt(0)));

        int task5_2Result = task5_2();
        System.out.println("Result of task 5_2: " + task5_2Result);

        int[] weather = new int[29];
        String optionalTask1 = optionalTask1(weather);
        System.out.println("Result of Optional task 1: ");
        IntStream degrees = Arrays.stream(weather);
        degrees.forEach(str -> System.out.println(weather.length + " day, " + str + " degrees;"));//Can not solve the issue and make stream of days

    }

    private static String task0(int input) {
        return String.valueOf(input);
    }

    private static int task1(String a) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                sum = sum + Integer.parseInt(a.charAt(i) + "");
            }
        }
        return sum;
    }

    private static String task2(int[] primes) {
        int counter = 0;
        int isPrime = 2;
        while (counter < primes.length) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[counter] = isPrime;
                counter++;
            }
            isPrime++;
        }
        return Arrays.toString(primes);
    }

    private static String task2_1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scan.nextInt();
        int[] newArray = new int[size];
        task2(newArray);
        return Arrays.toString(newArray);
    }

    private static double task3(double[] myArray) {
        double average = 0;
        for (double values : myArray) {
            average = average + values / (double) myArray.length;
        }
        return average;
    }

    private static double task3_1(double[] myArray) {
        double geometricAverage = 1.0;
        for (double v : myArray) {
            geometricAverage *= v;
        }
        geometricAverage = Math.pow(geometricAverage, 1.0 / (double) myArray.length);
        return geometricAverage;
    }

    private static double task3_2() {
        double sum = 0, inputNum;
        double average;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Please, enter 6 numbers: ");
        for (int x = 1; x <= 6; x++) {
            inputNum = numScanner.nextInt();
            sum = sum + inputNum;
        }
        average = sum / 6;
        return average;
    }

    private static String task4(int[] myArray) {
        boolean isSorted = false;
        int buble;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    isSorted = false;
                    buble = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = buble;
                }
            }
        }
        return Arrays.toString(myArray);
    }

    private static int task5(String word, String sentence) {
        int position;
        int curId = 0;
        int count = 0;
        while ((position = sentence.indexOf(word, curId)) != -1) {
            curId = position + 1;
            count++;
        }
        return count;
    }

    private static ArrayList<Integer> task5_1(String sentence, char character) {
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = 0;
        while (index != -1) {
            index = sentence.indexOf(character, index);
            if (index != -1) {
                indexes.add(index);
                index++;
            }
        }
        return indexes;
    }

    private static int task5_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the searching word: ");
        String searchWord = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("Enter string: ");
        String stringText = scanner.nextLine().toLowerCase(Locale.ROOT);
        List<String> words = new ArrayList<>();
        for (String sentence : stringText.split(" ")) {
            words.add(sentence.toLowerCase());
        }
        int position;
        int curId = 0;
        int counter = 0;
        while ((position = stringText.indexOf(searchWord, curId)) != -1) {
            curId = position + 1;
            counter++;
        }
        return counter;
    }

    private static String optionalTask1(int[] weather) {
        for (int day = 1; day < weather.length; day++) {
            weather[day] = (int) (Math.random() * 200 - 100);
            //System.out.println(day); //prints days but not in the right spot
        }
        return Arrays.toString(weather);
    }
}