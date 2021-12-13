package com.dataart.school.lessons.Lecture9.Stream;

import java.util.*;
import java.util.stream.Collectors;

import static com.dataart.school.lessons.Lecture9.Stream.Profession.*;

public class Main {
    public static void main(String[] args) {
        List<Person> travelers = new ArrayList<>();
            travelers.add(new Person("Jonas",21, ATHLETE));
            travelers.add(new Person("Martha",20, MOVIE_STAR));
            travelers.add(new Person("Ulrick",45, ATHLETE));
            travelers.add(new Person("Michael",40, PIANIST));
            travelers.add(new Person("Katherina",44, MOVIE_STAR));
            travelers.add(new Person("Franziska",22, ATHLETE));

            //TODO Find all ATHLETES who are older then 20 years
            List<String>athletesOlderThe20 = travelers.stream()
                    .filter(person -> person.getProfession() !=null)
                    .filter(person -> person.getProfession().equals(ATHLETE))
                    .filter(person -> person.getAge()>20)
                    .map(Person::getName)
                    .collect(Collectors.toList());
        System.out.println(athletesOlderThe20);

            //TODO Find if the list contains any ATHLETE
             boolean anyAthlete = travelers.stream()
                .filter(person -> person.getProfession() !=null)
                .anyMatch(person -> person.getProfession().equals(ATHLETE));
             System.out.println(anyAthlete);

            //TODO Find if the list contains all the ATHLETES
             boolean allPianists = travelers.stream()
                .filter(person -> person.getProfession() !=null)
                .allMatch(person -> person.getProfession().equals(PIANIST));
            System.out.println(allPianists);

            //TODO Group travelers names by profession
        Map<Profession, List<Person>> byProfession = travelers.stream()
                .collect(Collectors.groupingBy(Person::getProfession,Collectors.toList()));
        System.out.println(byProfession);

            //TODO Find average age of travelers
            OptionalDouble average = travelers.stream()
                    .mapToInt(Person::getAge)
                    .average();
        System.out.println(average);
    }
}
