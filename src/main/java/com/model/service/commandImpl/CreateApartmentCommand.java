package com.model.service.commandImpl;

import com.model.entity.Apartment;
import com.model.service.Command;
import com.view.Messages;

import javax.servlet.http.HttpServletRequest;

public class CreateApartmentCommand implements Command {
    private Apartment apartment;

    public String execute(HttpServletRequest request) {
        apartment = new Apartment();
        setApartmentAttributesToSession(request);
        return Messages.APARTMENT_IS_CREATED;
    }

    private void setApartmentAttributesToSession(HttpServletRequest request) {
        request.getSession().setAttribute("apartment", apartment);
        request.getSession().setAttribute("devices", apartment.getAllDevicesList());
    }
}
