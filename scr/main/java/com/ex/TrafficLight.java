package com.ex;


public class TrafficLight {
    String name;
    Colour colour;
    GreenLight greenLight;
    YellowLight yellowLight;
    RedLight redLight;

    public TrafficLight(String name) {
        this.name = name;
    }

    void initWithGreen(GreenLight greenLight) {
        this.greenLight = greenLight;
        colour.greenLight = greenLight;
    }

    void initWithYellow(YellowLight yellowLight) {
        this.yellowLight = yellowLight;
        colour.yellowLight = yellowLight;
    }

    void initWithRed(RedLight redLight) {
        this.redLight = redLight;
        colour.redLight = redLight;
    }
}