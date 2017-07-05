package org.firstinspires.ftc.teamcode.Sensors;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

@TeleOp(name="Color Sensor Example", group="Sensors")
public class ColorSensors extends OpMode {

    // There is a class that allows us to get the color values from the color sensor without
    // any extra programming.
    private ColorSensor colorSensor;

    public void init(){
        // The configuration should have a REV Color/Range Sensor on any of the I2C Buses
        colorSensor = hardwareMap.colorSensor.get("color1");
    }

    public void loop(){
        // The color sensor can sense the RGBA color space.  That is: Red, Green, Blue, and Alpha.
        int r = colorSensor.red();
        int g = colorSensor.green();
        int b = colorSensor.blue();
        int a = colorSensor.alpha();

        telemetry.addData("Red   ", r);
        telemetry.addData("Green ", g);
        telemetry.addData("Blue  ", b);
        telemetry.addData("Alpha ", a);

        telemetry.update();
    }
}