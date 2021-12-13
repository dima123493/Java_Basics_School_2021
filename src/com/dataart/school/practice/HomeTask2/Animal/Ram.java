package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Fishes;

import static com.dataart.school.practice.HomeTask2.Enum.Type.MEATEATER;

public final class Ram extends Fishes {

    {
        weight = 2;
        livingSpace = 5;
        typeOfAnimal = MEATEATER;
        kindOfFamily = Kind.RAM;
    }

    public Ram(String name, String birth) {
        super(name, birth);
    }

}
