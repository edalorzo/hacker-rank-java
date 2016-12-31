package org.dalorzo.challenges;

import java.util.Scanner;

public class BonAppeti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int skip = scanner.nextInt();

        int fullCost = 0;
        int chargedCost = 0;
        for(int i =0; i < n; i++) {
            int price = scanner.nextInt();
            fullCost += price;
            if(i != skip) {
                chargedCost += price;
            }
        }

        int charged = scanner.nextInt();
        System.out.println(charged == (chargedCost / 2) ? "Bon Appetit" : (fullCost - chargedCost) /2);

    }



}
