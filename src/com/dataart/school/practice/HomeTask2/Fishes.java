package com.dataart.school.practice.HomeTask2;

import com.dataart.school.practice.HomeTask2.Enum.LivesIn;

public abstract class Fishes extends Animals {

    {
        livesIn = LivesIn.IN_THE_WATER;
    }

    public Fishes(String name, String birth) {
        super(name, birth);
    }

}
