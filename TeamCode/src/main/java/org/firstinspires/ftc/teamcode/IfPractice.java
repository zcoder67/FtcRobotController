package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a; // press = true, not pressed = false
        double motorSpeed = gamepad1.left_stick_y;

        if (aButton) { // if the var is a boolean, best to write it this way
            telemetry.addData("A Button ", "pressed.");
        }
        else {
            telemetry.addData("A Button "," not pressed.");
        }
        telemetry.addData("A Button", aButton);

        if (motorSpeed < 0) {
            telemetry.addData("Left Stick y ", "is negative.");
        }
        else if (motorSpeed > 0.5){ // make sure this goes before (motorSpeed > 0)
            telemetry.addData("Left Stick y ", "is greater than 50%.");
        }
        else if (motorSpeed > 0){
            telemetry.addData("Left Stick y ", "is positive.");
        }
        else {
            telemetry.addData("Left Stick y ", "is zero.");
        }
        telemetry.addData("Left Stick Y Value: ", motorSpeed);

        if (!gamepad1.a) {
            motorSpeed *= 0.5;
        }
    }
}

/*
Operator | Meaning
   ==    | is equal to
   !=    | is not equal to
   <     | is less than
   >     | is greater than
   <=    | is less than or equal to
   >=    | is greater than or equal to

   &&    | AND
   ||    | OR
   !     | NOT
 */
