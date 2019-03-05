package com.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Socket {
    private Integer numberOfSockets;
    private List<Device> deviceList;

    public Socket() {

    }

    public Socket(Integer numberOfSockets) {
        deviceList = new ArrayList<>();
        this.numberOfSockets = numberOfSockets;
    }

    public int getNumberOfSockets() {
        return numberOfSockets;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }
}
