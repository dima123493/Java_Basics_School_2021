package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Mammals;

import static com.dataart.school.practice.HomeTask2.Enum.Type.HERBIVORE;

public final class Ostrich extends Mammals {

    {
        weight = 140;
        livingSpace = 150;
        typeOfAnimal = HERBIVORE;
        kindOfFamily = Kind.OSTRICH;
    }

    public Ostrich(String name, String birth) {
        super(name, birth);
    }

}
