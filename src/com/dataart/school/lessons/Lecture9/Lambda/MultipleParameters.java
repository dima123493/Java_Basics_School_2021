package com.dataart.school.lessons.Lecture9.Lambda;

public class MultipleParameters {

    interface Driver{
        void drive(String vehicle1, String vehicle2);//multiple parameters here
    }

    public static void main(String[] args) {
        Driver driver = new Driver() {
            @Override
            public void drive(String vehicle1, String vehicle2) {
                System.out.println("I can drive both" + vehicle1 + " and " + vehicle2);
            }
        };
        driver.drive("passenger car", "truck");

        //TODO Use lambda for the above
        Driver driver2 = (vehicle1, vehicle2) -> System.out.println("I can drive both" + vehicle1 + " and " + vehicle2);
        driver2.drive("passenger car", "truck");
    }
}
