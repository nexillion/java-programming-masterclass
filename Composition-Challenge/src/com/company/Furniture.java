package com.company;

public class Furniture
{
    private int chairs;
    private int tables;
    private String floorMaterial;
    private int shelves;
    private Closets closets;

    public Furniture(int chairs, int tables, String floorMaterial, int shelves)
    {
        this.chairs = chairs;
        this.tables = tables;
        this.floorMaterial = floorMaterial;
        this.shelves = shelves;
    }

    public void howMuchFurniture()
    {
        Closets closets = new Closets(2,0,10,6);
        System.out.println("There is " + this.chairs + " chairs, " + this.tables + " tables, " + this.shelves + " shelves and a closet with " + closets.howFullIsTheCloset() + " clothes in it." );
        System.out.println("Overall there are " + (this.chairs + this.tables + this.shelves + 1) + " things in my room.");
        System.out.println("Also the floor is made out of " + this.floorMaterial + ".");
    }

    private int getChairs()
    {
        return chairs;
    }

    private int getTables()
    {
        return tables;
    }

    private String getFloorMaterial()
    {
        return floorMaterial;
    }

    private int getShelves()
    {
        return shelves;
    }

    private Closets getClosets()
    {
        return closets;
    }

    private void setChairs(int chairs)
    {
        this.chairs = chairs;
    }

    private void setTables(int tables)
    {
        this.tables = tables;
    }

    private void setFloorMaterial(String floorMaterial)
    {
        this.floorMaterial = floorMaterial;
    }

    private void setShelves(int shelves)
    {
        this.shelves = shelves;
    }

    private void setClosets(Closets closets)
    {
        this.closets = closets;
    }
}
