package org.anazworth;

public class Fibonacci {
    public static long recursiveFibonacci(long n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
        // The recursive version is much slower than the iterative version
        // because it has to calculate the same values over and over again.
        // This is called "redundant computation".
        // Its order of growth is O(2^n).
        // Its time complexity is exponential.

        // The iterative version is much faster because it only calculates
        // each value once. Its order of growth is O(n).
        // Its time complexity is linear.
    }

    public static long iterativeFibonacci(long n) {
        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
