package com.model.entity;

import com.view.Messages;
import com.model.types.Brand;

public class SmartPhone extends Device {
    private double displaySize;
    private int memory;
    private int ram;
    private boolean dualSim;

    public SmartPhone() {
    }

    public SmartPhone(Brand brand, Integer powerUsagePerHour, double displaySize, int memory, int ram, boolean dualSim) {
        super(brand, powerUsagePerHour);
        this.displaySize = displaySize;
        this.memory = memory;
        this.ram = ram;
        this.dualSim = dualSim;
    }

    public String getDeviceReactionOnPlugIn() {
        return Messages.SMARTPHONE_PLUG_IN;
    }

    public String getDeviceReactionOnPlugOff() {
        return Messages.SMARTPHONE_PLUG_OFF;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }
}
