package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Horse stella = new Horse();
        stella.name = "stella";
        Wolf kiba = new Wolf();
        kiba.name = "kiba";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.startsWith(commands[0])) {

            String[] textpieces = input.split(" ");
            if(textpieces.length == 1){

                henk.sayHello();
                elsa.sayHello();
                wally.sayHello();
                marty.sayHello();
                dora.sayHello();
                stella.sayHello();
                kiba.sayHello();
            }else if(textpieces.length == 2){

                String name = textpieces[1];
                switch (name){
                    case "henk":
                        henk.sayHello();
                        break;
                    case "elsa":
                        elsa.sayHello();
                        break;
                    case "dora":
                        dora.sayHello();
                        break;
                    case "wally":
                        wally.sayHello();
                        break;
                    case "marty":
                        marty.sayHello();
                        break;
                    case "stella":
                        stella.sayHello();
                        break;
                    case "kiba":
                        kiba.sayHello();
                        break;
                    default:
                        System.out.println("There is no animal called: " + input);
                        break;
                }
            }
        }

        else if(input.startsWith(commands[1])) {

            marty.eatLeaves();
            elsa.eatLeaves();
            dora.eatLeaves();
            stella.eatLeaves();

        }
        else if(input.startsWith(commands[2])) {

            henk.eatMeat();
            wally.eatMeat();
            kiba.eatMeat();


        }
        else if(input.startsWith(commands[3])) {

            wally.performTrick();
            dora.performTrick();
            kiba.performTrick();


        }
        else{
            System.out.println("Unknown command: " + input);
        }
    }
}
