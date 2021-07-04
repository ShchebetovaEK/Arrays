package com.company;

import java.util.Arrays;
import java.util.Random;

public class Sorted {
    public static void main(String[] args) {

        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i;

        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(77);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        System.out.println("================================");

        /* сортировка */

        Arrays.sort(mass);

        for (i = 0; i < mass.length; i++){
            System.out.println("Массив метод Sort, элемент "+ i +" : " + mass[i] );
        }

        System.out.println("================================");


    }
}
