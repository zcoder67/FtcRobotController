package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamepadPractice extends OpMode {
    @Override // means the method is intended to replace inherited method from parent
    public void init() {

    }
    @Override
    public void loop() { // runs 50x per second
        double speedForward = gamepad1.left_stick_y/2.0;
        double xDifference = gamepad1.left_stick_x-gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger+ gamepad1.right_trigger;

        telemetry.addData("left x: ",gamepad1.left_stick_x);
        telemetry.addData("left y: ", speedForward);
        telemetry.addData("a button: ", gamepad1.a);

        telemetry.addData("right x: ",gamepad1.right_stick_x);
        telemetry.addData("right y: ",gamepad1.right_stick_y);
        telemetry.addData("b button: ",gamepad1.b);

        // show difference between the two x joystick
        telemetry.addData("x difference: ", xDifference);
        //show sum of two trigger values
        telemetry.addData("Sum of triggers: ", sumTriggers);

    }
}
