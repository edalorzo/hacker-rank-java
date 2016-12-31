package org.dalorzo.hacker;

import java.util.*;
import java.util.function.*;

/**
 * Project Euler #7: 10001st prime
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler007
 */
public class Euler7 {

    private static boolean isEven(long n){
        return n % 2 == 0;
    }

    private static long ldf(long n, long k) {
        while(true){
            if(n % k == 0) return k;
            else if(k * k > n) return n;
            else k = k + 2;
        }
    }

    private static final Map<Long,Boolean> cache = new HashMap<>(10000);
    private static boolean isPrime(long n) {
        return cache.computeIfAbsent(n, k -> k==2 || ((k > 2) && !isEven(k) && ldf(k, 3) == n));
    }

    private static class Primes implements LongSupplier {

        private long prime = 2;

        @Override
        public long getAsLong() {
            if(prime == 2) {
                return prime++;
            }
            while(true){
                long next = prime;
                prime = prime + 2;
                if(isPrime(next)){
                    return next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            Primes primes = new Primes();
            long prime = 0;
            for(long k = 0; k < n; k++) {
                prime = primes.getAsLong();
            }
            System.out.println(prime);
        }
    }
}
