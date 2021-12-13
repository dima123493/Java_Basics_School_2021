package com.dataart.school.practice.HomeTask2.Animal;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Enum.Type;
import com.dataart.school.practice.HomeTask2.Mammals;

public final class Lynx extends Mammals {

    {
        weight = 30;
        livingSpace = 200;
        typeOfAnimal = Type.MEATEATER;
        kindOfFamily = Kind.LYNX;
    }

    public Lynx(String name, String birth) {
        super(name, birth);
    }

}
