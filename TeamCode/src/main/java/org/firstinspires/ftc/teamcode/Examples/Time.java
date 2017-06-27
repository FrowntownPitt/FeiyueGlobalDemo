package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Time", group="Examples")
public class Time extends OpMode {

    // We will be storing the time at the given instance in double variables.

    // startTime is the time when the init() method is called.  This is called when the user presses
    // the init button on the Driver Station.
    private double initTime;

    // startTime is the time when the start() method is called.  This is the instant that the user
    // presses the play button on the Driver Station.
    private double startTime;


    public void init(){
        // getRuntime() gets the time, in seconds, since the start of the OpMode.  The start of the
        // OpMode is defined as when the user presses the init button.
        initTime = getRuntime();
    }

    // Here we are using the "start()" method that was declared in OpMode.  This method runs exactly
    // once, when the user presses the play button on the Driver Station.  loop() is then called
    // after this is finished executing.
    @Override
    public void start(){
        startTime = getRuntime();
    }

    public void loop(){
        // We can compare the runtime to the init and start times.
        telemetry.addData("Current time     ", getRuntime());
        telemetry.addData("Time since init  ", getRuntime() - initTime);
        telemetry.addData("Time since start ", getRuntime() - startTime);

        telemetry.update();
    }
}
