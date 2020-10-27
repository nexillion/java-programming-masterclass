package com.company;

public class Main {

    public static void main(String[] args)
    {
        ListControls listControls = new ListControls();

        listControls.addItem("Eggs");
        listControls.addItem("Milk");
        listControls.addItem("Brown Bread");

        listControls.getAllItems();

        listControls.modifyItem(2, "White Bread");

        System.out.println("\n\n");

        listControls.getAllItems();
        listControls.removeItem(0);

        System.out.println("\n\n");

        listControls.getItem(0); // The value in index 0 is null and does not display anything.
        listControls.getAllItems();
    }
}
