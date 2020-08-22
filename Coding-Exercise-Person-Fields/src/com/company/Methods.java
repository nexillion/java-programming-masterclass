package com.company;

public class Methods
{
    public static void getNull()
    {
        Person firstName = new Person();
        Person lastName = new Person();
        Person age = new Person();

        System.out.println(firstName.getFirstName());
        System.out.println(lastName.getLastName());
        System.out.println(age.getAge());
    }

    public static void getValues()
    {
        Person stringVariableOne = new Person();
        Person stringVariableTwo = new Person();
        Person intVariable = new Person();

        stringVariableOne.setFirstName("Nikolay");
        stringVariableTwo.setLastName("Serafimov");
        intVariable.setAge(21);

        System.out.println("First Name: " + stringVariableOne.getFirstName());
        System.out.println("Last Name: " + stringVariableTwo.getLastName());
        System.out.println("Age: " + intVariable.getAge());
    }
}
