package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {
    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN
    }

    public void init(HardwareMap hwMap) {
        colorSensor = hwMap.get(NormalizedColorSensor.class, "sensor_color_distance");
        colorSensor.setGain(4);
    }
    public DetectedColor getDetectedColor(Telemetry telemetry) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors(); // return 4 values

        float normRed, normGreen, normBlue;
        normRed = colors.red / colors.alpha;
        normGreen = colors.green / colors.alpha;
        normBlue = colors.blue / colors.alpha;

        telemetry.addData("Red: ", normRed);
        telemetry.addData("Green: ", normGreen);
        telemetry.addData("Blue: ", normBlue);

        /* RGB (Normalized) Values for:
        Red:   >.35 , <.3 , <.3
        Yellow: >.5  , >.9 , <.6
        Blue:  <.2  , <.5 , >.5
         */

        if (normRed > .35 && normGreen < .3 && normBlue < .3) {
            return DetectedColor.RED;
        }
        else if (normRed > .5 && normGreen > .9 && normBlue < .6) {
            return DetectedColor.YELLOW;
        }
        else if (normRed < .2 && normGreen < .5 && normBlue > .5) {
            return DetectedColor.BLUE;
        }
        else return DetectedColor.UNKNOWN;
    }
}
