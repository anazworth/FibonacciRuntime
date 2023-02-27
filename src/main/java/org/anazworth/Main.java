package org.anazworth;

import tech.tablesaw.api.LongColumn;
import tech.tablesaw.api.Table;

public class Main {
    public static void main(String[] args) {

        int n = 51;

        LongColumn iterations = LongColumn.create("Iterations");
        LongColumn recursive = LongColumn.create("Recursive");
        LongColumn iterative = LongColumn.create("Iterative");

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            iterations.append((long) i);

            recursive.append(Timer.timer(Fibonacci::recursiveFibonacci, i));

            iterative.append(Timer.timer(Fibonacci::iterativeFibonacci, i));
        }

        Table table = Table.create("Results", iterations, recursive, iterative);

        System.out.println(table);
        // save table to csv
        table.write().csv("results.csv");
    }
}
