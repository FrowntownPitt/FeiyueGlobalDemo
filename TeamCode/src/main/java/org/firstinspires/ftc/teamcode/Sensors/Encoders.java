package org.firstinspires.ftc.teamcode.Sensors;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Encoder Example", group="Sensors")
public class Encoders extends OpMode {

    private DcMotor motor;
    private AnalogInput potentiometer;

    double maxPotentiometer;

    public void init(){
        motor = hardwareMap.dcMotor.get("motor");
        potentiometer = hardwareMap.analogInput.get("potentiometer");

        maxPotentiometer = potentiometer.getMaxVoltage();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void loop(){
        double sensorValue = potentiometer.getVoltage() / maxPotentiometer;
        int encoderValue = motor.getCurrentPosition();

        if(sensorValue > 0.45 && sensorValue < 0.55){
            motor.setPower(0);
        } else if(sensorValue > 0.4 && sensorValue < 0.6) {
            if (encoderValue > 10) {
                motor.setPower(-0.6);
            } else if (encoderValue < -10) {
                motor.setPower(0.6);
            } else {
                motor.setPower(0);
            }
        } else if(sensorValue >= 0.6){
            motor.setPower(0.4);
        } else if(sensorValue <= 0.4){
            motor.setPower(-0.4);
        }

        telemetry.addData("Encoder ", encoderValue);
        telemetry.addData("Sensor  ", sensorValue);

        telemetry.update();
    }
}
