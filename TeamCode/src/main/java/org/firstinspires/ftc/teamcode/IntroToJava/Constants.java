package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).

public class Constants {
    // There are a few ways of defining a "constant" in Java.

    // Constants are simply values that will never change.  These can be explicit, or defined.

    public int addOne(int number){
        // This is an explicit constant.  The value shows up directly in the code.
        number = number + 1;
        return number;
    }

    // If you are starting to use the same value for the same purpose in multiple places, it will
    // become tedious to change that value down the road.  This is where defined constants come in.

    public final double MAX_MOTOR_VALUE = 0.2;

    // Here we define a new double with value of 0.2. This variable definition is slightly different
    // from what we have used before.  There is another keyword that appears between "public" and
    // "double".  "final" forces Java to not allow the value to change.

    // This method uses an if statement to decide what to return.
    public double calculateMotorOutput(double value){
        if(value > MAX_MOTOR_VALUE){
            return MAX_MOTOR_VALUE;
        } else {
            return value;
        }
    }

    // If after a while you decide to change whatever that max motor value should be, you can just
    // change the explicit constant in the definition, and it will effectively change it everywhere.
    // This keeps the changes necessary to 1 rather than the number of times that value is used.
    // Otherwise, you would need to find all occurrences of that number, which may be difficult if
    // the blocks are hidden, or if there are hundreds of lines of code to search though.
}
