package com.ing.zoo.animals;

public class Horse {
    public String name;
    public String helloText;
    public String eatText;

    public Horse()
    {
    }

    public void sayHello()
    {
        helloText = "Neighhhh";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch Deehihilihihicious";
        System.out.println(eatText);
    }
}
