package org.dalorzo.challenges;

import java.nio.CharBuffer;

public class MarsExploration {

    public static void main(String[] args) {

        String signal = "SOSSPSSQSSOR";
        CharBuffer buffer = CharBuffer.wrap(signal);
        char[] expected = {'S','O','S'};

        int changed = 0;
        char[] message = new char[3];
        while(buffer.hasRemaining()) {
            buffer.get(message);
            for(int i = 0; i < 3; i++) {
                if(expected[i] != message[i]) {
                    changed++;
                }
            }
        }
        System.out.println(changed);

    }

}
