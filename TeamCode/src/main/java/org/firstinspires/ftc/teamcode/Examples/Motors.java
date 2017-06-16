package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Motors Example", group="Examples")
public class Motors extends OpMode {

    // So far you may have only seen the "public" keyword for variables.  "private" means this
    // variable is ONLY available to THIS class.  For the most part (in our programs) this
    // "access modifier" is just a convention.

    // "DcMotor" is a class which defines all of the methods that make motors work.  We can make
    // a DcMotor object, in this case called "exampleMotor", that will let us reference a motor.
    private DcMotor exampleMotor;

    public void init(){
        // For anything to work, we need to "get" the motor from the configuration defined on the
        // Robot Controller.  This example assumes a motor called "motor_name" has been added to
        // the configuration.
        // "hardwareMap" is our way of getting to the configuration.
        // "dcMotor" is the type of device we are trying to access.  This can be "servo" or
        //           other types, as long as they match the variable type.
        // "get" does the actual getting of the motor.  If the configuration does not have this
        //       name defined, the Robot Controller app will complain, and you will not be able
        //       to run this Op Mode.
        exampleMotor = hardwareMap.dcMotor.get("motor_name");

        // This method can be used to "Reverse" the direction of the motor. This allows you to
        // assign a positive output and have the motor spin in the reverse direction. This is useful
        // for drivetrains, where both sides spin in opposite "forward" directions.
        // If you want the motor to spin in the reverse direction, change "FORWARD" to "REVERSE"
        exampleMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void loop(){
        // This is the way to set the power output of a motor.  The value is expected to be within
        // -1.0 and 1.0. The value represents the percentage of power to set the motor. This
        // example sets the power to 30%.
        exampleMotor.setPower(0.3);
    }
}