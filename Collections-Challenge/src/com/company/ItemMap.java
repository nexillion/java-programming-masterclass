package com.company;

import java.util.HashMap;
import java.util.Map;

public class ItemMap
{
    private Map<String, Integer> itemMap = new HashMap<>();
    private Map<String, Double> priceMap = new HashMap<>();

    public ItemMap()
    {
        itemMap.put("Bread", 100);
        itemMap.put("Eggs", 100);
        itemMap.put("Milk", 100);
        itemMap.put("Apples", 100);
        itemMap.put("Oranges", 100);

        priceMap.put("Bread", 0.99);
        priceMap.put("Eggs", 2.49);
        priceMap.put("Milk", 1.99);
        priceMap.put("Apples", 3.99);
        priceMap.put("Oranges", 4.49);
    }

    public Map<String, Integer> getItemMap()
    {
        return itemMap;
    }

    public Map<String, Double> getPrice()
    {
        return priceMap;
    }
}
