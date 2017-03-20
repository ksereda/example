package com.ex;


public class RedLight {
    String name;

    public RedLight(String name) {
        this.name = name;
    }

    public void burn() {
        System.out.println("Горит " + name + " свет");
    }
}
