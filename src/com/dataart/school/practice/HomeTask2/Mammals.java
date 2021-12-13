package com.dataart.school.practice.HomeTask2;

import com.dataart.school.practice.HomeTask2.Enum.LivesIn;

public abstract class Mammals extends Animals {

    {
        livesIn = LivesIn.ON_THE_GROUND;
    }

    public Mammals(String name, String birth) {
        super(name, birth);
    }

}
