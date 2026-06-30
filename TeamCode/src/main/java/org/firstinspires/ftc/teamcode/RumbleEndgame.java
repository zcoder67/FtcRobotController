package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class RumbleEndgame extends OpMode {
    double endGameStart;
    boolean isEndGame;

    @Override
    public void init() {

    }

    public void start() {
        // 90 secs after start button, endgame begins
        endGameStart = getRuntime() + 90;
    }

    @Override
    public void loop() {
        // end game check
        if (endGameStart >= getRuntime() && !isEndGame) {
            gamepad1.rumbleBlips(3);
            isEndGame = true;
        }
    }
}
