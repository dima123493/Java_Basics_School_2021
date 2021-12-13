package com.dataart.school.practice.HomeTask2;

import com.dataart.school.practice.HomeTask2.Enum.LivesIn;

public abstract class Hawk extends Animals{

    {
        livesIn = LivesIn.IN_THE_AIR;
    }

    public Hawk(String name, String birth) {
        super(name, birth);
    }

}
