package com.model.dataBase;

import com.model.entity.Device;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DevicesTest {

    @Test
    public void getAllDevicesPositivePositive() {
        List<Device> allDevicesFromDB = Devices.getAllDevices();
        assertTrue(allDevicesFromDB.contains(Devices.getDevice(Devices.TV)));
        assertTrue(allDevicesFromDB.contains(Devices.getDevice(Devices.REFRIGERATOR)));
        assertTrue(allDevicesFromDB.contains(Devices.getDevice(Devices.SMARTPHONE)));
        assertTrue(allDevicesFromDB.contains(Devices.getDevice(Devices.DIGITALWATCH)));
    }
}