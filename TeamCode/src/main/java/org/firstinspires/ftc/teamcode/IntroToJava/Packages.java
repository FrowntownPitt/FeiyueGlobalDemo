package org.firstinspires.ftc.teamcode.IntroToJava;

// This is part of the introduction to Java - specifically the FIRST Tech Challenge/
// FIRST Global Challenge Software Development Kit (SDK).


// At the top of all of these introduction programs you may have noticed a line that says
// "package org.firstinspires.ftc.teamcode.IntroToJava;".
// This is known as "packaging", and it is a way that Java organizes projects.  Classes for a
// common purpose typically go into the same package.

// If you want to use a class from a different package, you need to import it (like as follows):
import org.firstinspires.ftc.teamcode.IntroToJava.Constants;
// That line is unnecessary in our case, since that class is contained in this class's package.
// This would work for any other package.
public class Packages {

    // Create a class object so we can reference its methods.
    Constants classReference = new Constants();

    public void test(){
        // Use the method from that class.  You need to access it through a class object.
        double result = classReference.calculateMotorOutput(0.5);

        // This will print 0.2, since calculateMotorOutput compares the parameter with 0.2;
        System.out.println("Motor output: " + result);
    }
}