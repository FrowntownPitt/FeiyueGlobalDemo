package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Joysticks Example", group="Examples")
public class Joysticks extends OpMode {

    // This class demonstrates use of the joysticks of the gamepads.  It outputs the value of the
    // joystick positions.

    public void init(){
        // No initialization is needed for gamepads! :)
    }

    public void loop(){
        // This OpMode displays the values of the joysticks.
        // Y joystick values are 1.0 for fully down, -1.0 for fully forward (backwards from the
        //       cartesian coordinate system).
        // X joystick values are 1.0 for fully right, -1.0 for fully left (the same as the
        //       cartesian coordinate system).
        telemetry.addData("Gamepad 1 Left  Joystick Y ", gamepad1.left_stick_y);
        telemetry.addData("Gamepad 1 Left  Joystick X ", gamepad1.left_stick_x);
        telemetry.addData("Gamepad 1 Right Joystick Y ", gamepad1.right_stick_y);
        telemetry.addData("Gamepad 1 Right Joystick X ", gamepad1.right_stick_x);

        telemetry.addData("Gamepad 2 Left  Joystick Y ", gamepad2.left_stick_y);
        telemetry.addData("Gamepad 2 Left  Joystick X ", gamepad2.left_stick_x);
        telemetry.addData("Gamepad 2 Right Joystick Y ", gamepad2.right_stick_y);
        telemetry.addData("Gamepad 2 Right Joystick X ", gamepad2.right_stick_x);

        telemetry.update();
    }
}