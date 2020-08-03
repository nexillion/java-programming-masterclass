package com.company;

public class Main {

    public static void main(String[] args)
    {
        double variableOne = 20;
        double variableTwo = 80;
        double variableThree = (variableOne + variableTwo)*100;
        System.out.println("(20 + 80)*100 = "+variableThree);
        variableThree = variableThree % 40;
        System.out.println("10000 % 40 = "+variableThree);
        boolean canYouDivideTenThousandByFourty = variableThree == 0 ? true:false;
        System.out.println("Boolean variable = "+canYouDivideTenThousandByFourty);
        if(!canYouDivideTenThousandByFourty)
            System.out.println("Got some remainder");
    }
}
