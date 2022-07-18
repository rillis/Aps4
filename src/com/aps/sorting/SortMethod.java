package com.aps.sorting;

public class SortMethod {
    private static long timer = 0;
    static void startTimer(){
        timer = System.nanoTime();
    }
    static void stopTimer(){
        long nanoSeconds = System.nanoTime() - timer;
        System.out.println("Tempo para rodar: " + nanoSeconds + " nanosegundos. (" + nanoSeconds/1000000 + "ms)");
    }
}
