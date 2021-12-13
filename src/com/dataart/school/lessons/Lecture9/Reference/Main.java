package com.dataart.school.lessons.Lecture9.Reference;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {

        //TODO Implement Function using lambda (parseInt)
        Function<String,Integer> integerFunction = Integer::parseInt;

        //TODO IntFunction
        IntFunction<Integer> sqrt = new IntFunction<Integer>() {
            @Override
            public Integer apply(int value) {
               int result = value*value;
                return result;
            }
        };
        Integer sqrtResult = sqrt.apply(4);
        System.out.println(sqrtResult);
    }
}
