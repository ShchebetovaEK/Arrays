package com.company;

import java.util.Random;

public class Choice {
    public static void main(String[] args) {

        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i,min,temp;

        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(35);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        System.out.println("================================");

        /* выбором */

        for (i =0; i < mass.length; i++){
            min = mass [i];
            int min_i = i;
            for (int j = i+1;j < mass.length; j++){
                if(mass [j] < min){
                    min = mass[j];
                    min_i = j;
                }
            }
            if (i!=min_i){
                temp = mass [i];
                mass[i] = mass[min_i];
                mass[min_i] = temp;
            }

        }
        for (i = 0; i < mass.length; i++){
            System.out.println("Массив Выбором, элемент "+ i +" : " + mass[i] );
        }

        System.out.println("================================");


    }
}
