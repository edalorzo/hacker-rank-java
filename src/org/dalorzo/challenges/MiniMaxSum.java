package org.dalorzo.challenges;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long max, min, sum = 0;
        int i;

        a[0] = in.nextLong();

        max = a[0];
        min = a[0];
        sum = a[0] + sum;
        for (i = 1; i < 5; i++) {
            a[i] = in.nextLong();
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        System.out.printf("%d %d %n", sum - max, sum - min);
    }
}
