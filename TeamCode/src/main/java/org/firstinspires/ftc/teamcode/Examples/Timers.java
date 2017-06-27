package org.firstinspires.ftc.teamcode.Examples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Timers Example", group="Examples")
public class Timers extends OpMode {

    // We will be storing the time at the given instance in double variables.

    // startTime is the time when the start() method is called.  This is the instant that the user
    // presses the play button on the Driver Station.
    private double startTime;


    public void init(){
    }

    // Here we are using the "start()" method that was declared in OpMode.  This method runs exactly
    // once, when the user presses the play button on the Driver Station.  loop() is then called
    // after this is finished executing.
    @Override
    public void start(){
        startTime = getRuntime();
    }

    public void loop(){
        // We will store the current elapsed time in a variable to use multiple times in this
        // loop
        double currentTime = getRuntime() - startTime;

        telemetry.addData("Current runtime ", currentTime);

        // For the first five seconds, the "waiting" message will be displayed.  Once 5 seconds
        // has passed, the message will change to the "finished" message.
        if(currentTime < 5.0){
            telemetry.addData("Timer 1 ", "Currently waiting for the 5 second mark...");
        } else {
            telemetry.addData("Timer 1 ", "The 5 second mark has passed!");
        }

        // Here is a second timer, which will run concurrently with the timer above.  This timer
        // will display the "Phase 1" message for the first 2.5 seconds, the "Phase 2" message for the
        // next 1.5 seconds, and the "Finished" message afterwards.
        if(currentTime < 2.5){
            telemetry.addData("Timer 2 ", "First phase (motor moving at 1.0)");
        } else if(currentTime < 4.0){
            telemetry.addData("Timer 2 ", "Second phase (motor moving at 0.5)");
        } else {
            telemetry.addData("Timer 2 ", "Finished (motor stopped)");
        }

        telemetry.update();
    }
}
