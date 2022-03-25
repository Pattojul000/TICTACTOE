package org.WalkerCC_CompSci;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Double> DoubleLister = new ArrayList<Double>();

        DoubleLister.add(12.25);
        DoubleLister.add(12.50);
        DoubleLister.add(13.0);
        DoubleLister.add(13.25);
        DoubleLister.add(1, 12.75);

        DoubleLister.remove(13.0);

        DoubleLister.indexOf(12.75);


        System.out.println(DoubleLister);



    }
}