package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servos Example - CR", group="Examples")
public class ServosCR extends OpMode {

    // This example demonstrates how to control Servos.  This specifically explains continuous
    // rotation servos.

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

        // This method is similar to the DcMotor direction.  If you want a negative speed to move
        // the servo forward, change FORWARD to REVERSE.
        exampleServo.setDirection(Servo.Direction.FORWARD);

        // This method call is how we move servos.  setPosition takes a decimal value between 0.0
        // and 1.0.  During the init() method, you should set servos to a desired initial position.
        // Continuous rotation servos will hold its current position (with velocity of 0) at a
        // median set position.  Since the method takes values from 0.0 to 1.0, 0.5 is the median.
        // 0.0 will move the servo in the negative direction at max speed, and 1.0 will move the
        // servo in the positive direction at max speed.  Any value between will make the servo
        // move in that direction at a lesser speed.
        exampleServo.setPosition(0.5);
    }

    public void loop(){
        // This method call will move the servo in the negative direction at a speed somewhere
        // between 0 and the max speed.  The servo speeds are not guaranteed to be linear, so
        // you will need to "tune" this number to get the servo to move at the speed you desire.
        exampleServo.setPosition(0.1);
    }
}