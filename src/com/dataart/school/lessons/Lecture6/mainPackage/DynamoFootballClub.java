package com.dataart.school.lessons.Lecture6.mainPackage;

public class DynamoFootballClub implements IClubDetails{
    public String name;
    public int teamCount;
    public int clubBudget;
    public int teamSalary;
//Overloading - принцип полиморфизма
    public void generateDynamoEntity(String name, int teamSalary){
        System.out.println(name);
        System.out.println(teamSalary);
    }
    public void generateDynamoEntity(String name, int teamSalary, int teamCount){
        System.out.println(name);
        System.out.println(teamSalary);
        System.out.println(teamCount);
    }

    @Override //Overriding - принцип полиморфизма (меняем тело, но параметры те же)
    public int generateAvarageSalary() {
        System.out.println("Something here");
        return 0;
    }
}
