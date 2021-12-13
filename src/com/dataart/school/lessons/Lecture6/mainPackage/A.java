package com.dataart.school.lessons.Lecture6.mainPackage;

public class A {                    //Инкапсуляция
    private int clubBudget=1000000;//если сделать публичным, то в Б классе можно увидеть и бюджет через .
    public int setClubBudget(){// default (int clubBudget) не виден вне пекеджа.
        return clubBudget;
    }
}
