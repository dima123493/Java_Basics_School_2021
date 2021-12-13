package com.dataart.school.lessons.Lecture4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    getSum(1,2);
        int[] values = enterValuesNumberOfTimes(3);
        int sum = getSum(values);
        System.out.println("Sum: "+sum);
        /*System.out.println("enter value 1:");
        String value1 = new Scanner(System.in).next();
        System.out.println("enter value 2:");
        String value2 = new Scanner(System.in).next();
        System.out.println("enter value 3:");
        String value3 = new Scanner(System.in).next();*/
    }

    public static int[] enterValuesNumberOfTimes(int times){
        int[] values = new int[times];
        for (int index=0; index<times;index++){
            System.out.println("enter value"+(index+1));
            values[index]=Integer.parseInt(new Scanner(System.in).next());
        }
        return values;
    }

    public static int getSum(int[] values) {
        int sum =0;
        for(int value:values){
            sum=sum+value;
        }
        return sum;
    }
    //Перегрузка метода
    public static int getSum(int a,int b) {
    return a+b;
    }
    public static int getSum(int a,String b) {
        return a+Integer.parseInt(b);
    }
}
