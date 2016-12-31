package org.dalorzo;

import java.util.HashMap;
import java.util.Map;

public class TestDrive {

    public static void main(String[] args) {


        Map<String, Integer> m = new HashMap<>();
        m.put("10", 29);

        Integer n = m.computeIfPresent("10", (s,i) -> 10);
        System.out.println(n);


    }
}
