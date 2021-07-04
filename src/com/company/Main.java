package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i;
        int min,max;


        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(50);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        min = max = mass [0];
        for (i = 0; i < mass.length; i++){
            if(mass[i] < min) min = mass[i];
            if(mass[i] > max) max = mass[i];
        }

        System.out.println("================================");
        System.out.println("Минимум массива: " + min );
        System.out.println("Максимум массива: " + max);
        System.out.println("================================");

    }
}
