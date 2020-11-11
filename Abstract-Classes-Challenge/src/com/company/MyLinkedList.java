package com.company;

public class MyLinkedList implements NodeList
{
    ListItem root;

    public MyLinkedList(ListItem root)
    {
        this.root = root;
    }

    @Override
    public ListItem getRoot()
    {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem)
    {
        if(this.root == null)
        {
            // The list is empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null) // while there is another item to compare
        {
            int compare = currentItem.compareTo(newItem);
            if(compare < 0) // currentItem < newItem
            {
                if(currentItem.next() != null) // if there is another item after current item
                {
                    currentItem = currentItem.next();
                }
                else
                {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    // could be shortened to currentItem.setNext(newItem).setPrevious(currentItem);
                    // as java will first return the following:
                    // this.nextLink = item; item being newItem passed by setNext(newItem)
                    // return this.nextLink; effectively returning newItem and calling newItem.setPrevious(currentItem)

                    return true;
                }
            }
            else if(compare > 0) // currentItem > newItem
            {
                if(currentItem.previous() != null) // if there is another item before current item
                {
                    currentItem.previous().setNext(newItem); // sets previous entry to point to newItem
                    newItem.setPrevious(currentItem.previous()); // sets newItem.previous() to be what was currentItem.previous()
                    newItem.setNext(currentItem); // places currentItem after newItem
                    currentItem.setPrevious(newItem); // sets currentItem.previous() to point to newItem
                }
                else
                {
                    // the newItem becomes root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else
            {
                // values are equal
                System.out.println(newItem.getValue() + " is a duplicate value.");
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root)
    {
        if(root == null)
        {
            System.out.println("List is empty.");
        }
        else
        {
            while(root != null)
            {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
