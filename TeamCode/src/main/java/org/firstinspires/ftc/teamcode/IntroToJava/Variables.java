package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).

public class Variables {
    // Variables are containers to store information.  That information can be anything, from
    // numbers, to names, to secret data.  There are a lot of ways to store this information.

    // All variables follow the same definition pattern:
    // Type name = value;
    // "Type" is the variable type, whether a primitive or an object.
    // "name" is the name used to reference this variables contents.
    // "=" is used to assign values to the variable.
    // "value" is the value to assign to the variable.  The type of value must be the same as the
    //     type of the variable.

    // The first form of a variable is a primitive.  These are the most simple data types.
    int year = 2019;
    double pi = 3.14159265;
    boolean canBuildRobots = true;  // booleans are either true or false.
    // There are more primitive types than these, but these are the most commonly used ones, and
    // they will be the ones you use primarily for the FIRST Android system.

    // The next type of variable is an Object.  Objects are variables defined by their class.
    // String is a perfect example of an object.  Strings are "strings" of characters, and they are
    // typically used to store text information.
    String name = "Austin";

    // The easiest way to tell the difference between primitives and objects are by the first letter
    // of the variable type.  Primitives are always in lowercase, while Objects should start with a
    // capital letter.  These "naming conventions" are further explained in the NamingConventions
    // file.

    // ------------------------------------------------------------------------------------------ //

    // A more advanced variable type is an array.  An array is a list of variables of equal type.
    // Here is an example of an array:
    double[] grades = new double[5];

    // Arrays are referenced with the square brackets.  An array of a variable will be declared
    // like the double array is above.
    // "double[]" defines the type as a double array.
    // "new double[x]" creates a new array of type double, with "x" number of slots.  Above we are
    //     making an array of length 5, meaning it can hold at most 5 doubles.
    // This syntax is required to make an array, because Java needs to "allocate" the memory for the
    // array.  As a result, you cannot use more slots than you originally defined.

    // If you want to add values to the array, you can use the following syntax:
    public void addFirstGrade(double score) {
        grades[0] = score;
    }

    // It is important to know that arrays "index" at 0.  This means the first value exists at the
    // zeroth position.  This also means that the last possible index is one less than the length.

    // Array indices can be referenced with variables.
    public void addGrade(int gradeNumber, double score){
        grades[gradeNumber] = score;
    }
    // When you use variables for array indices, you need to make sure you are only using values
    // that are within the bounds of the array.  Otherwise, Java will stop running your program and
    // will throw an "exception".

}
