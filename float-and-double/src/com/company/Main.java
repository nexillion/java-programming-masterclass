package com.company;

public class Main {

    public static void main(String[] args)
    {
        float MinimumFloatValue = Float.MIN_VALUE;
        float MaximumFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value = "+ MinimumFloatValue);
        System.out.println("Maximum Float Value = "+ MaximumFloatValue);

        double MinimumDoubleValue = Double.MIN_VALUE;
        double MaximumDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value = "+ MinimumDoubleValue);
        System.out.println("Maximum Double Value = "+ MaximumDoubleValue);

        int intnumber = 8;
        float floatnumber = 5.25f;
        double doublenumber = 4.35d;
        //java izpolzva double kat default-niq variable type (sushto kato int)
        //v primera po-gore dava greshka ako bude iztrito "f"-a sled 5.25 - zashtoto izpolzvam float a to vijda double
        //tazi greshka q nqma ako iztriq "d"-to sled 4.35 na double-a

        float myfloatnumber = (float)((intnumber+floatnumber+doublenumber)*4);
        System.out.println("myfloatnumber value = "+ myfloatnumber);
        //tuk sum izpolzval CAST za da oburna int i double v float variable type
        //tova e chast ot challenge ot video 28
    }
}
