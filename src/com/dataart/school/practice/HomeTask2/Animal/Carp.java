package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Enum.Type;
import com.dataart.school.practice.HomeTask2.Fishes;

public final class Carp extends Fishes {

    {
        weight = 4;
        livingSpace = 8;
        typeOfAnimal = Type.OMNIVOROUS;
        kindOfFamily = Kind.CARP;
    }

    public Carp(String name, String birth) {
        super(name, birth);
    }

}
