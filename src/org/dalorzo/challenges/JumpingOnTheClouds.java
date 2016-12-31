package org.dalorzo.challenges;

import java.nio.IntBuffer;

public class JumpingOnTheClouds {


    public static void main(String[] args) {
        //int[] clouds = {0, 0};
        int[] c = {0, 1, 0};
        //int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        //int[] clouds = {0, 0, 0, 0, 1, 0};

        int l = c.length - 1;
        int i = 0;
        int j = 0;

        while (i < l) {
            if(l - i > 1) {
                int a = c[i + 1];
                int b = c[i + 2];
                if (a == 0 && b == 1) {
                    j++;
                    i += 1;
                }
                else {
                    j++;
                    i += 2;
                }
            } else {
                i += 1;
                j++;
            }
        }
        System.out.println(j);




    }
}
