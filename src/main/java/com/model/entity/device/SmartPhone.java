package com.model.entity.device;

import com.model.entity.Device;
import com.model.types.Brand;

public class SmartPhone extends Device {
    private Double displaySize;
    private Integer memory;
    private Integer ram;
    private Boolean dualSim;

    public SmartPhone() {
    }

    public SmartPhone(Brand brand, Double displaySize, Integer memory,
                      Integer ram, Boolean dualSim, Integer powerUsagePerHour) {
        super(brand, powerUsagePerHour);
        this.displaySize = displaySize;
        this.memory = memory;
        this.ram = ram;
        this.dualSim = dualSim;
    }

    public String getDeviceReactionOnPlugIn() {
        return "device.smartPhone.plugIn.message";
    }

    public String getDeviceReactionOnPlugOff() {
        return "device.smartPhone.plugOff.message";
    }
}
