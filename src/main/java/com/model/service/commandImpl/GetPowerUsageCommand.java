package com.model.service.commandImpl;

import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.service.Command;

import javax.servlet.http.HttpServletRequest;

public class GetPowerUsageCommand implements Command {
    private Apartment apartment;

    public String execute(HttpServletRequest request) {
        getSessionAttributes(request);
        int result = 0;
        result = apartment.getPluggedDevices()
                .stream()
                .map(Device::getPowerUsagePerHour)
                .mapToInt(Integer::intValue)
                .sum();
        return String.valueOf(result);
    }

    private void getSessionAttributes(HttpServletRequest request) {
        apartment = (Apartment) request.getSession().getAttribute("apartment");
    }
}
