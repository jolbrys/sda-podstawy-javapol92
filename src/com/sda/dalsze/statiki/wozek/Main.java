package com.sda.dalsze.statiki.wozek;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCart.Item("headphones", 210.4));
        cart.addItem(new ShoppingCart.Item("battery", 5.2));
        System.out.println("Found " + cart.getItemsCount() + " items in the cart");
        System.out.println("Total price: " + cart.getCheckoutAmount());

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(new ShoppingCart.Item("computer", 82.2));
        cart2.addItem(new ShoppingCart.Item("smartphone", 25.2));
        System.out.println("Found " + cart2.getItemsCount() + " items in the cart");
        System.out.println("Total price: " + cart2.getCheckoutAmount());

        System.out.println();
        //ShoppingCart.procentZnizki = 20;
        System.out.println("cena po znizce: "  + cart.getCheckoutAmountWithDiscount());
        System.out.println("cena po znizce: "  + cart2.getCheckoutAmountWithDiscount());
        System.out.println();

        ShoppingCart.procentZnizki = 35;
        System.out.println("cena po znizce: "  + cart.getCheckoutAmountWithDiscount());
        System.out.println("cena po znizce: "  + cart2.getCheckoutAmountWithDiscount());


    }
}
