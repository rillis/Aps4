package com.aps.sorting;

import java.util.Arrays;

public class CountingSort extends SortMethod{
    public static int[] sort(int[] unsortedArray){
        int[] array = Arrays.copyOf(unsortedArray, unsortedArray.length);
        startTimer();

        int arraySize = array.length;
        int[] outputArray = new int[arraySize + 1];

        int maxValue = array[0];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        int[] countArray = new int[maxValue + 1];

        for (int i = 0; i < maxValue; ++i) {
            countArray[i] = 0;
        }

        for (int j : array) {
            countArray[j]++;
        }

        for (int i = 1; i <= maxValue; i++) {
            countArray[i] += countArray[i - 1];
        }

        for (int i = arraySize - 1; i >= 0; i--) {
            outputArray[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        for (int i = 0; i < arraySize; i++) {
            array[i] = outputArray[i];
        }

        stopTimer();
        return array;
    }
}
