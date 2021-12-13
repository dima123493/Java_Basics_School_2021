package com.dataart.school.lessons.Lecture5;

public class Main {
    public static void main(String[] args) {
        FootballClub karpaty = new FootballClub();
        FootballClub dynamo = new FootballClub("Dynamo",25000);
        FootballClub rivne = new FootballClub(25);
        System.out.println(dynamo.name);
        System.out.println(dynamo.clubBudget);
        System.out.println(FootballClub.getCountry());
        System.out.println(karpaty.getFanBaseName());
    }
}
