package com.company;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        if(age > 100 || age < 0)
        {
            this.age = 0;
        }
        else
        {
            this.age = age;
        }
    }
}