package com.dataart.school.practice.HomeTask2;

import com.dataart.school.practice.HomeTask2.Enum.Kind;
import com.dataart.school.practice.HomeTask2.Enum.LivesIn;
import com.dataart.school.practice.HomeTask2.Enum.Type;

import java.util.Arrays;

import static com.dataart.school.practice.HomeTask2.Enum.Type.*;

public abstract class Animals implements IAnimalEat {

    private final String name;
    private final String birth;
    public int weight;
    public int livingSpace;
    public Type typeOfAnimal;
    public Kind kindOfFamily;
    public LivesIn livesIn;

    public Animals(String name, String birth) {
        this.name = name;
        this.birth = date(birth);
    }

    private String date(String birth) {
        return Arrays.toString(new String[]{birth});
    }

    public String name() {
        return name;
    }

    public void eat(String receiveMenu) {
        if ((typeOfAnimal == OMNIVOROUS) ||
                (typeOfAnimal == MEATEATER & receiveMenu.matches("meat")) ||
                (typeOfAnimal == HERBIVORE & receiveMenu.matches("plants"))) {
            System.out.println(name() + " likes to eat " + receiveMenu);
        } else {
            System.out.println(name() + " does not like to eat " + receiveMenu);
        }
    }

    @Override
    public String toString() {
        return    "My name is " + name + ". "
                + "I am " + kindOfFamily + ". "
                + "My birth date is " + birth + ". "
                + "My weight is " + weight + "kg" +". "
                + "I need " + livingSpace + "m\u00B2 of living space" + ". "
                + "I am " + typeOfAnimal + ". "
                + "I live " + livesIn + ". ";
    }

}
