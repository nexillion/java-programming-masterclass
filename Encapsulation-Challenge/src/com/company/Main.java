package com.company;

public class Main {

    public static void main(String[] args)
    {
        Printer printer1 = new Printer(false);

        printer1.fillUpToner(1000);
        printer1.printPage();
        printer1.printPage();

        Printer printer2 = new Printer(true);

        printer2.fillUpToner(19);
        printer2.printPage();
        printer2.fillUpToner(21);
        printer2.printPage();
    }
}
