package com.dataart.school.lessons.Lecture2;

public class VariablesExample {
    public static void main(String[]args){
        int a;
        int b,c;

        a=10;
        b=5;
        int d = 20;

        a=d;
        a=d*2;

        if(a>b){
            int internalV = a-b;// переменная внутри блока недоступна из вне.
            System.out.println(internalV);
        }
        // System.out.println(internalV);
    }
}
