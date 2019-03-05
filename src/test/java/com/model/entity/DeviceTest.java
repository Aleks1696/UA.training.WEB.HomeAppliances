package com.model.entity;

import com.model.entity.device.Refrigerator;
import com.view.View;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeviceTest {

    @Test
    public void plugInPositive() {
        Device device = new Refrigerator();
        Socket socket = new Socket(3);
        device.plugIn(socket);
        assertTrue(socket.getDeviceList().contains(device));
        assertEquals("device.refrigerator.plugIn.message", device.plugIn(socket));
    }

    @Test
    public void plugOff() {
        Device device = new Refrigerator();
        Socket socket = new Socket(3);
        device.plugOff(socket);
        assertFalse(socket.getDeviceList().contains(device));
        assertEquals("device.refrigerator.plugOff.message", device.plugOff(socket));
    }
}