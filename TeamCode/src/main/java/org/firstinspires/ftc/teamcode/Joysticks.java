package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by frown on 5/25/2017.
 */

@TeleOp(name="Joysticks", group="Documentation")
public class Joysticks extends OpMode {
    /*
     * This class explains the code required to make use of the different joystick options.
     */

    public void init(){

    }

    public void loop(){
        // Buttons are "boolean" values, or On/Off.  An example for buttons is to move servos to
        // specific positions or run motors at specific speeds.
        boolean x = gamepad1.x;
        boolean y = gamepad1.y;
        telemetry.addData("Gamepad 1 x:", x);
        telemetry.addData("Gamepad 1 y:", y);

        // Joysticks have 2 degrees of motion, allowing you to change 2 axes at once.  They are
        // usually used for driving robots.  Their values are from -1.0 to 1.0 per axis.
        float leftStickX = gamepad1.left_stick_x;
        float leftStickY = gamepad1.left_stick_y;
        telemetry.addData("Gamepad 1 Left Joystick X :", leftStickX);
        telemetry.addData("Gamepad 1 Left Joystick Y :", leftStickY);

        // Triggers are "float" values.  Triggers allow you to control positions or speeds with
        // more precision than just On/Off by buttons.  The values of triggers are from 0.0 to 1.0
        float rightTrigger = gamepad1.right_trigger;
        telemetry.addData("Gamepad 1 Right Trigger: ", rightTrigger);
    }

}
