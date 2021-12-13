package com.dataart.school.lessons.Lecture9.Lambda;

public class WithoutParameters {
    interface Driver{
        void drive();//no parameters here
    }

    public static void main(String[] args) {
        Driver driver = new Driver() {
            @Override
            public void drive() {
                System.out.println("I can not drive at all");
            }
        };
        driver.drive();

        //TODO Use lambda for the above
        Driver driver1 = () -> System.out.println("I can not drive at all");//() -> no parameters in the brackets
        driver1.drive();
    }
}
