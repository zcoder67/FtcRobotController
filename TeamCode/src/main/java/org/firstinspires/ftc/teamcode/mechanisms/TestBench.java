package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    // private -> good to do w/ hardware, only this class can access it
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRev; // ticks per revolution


    public void init(HardwareMap haMap) {
        // TOUCH SENSOR
        touchSensor = haMap.get(DigitalChannel.class,"touch_sensor");
        // tells the control hub that the digital device it's connected to is an input
        touchSensor.setMode(DigitalChannel.Mode.INPUT);

        // DC MOTOR
        motor = haMap.get(DcMotor.class, "motor"); //string name has to be same as one during configuration
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // using encoder to attain target velocity
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        //stops motor immediately
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setMotorBrakeBehavior(DcMotor.ZeroPowerBehavior zeroBehavior) { // zeroBehavior can be FLOAT, BRAKE..
        motor.setZeroPowerBehavior(zeroBehavior);
    }
    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

    public void setMotorSpeed(double speed) {
        // speed is b/w -1 and 1 inclusive
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        // normalizing ticks to revolutions
        return motor.getCurrentPosition()/ticksPerRev;
    }
}
