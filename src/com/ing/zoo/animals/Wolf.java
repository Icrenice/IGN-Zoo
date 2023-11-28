package com.ing.zoo.animals;

import java.util.Random;

public class Wolf {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Wolf()
    {
    }

    public void sayHello()
    {
        helloText = "owoooo";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "hagh hagh num hagh thanks";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "gives paw";
        }
        else
        {
            trick = "plays dead";
        }
        System.out.println(trick);
    }
}
