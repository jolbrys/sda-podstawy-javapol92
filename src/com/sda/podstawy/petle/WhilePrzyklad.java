package com.sda.podstawy.petle;

import java.util.Random;

public class WhilePrzyklad {
    public static void main(String[] args) {

        Random r = new Random();
        int i = -1;
        while( i % 5 != 0 ){
            i = r.nextInt();
            System.out.println("wartosc = " + i);
        }
    }
}
