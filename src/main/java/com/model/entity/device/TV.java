package com.model.entity.device;

import com.model.entity.Device;
import com.model.types.Brand;
import com.model.types.Resolution;

public class TV extends Device {
    private Double displaySize;
    private Resolution resolution;
    private Boolean voiceControl;

    public TV() {
    }

    public TV(Brand brand, Double displaySize, Resolution resolution, Boolean voiceControl, Integer powerUsagePerHour) {
        super(brand, powerUsagePerHour);
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.voiceControl = voiceControl;
    }

    public String getDeviceReactionOnPlugIn() {
        return "device.TV.plugIn.message";
    }

    public String getDeviceReactionOnPlugOff() {
        return "device.TV.plugOff.message";
    }
}
