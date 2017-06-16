package org.firstinspires.ftc.teamcode.OpModeBasics;

// Here we import the packages which are necessary to create a LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Linear Type", group="Documentation")
public class Linear extends LinearOpMode {

    // This is an "iterative" Op Mode.  The class definition above looks a little different than
    // the IntroToJava classes.  This has two more words: "extends" and "LinearOpMode".
    // "extends"    This keyword means this class (Linear) will "inherit" or take all of the
    //              methods and member variables from the following class (LinearOpMode).
    // "LinearOpMode"     This is the class from which the current class will inherit methods and
    //              member variables.

    // Since Linear extends OpMode, we MUST define the runOpMode method which LinearOpMode
    // requires.

    public void runOpMode(){

        // robot initialization goes here.

        // This method call will pause this OpMode until the user presses the "play" button.
        waitForStart();

        // This while loop will execute repeatedly until the user presses the "stop" button.
        while(opModeIsActive()){
            // The code to run your robot will go in here.  The same principle for blocking applies
            // here, but it will not crash your app under normal circumstances.
        }
    }
}
