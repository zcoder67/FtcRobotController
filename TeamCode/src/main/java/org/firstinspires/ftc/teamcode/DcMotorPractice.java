package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench bench = new TestBench();
    @Override
    public void init() {
        bench.init(hardwareMap);
    }
    public void loop() {
        // using gamepad to control motor speed
        double motorSpeed = gamepad1.left_stick_y;
        bench.setMotorSpeed(motorSpeed);

        // Using REV touch sensor to control motor speed
        if (bench.isTouchSensorPressed()) {
            bench.setMotorSpeed(0.5);
        }
        else {
            bench.setMotorSpeed(0);
        }

        if (gamepad1.a) {
            bench.setMotorBrakeBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
           bench.setMotorBrakeBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }
        telemetry.addData("Motor Revs: ", bench.getMotorRevs());
    }
}
