package com.company;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {

        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i,a,b,temp;

        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(86);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        System.out.println("================================");

        /* пузырек */

        for (a = 1;a < mass.length;a++){
            for (b = mass.length-1; b >= a; b--){
                if (mass[b-1] > mass [b]) {
                    temp = mass[b - 1];
                    mass[b - 1] =mass[b];
                    mass [b] = temp;
                }

            }
        }

        for (i = 0; i < mass.length; i++){
            System.out.println("Массив Bubble, элемент "+ i +" : " + mass[i] );

        }
        System.out.println("================================");



    }
}
