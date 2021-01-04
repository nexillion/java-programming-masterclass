package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args)
    {
        Map<Integer, String> myMap = new HashMap<>();
        // Creating a map. Types cannot be primitive. (int -> Integer)
        // first value is mapKey, second value is the value for that key

        // final void putMapEntries(Map<? extends K, ? extends V> m, boolean evict) {
        // ...
        // K key = e.getKey();
        // V value = e.getValue();
        // *taken from HashMap.java*

        myMap.put(0, "ZERO");
        myMap.put(1, "ONE");
        // setting values to keys

        System.out.println(myMap.put(2, "TWO"));
        // Using System.out.println will print the *previous* value of the key. Using System.out.println(myMap.put(2, "TWO")) with
        // key value 2, returns null, as key 2 is just getting its value.

        System.out.println(myMap.put(2, "THREE"));
        // The printed value here will be "TWO", as that is the previous value of kay 2. However key 2 is now set to value "THREE".

        System.out.println(myMap.put(2, "FOUR"));
        // The printed value here will be "THREE", as that is the previous value of kay 2. However key 2 is now set to value "FOUR".

        myMap.remove(1);
        // myMap.remove will remove the value from the key.
        System.out.println(myMap.get(1));
        // The printed value here will be null, as the keys value was deleted on line 35.

        IfRemove.ifRemove(myMap);
        // Key 0, value "ZERO", will give false on the if check.

        myMap.replace(0, "0"); // Replaces an already existing value.
        // Attempting to replace a null value will result in another null value.
        
        IfRemove.ifRemove(myMap);
        // Key 0, value "0", will give true on the if check and will remove the value of the key.

        System.out.println(myMap.get(0)); // Prints null when tested.
    }
}
