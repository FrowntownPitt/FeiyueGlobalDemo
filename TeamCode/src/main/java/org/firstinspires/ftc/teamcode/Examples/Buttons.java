package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Buttons Example", group="Examples")
public class Buttons extends OpMode {

    // This class demonstrates use of the buttons of the gamepads.  It outputs the values of
    // various buttons of gamepad 1.

    public void init(){
        // No initialization is needed for gamepads! :)
    }

    public void loop(){
        telemetry.addData("Left Trigger", gamepad1.left_trigger);
        telemetry.addData("Left Bumper ", gamepad1.left_bumper);

        telemetry.addData("X ", gamepad1.y);
        telemetry.addData("Y ", gamepad1.y);
        telemetry.addData("A ", gamepad1.a);
        telemetry.addData("B ", gamepad1.b);

        telemetry.addData("DPad Up    ", gamepad1.dpad_up);
        telemetry.addData("DPad Down  ", gamepad1.dpad_down);
        telemetry.addData("DPad Left  ", gamepad1.dpad_left);
        telemetry.addData("DPad Right ", gamepad1.dpad_right);

        telemetry.update();
    }
}