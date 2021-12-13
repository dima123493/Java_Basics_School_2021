package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Mammals;

import static com.dataart.school.practice.HomeTask2.Enum.Type.MEATEATER;

public final class Raccoon extends Mammals {

    {
        weight = 9;
        livingSpace = 50;
        typeOfAnimal = MEATEATER;
        kindOfFamily = Kind.RACCOON;
    }

    public Raccoon(String name, String birth) {
        super(name, birth);
    }

}
