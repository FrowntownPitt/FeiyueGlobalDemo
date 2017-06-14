package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).

public class Methods {
    // This is the "class body".  This area contains all of the code that runs under this class.
    // Methods and class members will go here.

    // Here is the most basic form of a "method".  As with class definitions, methods have specific
    // keywords to make it work.  Here, there are 4 key parts.
    // "public" means any other class can use this method.
    // "void" means this method does not return any values.
    // "firstMethod" is the name of this method.
    // Methods always have parentheses to define the method's "parameters".  In this case, we are
    // not using any parameters.
    public void firstMethod(){

    }

    // This method is called "returnOne", and it returns an integer of value 1.
    // Instead of using "void" in the method definition, "int" is used.  This means the method
    // MUST return a value of "int" or integer type.
    // The "return" statement will give the value that follows to whatever line of code called it.
    public int returnOne(){
        return 1;
    }

    // This method will take in an integer and add 1 to it.
    // In this method definition, the parentheses have keywords within them. In this case, there is
    // one parameter.  "int" defines this parameter as an integer, and "number" is the name of the
    // variable.  We can use this variable within the method.
    public int addOne(int number){
        int returnNumber = number + 1;
        return returnNumber;
    }

    // This method will take two integers, add them, and return the result.
    // Methods can take more than one parameter, and they must be separated by a comma.  Parameters
    // do not need to be of the same type.
    public int addBoth(int firstNumber, int secondNumber){
        int returnNumber = firstNumber + secondNumber;
        return returnNumber;
    }

    // This method will return a number that was returned by another method.
    // When you call a method, its return value can be used to do more operations.
    public int mysteryResult(){
        int aNumber = returnOne();
        int returnNumber = addOne(aNumber);
        return returnNumber;
    }
}
