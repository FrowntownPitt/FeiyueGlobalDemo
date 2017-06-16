package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).

public class Loops {
    // Loops are blocks of code that will execute repeatedly until a condition is met (or no longer
    // met).

    // A "while" loop will execute until its condition is no longer met.
    public void whileExample(){
        int x = 0;
        // This loop will execute 10 times.  The values printed will be from 1 to 10.
        while(x < 10){
            x += 1;
            System.out.println("Number: " + x);
        }
    }

    // You need to be careful when programming loops, because they can potentially loop forever!
    // (This is called an infinite loop.)
    public void infiniteWhiles(){
        int x = 0;
        // x is never increased so it will never exceed 10 , therefore will never evaluate to false.
        while(x < 10){
            System.out.println("Number: " + x);
        }

        // This while loop is intended to loop forever
        while(true){
            System.out.println("Looping forever!");
        }
    }

    // The "for" loop can be used to execute a specific number of times.
    public void forExample(){
        for(int i=0; i<10; i++){
            System.out.println("Number: " + i);
        }

        // "for" loops follow a specific syntax:
        // for(initialization; termination; increment)
        // "initialization" this is used to create a variable or set a variable to a specific
        //     setpoint.
        // "termination"    this is the condition which must be met for the loop to run.  Once this
        //     condition is no longer met, the code will continue after the loop.
        // "increment"      this is used to change the value of the loop variable, progressing the
        //     loop state.

        // All three expressions are optional; an infinite loop can be created as follows:
        for( ; ; ){
            System.out.println("Looping forever!");
        }
    }

    // You can force a loop to finish before it reaches the end of its current execution cycle with
    // the "break" statement.
    public void breakExample(){
        int x = 0;
        while(true){
            x += 2;
            if(x > 10){
                break;
            }

            System.out.println("Number: " + x);
        }

        // This will print the numbers from 0 to 4
        for(x = 0; x < 10; x++){
            if(x == 5){
                break;
            }
            System.out.println("Number: " + x);
        }
    }

    // You may also choose to skip the remaining code in the current execution cycle, but still have
    // the loop evaluate the condition to keep running with the "continue" statement.
    public void continueExample(){
        // This loop will print the numbers from 0-9, skipping 5.
        for(int i=0; i<10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}
