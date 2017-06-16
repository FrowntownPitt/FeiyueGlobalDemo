package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).

public class Conditionals {

    // "Conditionals" is a fancy term for making decisions in code.  Conditionals are
    // "if-else" statements.

    // if statements evaluate boolean conditions to decide whether or not to enter the block.
    // When the condition is true, that block is run, and subsequent blocks in the chain are then
    // skipped.

    // This method will return a String variable based on the value of the score parameter.
    public String getGradeLetter(double score){
        if(score >= 97.0){
            return "A+";
        } else if(score >= 93.0){
            return "A";
        } else if(score >= 90.0){
            return "A-";
        } else if(score >= 87.0){
            return "B+";
        } else if(score >= 83.0){
            return "B";
        } else if(score >= 80.0){
            return "B-";
        } else if(score >= 77.0){
            return "C+";
        } else if(score >= 73.0){
            return "C";
        } else if(score >= 70.0){
            return "C-";
        } else {
            return "F";
        }

        // There are 3 key parts of an if chain:
        // "if(condition)" this block will execute if the condition is true, and subsequent blocks
        //     will be skipped.  All if chains begin with an if statement.
        // "else if(condition)" this block will execute if the previous blocks have not executed,
        //     and if the condition is true.
        // "else" this block will execute if none of the previous blocks have executed. These are
        //     used as a "default" condition.
        // if chains must start with an if statement, may contain 0 or more else-if statements, and
        // can end with an else statement.
        // If chains do not have to contain else-if statements.  They also do not have to end with
        // an else statement.
    }

    // Conditional statements must evaluate to a boolean, or "true" or "false".  There are a few
    // operators that yield booleans based on similar non-boolean types:
    // x > y    x is greater than y
    // x >= y   x is greater than or equal to y
    // x < y    x is less than y
    // x <= y   x is less than or equal to y
    // x == y   x is equal to y
    // x != y   x is not equal to y

    // You can also compare booleans (either variables or results of conditional operations:
    // x && y   conditional AND (evaluates to true if BOTH are true)
    // x || y   conditional OR  (evaluates to true if AT LEAST one is true)

    // With a combination of these statements, you can make compound conditional statements
    public int compoundConditional(int x, int y, int z){
        if(x > y && x > z){
            // This will return the value of x if x is greater than y AND x is greater than z.
            return x;
        } else if(y > z || y > 0){
            // Otherwise, return the value of y if y is greater than 0 or if y is greater than z.
            return y;
        } else {
            // Otherwise, default to z.
            return z;
        }
    }
}
