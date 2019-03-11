package com.model.entity;

import com.view.Messages;
import com.model.types.Brand;

public class DigitalWatch extends Device {
    private String digitsColor;
    private boolean alarm;

    public DigitalWatch() {
    }

    public DigitalWatch(Brand brand, int powerUsagePerHour, String digitsColor, boolean alarm) {
        super(brand, powerUsagePerHour);
        this.digitsColor = digitsColor;
        this.alarm = alarm;
    }

    public String getDeviceReactionOnPlugIn() {
        return Messages.DIGITAL_WATCH_PLUG_IN;
    }

    public String getDeviceReactionOnPlugOff() {
        return Messages.DIGITAL_WATCH_PLUG_OFF;
    }

    public String getDigitsColor() {
        return digitsColor;
    }

    public void setDigitsColor(String digitsColor) {
        this.digitsColor = digitsColor;
    }

    public boolean getAlarm() {
        return alarm;
    }

    public void setAlarm(Boolean alarm) {
        this.alarm = alarm;
    }
}
