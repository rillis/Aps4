package com.aps.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MainClass {
    public static void main(String[] args) {
        //Atenção: Código feito na versão 1.8 do java.

        int size = 10;
        int[] unsortedArray = new int[size];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = ThreadLocalRandom.current().nextInt(0, 100); // 0 - 99
        }


        System.out.println("Lista não ordenada gerada pseudo-aleatóriamente:");
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println("Método InsertionSort:");
        System.out.println(Arrays.toString(InsertionSort.sort(unsortedArray)));

        System.out.println("Método CountingSort:");
        System.out.println(Arrays.toString(CountingSort.sort(unsortedArray)));

        System.out.println("Método BubbleSort:");
        System.out.println(Arrays.toString(BubbleSort.sort(unsortedArray)));

    }
}
