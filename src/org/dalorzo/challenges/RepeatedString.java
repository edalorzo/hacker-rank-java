package org.dalorzo.challenges;

import java.util.Arrays;

public class RepeatedString {

    public static void main(String[] args) {


        String s = "aba";
        long n = 10;

        long total = 0;
        long as = Arrays.stream(s.split("")).filter("a"::equals).count();
        if(as > 0) {

            long size = s.length();
            long whole = n / size;
            long part = n % size;

            long more = Arrays.stream(s.substring(0, (int) part).split("")).filter("a"::equals).count();
            total = (whole * as) + more;
        }

        System.out.println(total);












    }


}
