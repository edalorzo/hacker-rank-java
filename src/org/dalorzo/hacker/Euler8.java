package org.dalorzo.hacker;

import java.util.*;

/**
 * Project Euler #8: Largest product in a series
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler008
 */
public class Euler8 {

    static String chunk(String d, int k, int i) {
        return d.substring(i, i + k);
    }

    static String[] chunks(String d, int n, int k) {
        int size = n - k + 1;
        String[] chunks = new String[size];
        for(int i = 0; i < size; i++) {
            chunks[i] = chunk(d, k, i);
        }
        return chunks;
    }

    static int product(String chunk) {
        if(chunk.contains("0")) {
            return 0;
        }
        return chunk.chars()
                    .map(c -> Character.digit(c, 10))
                    .reduce((a,b) -> a * b)
                    .orElse(0);
    }

    static int max(String chunks[]) {
        return Arrays.stream(chunks)
                     .mapToInt(Euler8::product)
                     .max()
                     .orElse(0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (long i = 0; i < t; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            String d = sc.next();
            System.out.println(max(chunks(d, n, k)));

        }

    }
}
