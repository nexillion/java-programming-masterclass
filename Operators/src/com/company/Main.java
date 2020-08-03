package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args)
    {
        int result = 1;
        result++; // = result + 1
        result++; // = result + 1
        result--; // = result - 1
        result = result % 5;
        System.out.println(" 2 % 5 = "+result); // module funkciqta pokazva ostatuka sled delenie
        // v sluchaq 2/5 = 0 i ostatuk 2
        result = 10;
        result = result % 7;
        System.out.println(" 10 % 7 = "+result);
        // 10/7 = 1 i ostatuk 3

        result+=5; // result + 5
        System.out.println(" 3 + 5 = "+result);
        result *= 4; // result * 4
        System.out.println(" 8 * 4 = "+result);
        result /= 2; // result / 2
        System.out.println(" 32 / 2 = "+result);

        // primer za if;else statement - purviq e false, vtoriq e true
        boolean isAlien = false; // boolean set to false
        if (isAlien == false)
            System.out.println("You are not an alien, you may visit Earth.");
        else System.out.println("Go away, you illegal alien!");

        System.out.println("-----------------------------------------------------------------");
        // tova sum go dobavil samo za da e po-lesno chetim outputa

        isAlien = true; // boolean set to true
        if (!isAlien) // tuk sum izpolzval sukratena versiq na "isAlien == false"
            //"isAlien == true" shte bude sukrateno na if(isAlien) -- IntelliJ samo shte ti go preporucha
            System.out.println("You are not an alien, you may visit Earth.");
        else System.out.println("Go away, you illegal alien!");

        System.out.println("-----------------------------------------------------------------");
        // primer za code block
        if (isAlien)
        {
            System.out.println("You are an alien.");
            System.out.println("Go away!");
        }else
        {
            System.out.println("You are not an alien.");
            System.out.println("You may land on Earth.");
        }
        //code block-a pozvolqva da ima poveche redove v if;else statementa, bez nego, programata shte chete samo 1viq red
        System.out.println("-----------------------------------------------------------------");
        int valueOfMyTopNumber = 1000;
        int valueOfMyBottomNumber = 100;
        int changeThisValueToTestIfElse = 124;
        // tova e primer za izpolzwane na && (AND) funkciq - za da tozi if da e true, trqbva i dvata check-a da sa true
        if(changeThisValueToTestIfElse > valueOfMyBottomNumber && changeThisValueToTestIfElse < valueOfMyTopNumber)
        {
            System.out.println("Test number is between 100 and 1000");
            System.out.println("The test numbers value is = "+changeThisValueToTestIfElse);
        }else{
            System.out.println("Test number is not between 100 and 1000");
            System.out.println("The test numbers value is = "+changeThisValueToTestIfElse);
        }

        System.out.println("-----------------------------------------------------------------");
        changeThisValueToTestIfElse = 1001;
        if(changeThisValueToTestIfElse > valueOfMyBottomNumber && changeThisValueToTestIfElse < valueOfMyTopNumber)
    {
        System.out.println("Test number is between 100 and 1000");
        System.out.println("The test numbers value is = "+changeThisValueToTestIfElse);
    }else{
        System.out.println("Test number is not between 100 and 1000");
        System.out.println("The test numbers value is = "+changeThisValueToTestIfElse);
        changeThisValueToTestIfElse = 1001;
    }
        System.out.println("-----------------------------------------------------------------");
        //tova e primer za funkciqta || (OR) - toest trqbwa 1 ili i dvata check-a da sa true za da vurne true
        //v sluchaq sum izpolzval check koito vinagi shte vrushta TRUE.
        //tova se poluchava zashtoto bukvalno vsqko chislo e ili po-malko ot 1000 ili po-golqmo ot 100
        if(changeThisValueToTestIfElse > valueOfMyBottomNumber || changeThisValueToTestIfElse < valueOfMyTopNumber)
        {
            System.out.println("if;else returns TRUE");
        }else System.out.println("if;else returns FALSE");
        System.out.println("-----------------------------------------------------------------");
        //primer za Ternary operator
        boolean aTrueBoolean = true;
        boolean aFalseBoolean = false;
        int ternaryTestTrue = aTrueBoolean ? 10 : 20;
        int ternaryTestFalse = aFalseBoolean ? 10 : 20;
        System.out.println("Output from aTrueBoolean = "+ternaryTestTrue);
        System.out.println("Output from aFalseBoolean = "+ternaryTestFalse);
        //tova koeto Ternary operatora pravi e zadava purvata stoinost sled "?" ako inputa i e true
        //i zadava vtorata stoinost sled "?", koqto e napisana sled ":" ako inputa e false
        //primer za izpolzvane v realna situaciq:
        System.out.println("-----------------------------------------------------------------");
        int ageOfPersonAge = 21;
        boolean ageOverEighteen = ageOfPersonAge >= 18 ? true:false;
        if(ageOverEighteen==true)
            System.out.println("Person is 18 or older.");
        else System.out.println("Person is not old enough.");

    }
}
