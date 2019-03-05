package com.model.entity.device;

import com.model.entity.Device;
import com.model.types.Brand;

public class Refrigerator extends Device {
    private Double height;
    private Integer capacity;
    private String color;

    public Refrigerator() {
    }

    public Refrigerator(Brand brand, Double height, Integer capacity, String color, Integer powerUsagePerHour) {
        super(brand, powerUsagePerHour);
        this.height = height;
        this.capacity = capacity;
        this.color = color;
    }

    public String getDeviceReactionOnPlugIn() {
        return "device.refrigerator.plugIn.message";
    }

    public String getDeviceReactionOnPlugOff() {
        return "device.refrigerator.plugOff.message";
    }
}
