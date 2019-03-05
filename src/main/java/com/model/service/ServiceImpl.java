package com.model.service;

import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.entity.Socket;
import com.model.service.util.DeviceUtil;
import java.util.*;

public class ServiceImpl implements Service {
    private Apartment apartment;
    private List<String> response;

    public ServiceImpl() {
        response = new ArrayList<>();
    }

    public Apartment createApartment() {
        apartment = new Apartment();
        return apartment;
    }

    public List<Device> getDeviceList() {
        return apartment.getAllDevicesList();
    }

    public List<Socket> getSocketList() {
        return apartment.getDashBoard().getSocketList();
    }

    public String plugInDevice(Socket socket, Device device) {
        if (!DeviceUtil.checkIfPlugged(device, getSocketList())) {
            if (socket.getNumberOfSockets() > socket.getDeviceList().size()) {
                return device.plugIn(socket);
            } else {
                return "service.noFreeSocket.message";
            }
        } else {
            return "service.device.isAlreadyPlugged.message";
        }
    }

    public String plugOffDevice(Device device) {
        for (Socket socket : getSocketList()) {
            if (socket.getDeviceList().contains(device)) {
                return device.plugOff(socket);
            }
        }
        return "service.device.isNotPlugged.message";
    }

    public String getPowerUsage() {
        return String.valueOf(apartment.getDashBoard().getPowerUsage());
    }

    public void sortByPowerUsage() {
        Collections.sort(
                apartment.getAllDevicesList(),
                (device1, device2) -> device2.getDevicePowerUsage().compareTo(device1.getDevicePowerUsage())
        );
    }

    public List<String> findDevicesByPowerUsage(int min, int max) {
        response.clear();
        for (Device device : apartment.getAllDevicesList()) {
            if (device.getDevicePowerUsage() >= min
                    && device.getDevicePowerUsage() <= max) {
                response.add(device.getClass().getSimpleName());
            }
        }
        return response;
    }
}
