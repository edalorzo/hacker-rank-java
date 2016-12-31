package org.dalorzo.hacker;

import java.util.Scanner;

/**
 * Project Euler #4: Largest palindrome product
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler004
 */
public class Euler4 {

    private static boolean isPalindrome(long n) {
        return reverse(n) == n;
    }


    private static long reverse(long n) {
        long rev = 0L;
        while (n > 0) {
            long d = n % 10;
            n = n / 10;
            rev = rev * 10 + d;
        }
        return rev;
    }

    private static long largest(long n) {
        long max = 0;
        for (int j = 100; j < 1000; j++) {
            for (int k = 100; k < 1000; k++) {
                long p = j * k;
                if (p >= n) {
                    break;
                }
                if (isPalindrome(p)) {
                    max = Math.max(max, p);
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(largest(n));

        }
    }
}
