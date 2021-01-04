package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        ItemMap itemMap = new ItemMap();
        Basket basket = new Basket();

        basket.putItemInBasket("Bread", 1);
        basket.putItemInBasket("Bread", 2);
        basket.putItemInBasket("Eggs", 3);
        basket.putItemInBasket("Milk", 4);
        basket.putItemInBasket("Apples", 101);
        basket.putItemInBasket("Apples", 100);
        basket.putItemInBasket("Oranges", 50);
        basket.putItemInBasket("Baklava", 1);

        Map<String, Integer> itemMapMain = new HashMap<>(basket.getBasketItems());
        Map<String, Double> priceMapMain = new HashMap<>(itemMap.getPrice());

        System.out.println("\nItems in basket at checkout:\n");

        double overallPrice = 0;

        for(String s : itemMapMain.keySet())
        {
            overallPrice += itemMapMain.get(s) * priceMapMain.get(s);
            System.out.printf("\t" + s + ": " + itemMapMain.get(s) + " - " + "%.2f", itemMapMain.get(s) * priceMapMain.get(s));
            System.out.print(" lv.\n");
        }

        System.out.printf("\n Overall price at checkout: " + "%.2f", overallPrice);
        System.out.print(" lv.\n");

        basket.basketCheckout();

        itemMapMain = new HashMap<>(basket.getLeftInStore());

        System.out.println("\nItems left in store after purchases: ");
        for(String s : itemMapMain.keySet())
        {
            System.out.println("\t" + s + ": " + itemMapMain.get(s));
        }
    }
}
