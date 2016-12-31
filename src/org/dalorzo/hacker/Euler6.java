package org.dalorzo.hacker;

import java.util.Scanner;

/**
 * Project Euler #6: Sum square difference
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler006
 */
public class Euler6 {

    static long sums(long n) {
        long sumOfSquares = 0;
        long squareOfSums = 0;
        for(long k = 1; k <= n; k++) {
            squareOfSums = squareOfSums + k;
            sumOfSquares = sumOfSquares + (k * k);
        }
        return (squareOfSums * squareOfSums) - sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(sums(n));

        }
    }
}
