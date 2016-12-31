package org.dalorzo.hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Project Euler #2: Even Fibonacci numbers
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler002
 */
public class Euler2 {

    private static Map<Long, Long> memo = new HashMap<>();

    static {
        memo.put(0L, 0L); //fibonacci(0)
        memo.put(1L, 1L); //fibonacci(1)
    }

    private static long fib(long x) {
        return memo.computeIfAbsent(x, n -> fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            long sum = 0;
            long f = 0;
            for (int j = 1; f <= n; j++) {
                f = fib(j);
                if (f <= n && f % 2 == 0) {
                    sum += f;
                }
            }
            System.out.println(sum);
        }
    }

}
