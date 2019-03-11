package com.model.service.commandImpl;

import com.model.entity.Apartment;
import com.model.service.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FindDeviceByPowerUsageCommand implements Command {
    private Apartment apartment;
    private int minPowerUsage;
    private int maxPowerUsage;

    public String execute(HttpServletRequest request) {
        getSessionAttributes(request);
        List devices = new ArrayList();
        apartment.getAllDevicesList()
                .stream()
                .filter(device -> device.getPowerUsagePerHour() >= minPowerUsage
                        && device.getPowerUsagePerHour() <= maxPowerUsage)
                .forEach(device -> devices.add(device.getClass().getSimpleName()));
        return devices.toString();
    }

    private void getSessionAttributes(HttpServletRequest request) {
        apartment = (Apartment) request.getSession().getAttribute("apartment");
        minPowerUsage = Integer.valueOf(request.getParameter("minPowerUsage"));
        maxPowerUsage = Integer.valueOf(request.getParameter("maxPowerUsage"));
    }
}
