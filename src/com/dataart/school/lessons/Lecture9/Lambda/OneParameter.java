package com.dataart.school.lessons.Lecture9.Lambda;

public class OneParameter {

    interface Driver{
        void drive(String vehicle);//one parameter here
    }

    public static void main(String[] args) {
        Driver driver = new Driver() {
            @Override
            public void drive(String vehicle) {
                System.out.println("I can drive only "+vehicle);
            }
        };
        driver.drive("a passenger car");

        //TODO Use lambda for the above
        Driver newDriver = vehicle -> System.out.println("I can drive only " + vehicle);
        newDriver.drive("a plane");

    }
}
