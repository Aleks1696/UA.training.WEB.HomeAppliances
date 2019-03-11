package com.model.service.commandImpl;

import com.model.dataBase.Devices;
import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.service.Command;
import com.view.Messages;

import javax.servlet.http.HttpServletRequest;

public class PlugInCommand implements Command {
    private Device device;
    private Apartment apartment;

    public String execute(HttpServletRequest request) {
        getSessionAttributes(request);
        if (!device.isPluggedIn()) {
            device.setPluggedIn(true);
            apartment.getPluggedDevices().add(device);
            return device.getDeviceReactionOnPlugIn();
        } else {
            return Messages.ALREADY_PLUGGED;
        }
    }

    private void getSessionAttributes(HttpServletRequest request) {
        apartment = (Apartment) request.getSession().getAttribute("apartment");

        //TODO (device should be chosen by client and passed as a request
        // attribute. Now hardcoding device
        device = Devices.getDevice(Devices.REFRIGERATOR);
    }
}
