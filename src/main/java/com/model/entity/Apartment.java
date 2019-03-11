package com.model.entity;

import com.model.dataBase.Devices;
import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private List<Device> allDevicesList;
    private List<Device> pluggedDevices;

    public Apartment() {
        allDevicesList = Devices.getAllDevices();
        pluggedDevices = new ArrayList<>();
    }

    public List<Device> getAllDevicesList() {
        return allDevicesList;
    }

    public List<Device> getPluggedDevices() {
        return pluggedDevices;
    }
}
