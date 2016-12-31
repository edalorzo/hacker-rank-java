package org.dalorzo.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDistances {

    public static void main(String[] args) {

        //int[] array = {7, 1, 3, 4, 1, 7};
        int[] array = {7, 1, 3, 4, 2, 5};
        Map<Integer, Integer> v = new HashMap<>();
        Set<Integer> solved = new HashSet<>();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            if (!solved.contains(key)) {
                if (!v.containsKey(key)) {
                    v.put(key, i);
                }
                else {
                    int d = Math.abs(v.get(key) - i);
                    min = Math.min(min, d);
                    solved.add(key);
                }
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);



    }
}
