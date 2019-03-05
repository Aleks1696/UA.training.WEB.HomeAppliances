package com.model.service;

import com.model.dataBase.Devices;
import com.model.dataBase.Sockets;
import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.entity.Socket;
import com.model.entity.device.DigitalWatch;
import com.model.entity.device.SmartPhone;
import com.model.entity.device.TV;
import com.view.View;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ServiceImplTest {
    private Service service;
    private Apartment apartment;

    @Before
    public void initialization() {
        service = new ServiceImpl();
        apartment = service.createApartment();
    }

    @Test
    public void getDeviceListPositive() {
        Apartment apartment = new Apartment();
        assertEquals(apartment.getAllDevicesList(), service.getDeviceList());
    }

    @Test
    public void getSocketListPositive() {
        assertEquals(apartment.getDashBoard().getSocketList(), service.getSocketList());
    }

    @Test
    public void plugInDevicePositive() {
        Device device = new SmartPhone();
        Socket socket = new Socket(3);
        assertEquals("device.smartPhone.plugIn.message",
                service.plugInDevice(socket, device));
        assertTrue(socket.getDeviceList().contains(device));
    }

    @Test
    public void plugInDeviceWhenSocketIsFull() {
        Device device = new SmartPhone();
        Socket socket = new Socket(0);
        assertEquals("service.noFreeSocket.message",
                service.plugInDevice(socket, device));
    }

    @Test
    public void plugInDeviceWhenDeviceIsPlugged() {
        Device device = new DigitalWatch();
        Socket socket = Sockets.getSocket(Sockets.SOCKET_3);
        service.plugInDevice(socket, device);
        assertEquals("service.device.isAlreadyPlugged.message",
                service.plugInDevice(socket, device));
    }

    @Test
    public void plugOffDevicePositive() {
        Device device = new TV();
        service.plugInDevice(Sockets.getSocket(Sockets.SOCKET_3), device);
        assertEquals("device.TV.plugOff.message", service.plugOffDevice(device));
        for (Socket socket : apartment.getDashBoard().getSocketList()) {
            if (socket.getDeviceList().contains(device)) {
                fail();
            }
        }
    }

    @Test
    public void plugOffDeviceNegative() {
        Device device = new TV();
        assertEquals("service.device.isNotPlugged.message",
                service.plugOffDevice(device));
    }

    @Test
    public void getPowerUsagePositive() {
        Device device1 = Devices.getDevice(Devices.TV);
        Device device2 = Devices.getDevice(Devices.REFRIGIRATOR);
        service.plugInDevice(Sockets.getSocket(Sockets.SOCKET_3), device1);
        service.plugInDevice(Sockets.getSocket(Sockets.SOCKET_3), device2);
        Integer powerUsageOfDevices = device1.getDevicePowerUsage() + device2.getDevicePowerUsage();
        assertEquals(powerUsageOfDevices.toString(), service.getPowerUsage());
    }

    @Test
    public void findDevicesByPowerUsage() {
        int min = 120;
        int max = 260;
        Device expectedDevice1 = Devices.getDevice(Devices.REFRIGIRATOR);
        Device expectedDevice2 = Devices.getDevice(Devices.TV);
        assertTrue(service.findDevicesByPowerUsage(min, max).contains(expectedDevice1.getClass().getSimpleName()));
        assertTrue(service.findDevicesByPowerUsage(min, max).contains(expectedDevice2.getClass().getSimpleName()));
    }
}