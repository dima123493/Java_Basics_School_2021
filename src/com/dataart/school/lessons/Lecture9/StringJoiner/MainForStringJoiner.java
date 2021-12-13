package com.dataart.school.lessons.Lecture9.StringJoiner;

public class MainForStringJoiner {
    public static void main(String[] args) {

        IStringJoiner joiner1 = ((first, second) -> first.concat(second));
        System.out.println(joiner1.join("ant","eater"));

        //method reference
        IStringJoiner joiner2 = String::concat;
        System.out.println(joiner2.join("ant","eater"));
    }
}
