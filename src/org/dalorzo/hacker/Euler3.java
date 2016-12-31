package org.dalorzo.hacker;

import java.util.Scanner;

/**
 * Project Euler #3: Largest prime factor
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler003
 */
public class Euler3 {

    private static long factors(long n) {
        long max = 0;
        long d = 2;
        while (n > 1) {
            while (n % d == 0) {
                max = Math.max(max, d);
                n /= d;
            }
            d = d + 1;
            if (d * d > n) {
                if (n > 1) {
                    max = Math.max(max, n);
                }
                break;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(factors(n));

        }
    }
}
