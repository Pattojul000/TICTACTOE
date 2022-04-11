package org.WalkerCC_CompSci;

import java.util.Random;

public class ArrayList {
    public static class Arrays {
        public static void main(String[] args) {

            Random rand = new Random();
            int[][] Array = new int[10][20];

            for (int i = 0; i < Array.length; i++) {

                for (int t = 0; t < Array.length; i++) {

                    int myNum = rand.nextInt(40);
                    myNum -= 20;
                    Array[i][t] = myNum;

                    System.out.println(Array[i][t] = myNum);
                }
            }
        }
    }
}
