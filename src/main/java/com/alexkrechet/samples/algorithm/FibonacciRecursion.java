package com.alexkrechet.samples.algorithm;

public class FibonacciRecursion {
    static int count = 0;

    public static void main(String[] arg) {
        System.out.println(fibonacci(8));
    }

    //Notice this is a recursive call of method which may cause stack overflow
    public static int fibonacci(int fibNum) {
        count++;
        if (fibNum == 0) {
            return 0;
        } else if (fibNum == 1) {
            return 1;
        }
        return fibonacci(fibNum - 1) + fibonacci(fibNum - 2);

    }
}
