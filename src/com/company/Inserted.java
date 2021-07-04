package com.company;

import java.util.Random;

public class Inserted {
    public static void main(String[] args) {

        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i, current;

        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(99);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        System.out.println("================================");

        /* вставкой */

        for (i = 0 ;i < mass.length;i++ ){
            current = mass [i];
            int j = i-1;
            while(j >=0 && current < mass[j]) {
                mass[j+1] = mass[j];
                j--;
            }
            mass[j + 1] =current;
        }
        for (i = 0; i < mass.length; i++){
            System.out.println("Массив метод Вставкой, элемент "+ i +" : " + mass[i] );
        }

        System.out.println("================================");


    }
}
