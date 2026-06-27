package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled // code below is prevented from being applied to robot, this way u can save work w/out having to implement it on robot
@TeleOp // can also write @Autonomous to refer to that part of Driver Station
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Salam", "Zeba");
    }

    @Override
    public void loop() {

    }
}

/*

 */
