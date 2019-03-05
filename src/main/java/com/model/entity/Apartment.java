package com.model.entity;

import com.model.dataBase.Devices;
import java.util.List;

public class Apartment {
    private List<Device> allDevicesList;
    private DashBoard dashBoard;

    public Apartment() {
        allDevicesList = Devices.getAllDevices();
        dashBoard = new DashBoard();
    }

    public List<Device> getAllDevicesList() {
        return allDevicesList;
    }

    public DashBoard getDashBoard() {
        return dashBoard;
    }
}
