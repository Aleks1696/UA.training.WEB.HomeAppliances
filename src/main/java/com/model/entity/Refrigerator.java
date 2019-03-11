package com.model.entity;

import com.view.Messages;
import com.model.types.Brand;

public class Refrigerator extends Device {
    private double height;
    private int capacity;
    private String color;

    public Refrigerator() {
    }

    public Refrigerator(Brand brand, Integer powerUsagePerHour, double height, int capacity, String color) {
        super(brand, powerUsagePerHour);
        this.height = height;
        this.capacity = capacity;
        this.color = color;
    }

    public String getDeviceReactionOnPlugIn() {
        return Messages.REFRIGERATOR_PLUG_IN;
    }

    public String getDeviceReactionOnPlugOff() {
        return Messages.REFRIGERATOR_PLUG_OFF;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
