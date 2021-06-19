package com.sda.dalsze.statiki.wozek;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    static class Item {
        public Item(String name, double price){
            this.name = name;
            this.price = price;
        }
        String name;
        double price;
    }

    static double procentZnizki = 10;
    List<Item> items = new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }

    int getItemsCount(){
        return items.size();
    }

    double getCheckoutAmount(){
        double wynik = 0;
        for(Item element : items){
            wynik += element.price;
        }
        return wynik;
    }

    double getCheckoutAmountWithDiscount(){
        return getCheckoutAmount() * (1 - (procentZnizki)/100);

    }

    void clear(){
        int constraint = items.size();
        for(int i = 0; i < constraint; i++){
            items.remove(0);
        }
    }

}
