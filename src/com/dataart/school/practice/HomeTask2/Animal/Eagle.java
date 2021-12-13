package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Enum.Type;
import com.dataart.school.practice.HomeTask2.Hawk;

public final class Eagle extends Hawk {

    {
        weight = 7;
        livingSpace = 100;
        typeOfAnimal = Type.MEATEATER;
        kindOfFamily = Kind.EAGLE;
    }

    public Eagle(String name, String birth) {
        super(name, birth);
    }

}
