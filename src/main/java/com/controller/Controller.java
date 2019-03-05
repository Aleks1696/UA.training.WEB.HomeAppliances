package com.controller;

import com.model.dataBase.Devices;
import com.model.dataBase.Sockets;
import com.model.entity.Device;
import com.model.service.Service;
import com.model.service.ServiceImpl;
import com.view.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Service service;
    private List<String> responseMessages;

    public Controller() {
        responseMessages = new ArrayList<>();
        service = new ServiceImpl();
    }

    public void createApartment() {
        service.createApartment();
    }

    public List<Device> getDevicesList() {
        return service.getDeviceList();
    }

    public List<String> plugInDevice() {
        responseMessages.clear();
        String deviceMessage = service.plugInDevice(Sockets.getSocket(Sockets.SOCKET_1),
                Devices.getDevice(Devices.REFRIGIRATOR));
        responseMessages.add(View.bundle.getString(deviceMessage));
        return responseMessages;
    }

    public List<String> plugOffDevice() {
        responseMessages.clear();
        String deviceMessage = (service.plugOffDevice(Devices.getDevice(Devices.REFRIGIRATOR)));
        responseMessages.add(View.bundle.getString(deviceMessage));
        return responseMessages;
    }

    public List<String> getPowerUsage() {
        responseMessages.clear();
        String deviceMessage = service.getPowerUsage();
        responseMessages.add(deviceMessage);
        return responseMessages;
    }

    public void sortByPowerUsage() {
        service.sortByPowerUsage();
    }

    public List<String> findDevice() {
        int minPowerUsage = 10;
        int maxPowerUsage = 80;
        return service.findDevicesByPowerUsage(minPowerUsage, maxPowerUsage);
    }
}
