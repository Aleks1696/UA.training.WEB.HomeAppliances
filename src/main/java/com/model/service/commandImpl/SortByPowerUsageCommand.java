package com.model.service.commandImpl;

import com.model.entity.Apartment;
import com.model.service.Command;
import com.view.Messages;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

public class SortByPowerUsageCommand implements Command {
    private Apartment apartment;
    public String execute(HttpServletRequest request) {
        getSessionAttributes(request);
        Collections.sort(
                apartment.getAllDevicesList(),
                (d1, d2) -> Integer.valueOf(d2.getPowerUsagePerHour())
                        .compareTo((d1.getPowerUsagePerHour()))
        );
        return Messages.SORT_BY_POWER;
    }

    private void getSessionAttributes(HttpServletRequest request) {
        apartment = (Apartment) request.getSession().getAttribute("apartment");
    }
}
