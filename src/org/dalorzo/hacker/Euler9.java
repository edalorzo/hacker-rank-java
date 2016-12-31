package org.dalorzo.hacker;

import java.io.File;
import java.io.IOException;
import java.util.*;

/*
 * Still Not Passing all Tests!!!
 *
 * Project Euler #9: Special Pythagorean triplet
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler009
 */
public class Euler9 {

    static class Triplet implements Comparable<Triplet> {

        final long a, b, c;

        Triplet(long a, long b, long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            //return String.format("%d",a * b * c);
            return String.format("(%d,%d,%d)", a , b , c);
        }

        @Override
        public int compareTo(Triplet that) {
            long m = this.a * this.b * this.c;
            long n = that.a * that.b * that.c;
            return Long.compare(m, n);
        }

        static Triplet max(Triplet left, Triplet right) {
            return left.compareTo(right) <= 0 ? right : left;
        }
    }

    static Map<Integer, Triplet> cache = new HashMap<>(3000);
    static Triplet find(int n) {
        return cache.computeIfAbsent(n, m -> findBiggest(m));
    }



    static Triplet findNext(int n, long a) {
        long b = a;
        long n2 = n * n;
        long sum2, c2;
        do {
            long a2 = a * a;
            long b2 = b * b;
            c2 = a2 + b2;
            sum2 = a2 + b2 + c2;
            b = b + 1;
        } while(sum2 < n2);

        if(n2 == sum2) {
            b = b - 1;
            long c = (long) Math.sqrt(c2);
            return new Triplet(a, b, c);
        }

        return null;

    }

    static Triplet findBiggest(int n) {
        Triplet triplet = null;
        all:
        for (long a = 1; a < n; a++) {

            long b = a;
            double sum;

            do {

                double c = Math.sqrt(a * a + b * b);
                sum = a + b + c;
                if (sum > n && a == b) {
                    break all;
                }
                if (sum == n) {
                    if(triplet == null) {
                        triplet = new Triplet(a, b, (long) c);
                    } else {
                        triplet = Triplet.max(triplet, new Triplet(a, b, (long) c));
                    }
                }
                b = b + 1;
            } while (sum < n);
        }


        return triplet;
    }

    public static void main(String[] args) throws IOException {


        Triplet triplet = findNext(12, 3);
        System.out.println(triplet);
        System.exit(0);

        Scanner sc = new Scanner(new File("input.txt"));

        int t = 3000;//sc.nextInt();

        for (long i = 0; i < t; i++) {
            int n = (int) i+1;//sc.nextInt();
            long start = System.currentTimeMillis();
            Triplet found = find(n);
            long end = System.currentTimeMillis();
            System.out.printf("%s of %d after %dms%n",found == null ? "-1" : found, n, end-start);
        }


    }
}
