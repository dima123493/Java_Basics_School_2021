package com.dataart.school.lessons.Lecture9.Stream;

public class Person {
    private final String name;
    private final int age;
    public Profession profession;

    public Person(String name, int age,Profession profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Profession getProfession(){return profession;}

    @Override
    public String toString(){
        return name;
    }
}
