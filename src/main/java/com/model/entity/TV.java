package com.model.entity;

import com.view.Messages;
import com.model.types.Brand;
import com.model.types.Resolution;

public class TV extends Device {
    private double displaySize;
    private Resolution resolution;
    private boolean voiceControl;

    public TV() {
    }

    public TV(Brand brand, Integer powerUsagePerHour, double displaySize, Resolution resolution, boolean voiceControl) {
        super(brand, powerUsagePerHour);
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.voiceControl = voiceControl;
    }

    public String getDeviceReactionOnPlugIn() {
        return Messages.TV_PLUG_IN;
    }

    public String getDeviceReactionOnPlugOff() {
        return Messages.TV_PLUG_OFF;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public boolean isVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(boolean voiceControl) {
        this.voiceControl = voiceControl;
    }
}
