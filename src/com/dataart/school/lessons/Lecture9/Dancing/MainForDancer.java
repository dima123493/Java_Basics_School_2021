package com.dataart.school.lessons.Lecture9.Dancing;

public class MainForDancer {
    public static void main(String[] args) {
        IDancer dancer1 = new IDancer(){

            @Override
            public void dance(){
                System.out.println("I like to dance!");
            }
        };
        dancer1.dance();

        //Lambda dance for functional interface
        IDancer dancer2 =()-> System.out.println("I like to dance!");
        dancer2.dance();
    }
}
