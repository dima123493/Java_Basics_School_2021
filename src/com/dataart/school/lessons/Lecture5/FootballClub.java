package com.dataart.school.lessons.Lecture5;

public class FootballClub {
    public String name;
    public int teamCount;
    public int clubBudget;
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
}
