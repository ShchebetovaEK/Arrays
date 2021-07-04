package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ReverseSorted {
    public static void main(String[] args) {

        Random random = new Random();

        Integer mass[] = new Integer[15];

        int i;

        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(88);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        System.out.println("================================");

        /*сортировка обратный порядок*/

        Arrays.sort(mass, Collections.reverseOrder());

        for (i = 0; i < mass.length; i++){
            System.out.println("Массив метод Sortreverse, элемент "+ i +" : " + mass[i] );
        }

        System.out.println("================================");

    }
}
