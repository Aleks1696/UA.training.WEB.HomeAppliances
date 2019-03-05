package com.model.entity;

import com.model.dataBase.Devices;
import com.model.dataBase.Sockets;
import com.model.service.Service;
import com.model.service.ServiceImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashBoardTest {
    private DashBoard dashBoard;

    @Before
    public void initialization() {
        dashBoard = new DashBoard();
    }

    @Test
    public void getPowerUsagePositive() {
        dashBoard = new DashBoard();
        Device device = Devices.getDevice(Devices.REFRIGIRATOR);
        Socket socket = Sockets.getSocket(Sockets.SOCKET_3);
        device.plugIn(socket);
        assertEquals(device.getDevicePowerUsage().intValue(), dashBoard.getPowerUsage());
    }
}