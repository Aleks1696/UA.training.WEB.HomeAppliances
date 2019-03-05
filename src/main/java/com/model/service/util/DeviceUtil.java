package com.model.service.util;

import com.model.entity.Device;
import com.model.entity.Socket;

import java.util.List;

public class DeviceUtil {
    public static boolean checkIfPlugged(Device device, List<Socket> socketList) {
        for (Socket socket : socketList) {
            if (socket.getDeviceList().contains(device)) {
                return true;
            }
        }
        return false;
    }
}
