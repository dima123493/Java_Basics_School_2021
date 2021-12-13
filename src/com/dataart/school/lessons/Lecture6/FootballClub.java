package com.dataart.school.lessons.Lecture6;

import com.dataart.school.lessons.Lecture6.mainPackage.IClubDetails;

public class FootballClub extends Club implements IClubDetails, IClubManagment{
    public String name;
    public int teamCount;
    public int clubBudget;
    public int teamSalary;
    public static final String COUNTRY = "Ukraine";

    {
        teamCount=25;//константа
    }

    public FootballClub(){ //дефолтный конструктор

    }
    public FootballClub(String name, int clubBudget){ //параметризированный конструктор
        this.name=name;
        this.clubBudget=clubBudget;
    }

    public FootballClub(int teamCount){ //можно создать много разных конструкторов
        this.teamCount=teamCount;
    }

    public static String getCountry(){
        return COUNTRY;
    }

    public String getFanBaseName(){
        return "test";
    }

    @Override//полиморфизм + (@override)
    public int generateAvarageSalary() {
        System.out.println("Play football");
        return teamSalary/teamCount;
    }

    @Override
    public int generateManagment() {

        return teamSalary/teamCount;
    }

    @Override
    public void playFootball() {
        System.out.println("Play football");
    }
}
