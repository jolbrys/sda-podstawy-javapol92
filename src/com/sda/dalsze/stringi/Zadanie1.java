package com.sda.dalsze.stringi;

public class Zadanie1 {
    public static void main(String[] args) {
        String testString = "Lorem Ipsum Dolor";
        String otherString = "Sit Amet";

        System.out.println("Długość tekstu: " + testString.length());
        System.out.println("Litera o indeksie 4 to: " + testString.charAt(4) );
        System.out.println("Połączone napisy: " + testString.concat(otherString));
        System.out.println("Napis małymi literami: " + testString.toLowerCase());
        System.out.println("Napis wielkimi literami: " + testString.toUpperCase());
        System.out.println("Napis powtorzony 3 razy: " + testString.repeat(3));
        System.out.println("Czy pierwszy napis konczy sie litera r? " + testString.endsWith("r"));
        System.out.println("Czy drugi napis konczy sie litera r? " + otherString.endsWith("r"));
        System.out.println("Napis z zamienionym m na X: " + testString.replace('m', 'X'));

        //trudniejsze: trzeba uzyc petli, najlepiej foreach
        System.out.println("Napis podzielony na slowa: ");
        for(String word : testString.split(" ")){
            System.out.println(word);
        }

    }
}
