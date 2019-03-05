package com.model.entity.device;

import com.model.entity.Device;
import com.model.types.Brand;

public class DigitalWatch extends Device {
    private String digitsColor;
    private Boolean alarm;

    public DigitalWatch() {
    }

    public DigitalWatch(Brand brand, String digitsColor, Boolean alarm, Integer powerUsagePerHour) {
        super(brand, powerUsagePerHour);
        this.digitsColor = digitsColor;
        this.alarm = alarm;
    }

    public String getDeviceReactionOnPlugIn() {
        return "device.digitalWatch.plugIn.message";
    }

    public String getDeviceReactionOnPlugOff() {
        return "device.digitalWatch.plugOff.message";
    }
}
