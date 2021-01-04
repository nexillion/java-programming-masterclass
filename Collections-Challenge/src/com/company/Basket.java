package com.company;

import java.util.HashMap;
import java.util.Map;

public class Basket
{
    ItemMap itemMap = new ItemMap();
    private Map<String, Integer> storeMap = new HashMap<>(itemMap.getItemMap());
    private Map<String, Integer> basketMap = new HashMap<>();

    public void putItemInBasket(String item, int quantity)
    {
        if(storeMap.containsKey(item))
        {
            if(storeMap.get(item) >= quantity)
            {
                if(basketMap.containsKey(item))
                {
                    basketMap.replace(item, basketMap.get(item) + quantity);
                }
                else
                {
                    basketMap.put(item, quantity);
                }
            }
            else
            {
                System.out.println("There is only " + storeMap.get(item) + " " + item + " in stock. (Requested: " + quantity + ")");
            }
        }
        else
        {
            System.out.println("There is no " + item + " in the store.");
        }
    }

    public void basketCheckout()
    {
        for(String s : basketMap.keySet())
        {
            storeMap.replace(s, storeMap.get(s) - basketMap.get(s));
        }
    }

    public Map<String, Integer> getBasketItems()
    {
        return basketMap;
    }

    public Map<String, Integer> getLeftInStore()
    {
        return storeMap;
    }
}
