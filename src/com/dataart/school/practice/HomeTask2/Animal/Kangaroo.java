package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Mammals;

import static com.dataart.school.practice.HomeTask2.Enum.Type.HERBIVORE;

public final class Kangaroo extends Mammals {

    {
        weight = 85;
        livingSpace = 300;
        typeOfAnimal = HERBIVORE;
        kindOfFamily = Kind.KANGAROO;
    }

    public Kangaroo(String name, String birth) {
        super(name, birth);
    }

}
