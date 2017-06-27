package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servos Example - 180", group="Examples")
public class Servos180 extends OpMode {

    // This example demonstrates how to control Servos.  This specifically explains 180 degree
    // servos.

    // "Servo" is a class which defines all of the methods that make servos work.  We can make
    // a Servo object, in this case called "exampleServo", that will let us reference a servo.
    private Servo exampleServo;

    public void init(){
        // For anything to work, we need to "get" the servo from the configuration defined on the
        // Robot Controller.  This example assumes a servo called "servo_name" has been added to
        // the configuration.
        // "hardwareMap" is our way of getting to the configuration.
        // "servo" is the type of device we are trying to access.  This can be "dcMotor" or
        //           other types, as long as they match the variable type.
        // "get" does the actual getting of the servo.  If the configuration does not have this
        //       name defined, the Robot Controller app will complain, and you will not be able
        //       to run this Op Mode.
        exampleServo = hardwareMap.servo.get("servo_name");

        // This method call is how we move servos.  setPosition takes a decimal value between 0.0
        // and 1.0.  During the init() method, you should set servos to a desired initial position.
        // Here we are initializing the servo to the minimum position (all the way to one side).
        exampleServo.setPosition(0.0);
    }

    public void loop(){
        // Here we are setting the servo to the central position.
        exampleServo.setPosition(0.5);
    }
}