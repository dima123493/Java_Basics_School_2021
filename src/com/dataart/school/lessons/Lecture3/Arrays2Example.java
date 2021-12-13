package com.dataart.school.lessons.Lecture3;

import java.util.Arrays;

public class Arrays2Example {
    public static void main(String[] args) {

        int[][] array2D = {{0,1},{2,3}};

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));

        int[][]arr=new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
