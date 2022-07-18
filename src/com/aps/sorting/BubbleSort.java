package com.aps.sorting;

import java.util.Arrays;

public class BubbleSort extends SortMethod{
    public static int[] sort(int[] unsortedArray){
        int[] array = Arrays.copyOf(unsortedArray, unsortedArray.length);
        startTimer();

        int auxiliar = 0;

        for(int iterator = 0; iterator <  array.length; iterator++){
            for(int auxIterator = 0; auxIterator < array.length-1; auxIterator++){
                if(array[auxIterator] > array[auxIterator + 1]){
                    auxiliar = array[auxIterator];
                    array[auxIterator] = array[auxIterator+1];
                    array[auxIterator+1] = auxiliar;
                }
            }
        }

        stopTimer();
        return array;
    }
}
