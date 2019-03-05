package com.model.dataBase;

import com.model.entity.Device;
import com.model.entity.device.DigitalWatch;
import com.model.entity.device.Refrigerator;
import com.model.entity.device.SmartPhone;
import com.model.entity.device.TV;
import com.model.types.Brand;
import com.model.types.Resolution;
import java.util.ArrayList;
import java.util.List;

public enum Devices {
    SMARTPHONE(new SmartPhone(Brand.XIAOMI, 5.4, 6, 128, true, 80)),
    DIGITALWATCH(new DigitalWatch(Brand.SUUNTO, "Green", true, 15)),
    REFRIGIRATOR(new Refrigerator(Brand.BOSCH, 2.2, 214, "Grey", 250)),
    TV(new TV(Brand.KIVI, 49.9, Resolution.QUAD_HD, true, 120));

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
