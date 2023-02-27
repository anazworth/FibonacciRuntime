package org.anazworth;

import java.util.function.Function;

public class Timer {
    public static long timer(Function<Long, Long> f, long n) {
        long start = System.nanoTime();
        f.apply(n);
        long end = System.nanoTime();
        return end - start;
    }
}