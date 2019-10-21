package com.alexkrechet.samples.sorting;

public class BubbleSort {
    public static void main(String... arg) {
        int[] simpleArray = new int[10];

        for (int element = 0; element < simpleArray.length; element++) {
            simpleArray[element] = 1 + (int) (Math.random() * ((10 - 1) + 1));
            System.out.print(simpleArray[element] + " ");
        }
        int tmp;
        for (int outLoop = 0; outLoop < simpleArray.length; outLoop++) {
            for (int element = 0; element < simpleArray.length - 1; element++) {
                if (simpleArray[element] > simpleArray[element + 1]) {
                    tmp = simpleArray[element + 1];
                    simpleArray[element + 1] = simpleArray[element];
                    simpleArray[element] = tmp;
                }
            }
        }
        System.out.println();
        for (int element : simpleArray) {
            System.out.print(element + " ");
        }
    }
}
