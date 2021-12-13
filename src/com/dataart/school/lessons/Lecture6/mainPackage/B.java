package com.dataart.school.lessons.Lecture6.mainPackage;

public class B {

    private static void main(String[] args) {//main - enter (убрать статик если работаешь с протектет методом все пекеджа)
        A a = new A();
        //a. приватный модификатор в А классе не дает доступа к параметрам а через .
        a.setClubBudget();
    }
}
