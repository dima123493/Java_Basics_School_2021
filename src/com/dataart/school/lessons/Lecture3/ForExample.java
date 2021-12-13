package com.dataart.school.lessons.Lecture3;

public class ForExample {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }//увеличение на 2

        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.println(i+" "+j);
            }
        }
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        int a=1;
        do {
            System.out.println(a);
            a++;
        }while (a<=10);
    }
}
