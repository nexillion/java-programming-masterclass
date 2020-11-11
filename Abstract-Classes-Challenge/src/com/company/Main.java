package com.company;

public class Main {

    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Sofia Plovdiv Varna Burgas Ruse Stara Zagora Pernik Pleven Sliven Dobrich Shumen";
        String[] data = stringData.split(" ");

        for(String s : data) // create new item with value set to string s
        {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
