package com.model.entity;

import com.model.dataBase.Sockets;
import java.util.List;

public class DashBoard {
    private List<Socket> socketList;

    public DashBoard() {
       socketList = Sockets.getAllSockets();
    }

    public List<Socket> getSocketList() {
        return socketList;
    }

    public int getPowerUsage() {
        int powerUsageSum = 0;
        for (Socket socket : socketList) {
            for (Device device : socket.getDeviceList()) {
                powerUsageSum += device.getDevicePowerUsage();
            }
        }
        return powerUsageSum;
    }
}
