package org.firstinspires.ftc.teamcode.Sensors;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.AnalogSensor;

@TeleOp(name="Potentiometer Demo", group="Sensors")
public class Potentiometer extends OpMode {

    // All analog sensors are accessed with this AnalogInput class.
    private AnalogInput potentiometer;

    public void init(){
        // The configuration should have your sensor on any of the "Analog Input Devices" ports.
        potentiometer = hardwareMap.analogInput.get("potentiometer");
    }

    public void loop(){
        // Analog sensors can return a defined maximum value, so we can access it for our own
        // calculations
        double maxResult = potentiometer.getMaxVoltage();

        // The value of an analog sensor is in terms of volts. Since REV's system uses 3.3v, this
        // will return a value between 0 and 3.3
        double result = potentiometer.getVoltage();

        // We can turn our potentiometer value into a normalized value, one which is between 0.0 and
        // 1.0, by dividing the result by the max possible result.
        double normalizedResult = result/maxResult;

        telemetry.addData("Raw Value  ", result);
        telemetry.addData("Max Value  ", maxResult);
        telemetry.addData("Normalized ", normalizedResult);

        telemetry.update();
    }
}