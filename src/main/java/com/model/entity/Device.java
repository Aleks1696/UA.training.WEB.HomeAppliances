package com.model.entity;

import com.model.types.Brand;

public abstract class Device implements DeviceUsage {
    private Brand brand;
    private Integer powerUsagePerHour;

    public Device() {
    }

    public Device(Brand brand, Integer powerUsagePerHour) {
        this.brand = brand;
        this.powerUsagePerHour = powerUsagePerHour;
    }

    public Integer getDevicePowerUsage() {
        return powerUsagePerHour;
    }

    public String plugIn(Socket socket) {
        socket.getDeviceList().add(this);
        return getDeviceReactionOnPlugIn();
    }

    public String plugOff(Socket socket) {
        socket.getDeviceList().remove(this);
        return getDeviceReactionOnPlugOff();
    }

    public abstract String getDeviceReactionOnPlugIn();

    public abstract String getDeviceReactionOnPlugOff();
}
