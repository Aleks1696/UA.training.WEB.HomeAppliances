package com.model.dataBase;

import com.model.entity.*;
import com.model.types.Brand;
import com.model.types.Resolution;
import java.util.ArrayList;
import java.util.List;

public enum Devices {
    SMARTPHONE(new SmartPhone(Brand.XIAOMI, 80, 5.4, 128, 8, true)),
    DIGITALWATCH(new DigitalWatch(Brand.SUUNTO, 15, "Green", true)),
    REFRIGERATOR(new Refrigerator(Brand.BOSCH, 250, 214, 200, "Grey")),
    TV(new TV(Brand.KIVI, 120, 49.9, Resolution.QUAD_HD, true));

    private Device device;

    Devices(Device device) {
        this.device = device;
    }

    public static List<Device> getAllDevices() {
        List<Device> deviceList = new ArrayList<>();
        for (Devices device : Devices.values()) {
            deviceList.add(device.device);
        }
        return deviceList;
    }

    public static Device getDevice(Devices devices) {
        return devices.device;
    }
}
