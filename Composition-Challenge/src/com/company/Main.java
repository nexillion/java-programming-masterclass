package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(5, 3, 3, true);
        Doors doors = new Doors();
        Windows windows = new Windows(1,1,2);
        Room room = new Room(dimensions, new Furniture(1, 4, "Wooden Planks", 4), doors, windows);

        room.getDimensions().exactRoomSize();
        room.getWindows().glassSize();
        room.getDoors().doorExist();
        room.getFurniture().howMuchFurniture();
    }
}
