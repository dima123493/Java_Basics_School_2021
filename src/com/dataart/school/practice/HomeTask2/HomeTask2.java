package com.dataart.school.practice.HomeTask2;

import com.dataart.school.practice.HomeTask2.Animal.*;

import java.util.ArrayList;

import static com.dataart.school.practice.HomeTask2.Calculation.allInfoDisplay;
import static com.dataart.school.practice.HomeTask2.Calculation.nutrition;

public class HomeTask2 {

    public static void main(String[] args) {

        ArrayList<Animals> listAnimal = new ArrayList<Animals>(){{
            add(new Lynx("Dodo", "20.12.1991"));
            add(new Raccoon("City", "15.11.1992"));
            add(new Kangaroo("Fester", "09.10.1993"));
            add(new Eagle("Merek", "01.09.1994"));
            add(new Ostrich("Flash", "05.08.1995"));
            add(new Carp("Nemo", "25.07.1996"));
            add(new Ram("Tata", "10.06.1997"));
            }};

        allInfoDisplay(listAnimal);
        System.out.println();
        nutrition(listAnimal);

    }

}
