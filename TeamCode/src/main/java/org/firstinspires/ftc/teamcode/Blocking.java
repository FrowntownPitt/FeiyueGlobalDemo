package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by frown on 5/25/2017.
 */

@TeleOp(name="Blocking Example (CRASHES!)", group="Documentation")
public class Blocking extends OpMode {
    /*
     * This class demonstrates the effect of a blocking operation on the app.
     * WARNING: This app is guaranteed to crash when the user continues to hold the "x" button on
     * gamepad 1.
     */

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    public void init(){
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");

        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    public void loop(){

        /* This is an example of what NOT to do in an iterative OpMode.
         * This while loop sets the motors to the power of the joysticks when the gamepad's x button
         * is pressed.  This will CRASH THE APP when you hold the X button.  The app waits for
         * "loop()" to finish executing before starting any other methods.  This is called a
         * "blocking" operation.  Android will FORCIBLY KILL the Robot Controller App if it does not
         * respond within an arbitrary period of time (somewhere around 5 seconds).  Since the app
         * gets blocked by this while loop, the app will crash, and your robot will stop working.
         * There are many ways of crashing the app in this manner, so be careful when programming
         * blocking operations.
         */

        while(gamepad1.x) {
            leftMotor.setPower(-gamepad1.left_stick_y);
            rightMotor.setPower(-gamepad1.right_stick_y);
        }
    }


}
