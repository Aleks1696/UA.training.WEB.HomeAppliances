package com.model.entity;

import com.model.types.Brand;

public abstract class Device {
    private Brand brand;
    private int powerUsagePerHour;
    private boolean isPluggedIn;

    public Device() {
    }

    public Device(Brand brand, int powerUsagePerHour) {
        this.brand = brand;
        this.powerUsagePerHour = powerUsagePerHour;
    }

    public abstract String getDeviceReactionOnPlugIn();

    public abstract String getDeviceReactionOnPlugOff();

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPowerUsagePerHour() {
        return powerUsagePerHour;
    }

    public void setPowerUsagePerHour(int powerUsagePerHour) {
        this.powerUsagePerHour = powerUsagePerHour;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }
}
