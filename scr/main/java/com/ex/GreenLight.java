package com.ex;


public class GreenLight {
    String name;

    public GreenLight(String name) {
        this.name = name;
    }

    public void burn() {
        System.out.println("Горит " + name + " свет");
    }
}
