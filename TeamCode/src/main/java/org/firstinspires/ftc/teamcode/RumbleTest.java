package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class RumbleTest extends OpMode {
    boolean wasA, isA; // so we don't accidentally rumble blip too many times

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        isA = gamepad1.a;
        if (isA && !wasA) {
            // gamepad1.rumble(500); // ms
            gamepad1.rumbleBlips(3); // multiple rumbles
            // rumbles for right joystick, left joystick, duration
            gamepad1.rumble(1.0,0, 100);
        }
        wasA = isA;
    }
}
