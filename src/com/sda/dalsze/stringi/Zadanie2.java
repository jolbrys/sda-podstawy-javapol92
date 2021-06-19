package com.sda.dalsze.stringi;

public class Zadanie2 {
    public static void main(String[] args) {
        //weź zadany string i wypisz go dublujac kazda z jego liter
        //tzn ma wyjść LLoorreemmIIppssuumm

        String napis = "LoremIpsum";
        for(int i = 0; i < napis.length(); i++){
            System.out.print(napis.charAt(i));
            System.out.print(napis.charAt(i));
        }
    }
}
