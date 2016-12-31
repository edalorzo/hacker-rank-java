package org.dalorzo.challenges;

import java.util.*;

public class EqualizeArray {

    public static void main(String[] args) {
        //int[] array = {3, 3, 2, 1, 3};
        int[] array = {3, 2, 2, 2, 3, 3, 2, 3, 1};

        int best = 0;
        int max = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int x : array) {
            int n = counts.merge(x, 1, (prev, next) -> prev + next);
            if(Math.max(max, n) == n) {
                best = x;
                max = n;
            }
        }
        counts.remove(best);
        System.out.println(counts.values().stream().reduce(0, (a,b) -> a + b));
    }
}
