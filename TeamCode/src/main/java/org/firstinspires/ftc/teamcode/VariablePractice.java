package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init(){
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        int servoAngle = 60;
        String teamName = "Mars Rovers"; // strings are classes, not variables


        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("Motor Speed: ", motorSpeed);
        telemetry.addData("Claw Closed: ", clawClosed);
        telemetry.addData("Servo Angle: ", servoAngle);
        telemetry.addData("Programmed by: ", teamName);
    }

    @Override
    public void loop() {

    }
}
