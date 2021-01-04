package com.company;

import java.util.Scanner;

public class X
{
    private int x = 0;

    public void X()
    {
        Scanner x = new Scanner(System.in);
        x(x.nextInt());
    }

    private void x(int x)
    {
        while(this.x > -1)
        {
            System.out.println(x * this.x);
            this.x++;

            if(this.x == 13)
            {
                break;
            }
        }
    }
}
