package com.dataart.school.lessons.Lecture3;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int practice[]=new int[10];
        int []practice2=new int[10];

        int rooms[] ={1,2,3};
        int rooms2[] = new int[] {1,2,3};

        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
      //a[5]=60; Out of bounds

        for (int i=0; i<a.length;i++)
            System.out.println(a[i]);

        //System.out.println(a); incorrect
        System.out.println(Arrays.toString(a));

        double nums[] = {10.1,11.2,12.3,13.4,14.5};
        double result = 0;
        int i;

        for(i=0;i<5;i++)
            result = result+nums[i];
        System.out.println("Average is "+ result/5);
    }
}
