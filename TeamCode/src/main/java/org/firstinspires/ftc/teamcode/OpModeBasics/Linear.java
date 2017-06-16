package org.firstinspires.ftc.teamcode.OpModeBasics;

// Here we import the packages which are necessary to create an OpMode
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Iterative Type", group="Documentation")
public class Iterative extends OpMode {

    // This is an "iterative" Op Mode.  The class definition above looks a little different than
    // the IntroToJava classes.  This has two more words: "extends" and "OpMode".
    // "extends"    This keyword means this class (Iterative) will "inherit" or take all of the
    //              methods and member variables from the following class (OpMode).
    // "OpMode"     This is the class from which the current class will inherit methods and
    //              member variables.

    // Since Iterative extends OpMode, we MUST define the methods which OpMode requires.
    // These are init and loop.  There are other (optional) methods which OpMode defines that we can
    // "Override" and make usable by our Iterative class.  These include init_loop, start, and end.

    // init() will be called exactly once when the user presses the "init" button on the Driver
    // station.
    public void init(){
        // Code will go here to initialize your robot.
        // Initialization includes finding motors and sensors, setting servos to starting locations,
        // and doing any other calibration.
    }

    // loop will be executed many times over the lifetime of the OpMode.  When the Driver Station's
    // "Play" button has been pressed, this loop will be called repeatedly until the user presses
    // the "Stop" button.
    public void loop(){
        // Code to make your robot move will go in here.
        // You can set motors to spin at certain speeds, move servos to set position, and do other
        // robot tasks in this method based on joystick and sensor inputs.

        // It is VERY important that you do not program a loop to do things repeatedly within this
        // method.  Check out the Blocking.java example to understand why, and the advanced
        // programming guides to know how to implement alternatives.
    }
}
