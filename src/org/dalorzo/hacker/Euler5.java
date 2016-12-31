package org.dalorzo.hacker;

import java.util.Scanner;

/**
 * Project Euler #5: Smallest multiple
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler005
 */
public class Euler5 {

    static boolean all(long n, long p) {
        for (long k = 1; k <= n; k++) {
            if (!((p % k) == 0)) {
                return false;
            }
        }
        return true;
    }

    static long smallest(long n, long p) {
        while (!all(n, p)) {
            p++;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(smallest(n, 1));

        }
    }
}


