package com.aps.sorting;

import java.util.Arrays;

public class InsertionSort extends SortMethod{
    public static int[] sort(int[] unsortedArray){
        int[] array = Arrays.copyOf(unsortedArray, unsortedArray.length);
        startTimer();

        int size = array.length;
        for (int iterator = 1; iterator < size; iterator++) {
            int currentValue = array[iterator];
            int previousIterator = iterator - 1;

            while (previousIterator >= 0 && array[previousIterator] > currentValue) {
                array[previousIterator + 1] = array[previousIterator];
                previousIterator = previousIterator - 1;
            }
            array[previousIterator + 1] = currentValue;
        }

        stopTimer();
        return array;
    }
}
