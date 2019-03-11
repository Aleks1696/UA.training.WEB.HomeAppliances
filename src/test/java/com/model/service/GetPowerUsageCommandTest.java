package com.model.service;

import com.model.dataBase.Devices;
import com.model.entity.Apartment;
import com.model.service.commandImpl.GetPowerUsageCommand;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetPowerUsageCommandTest {
    private Apartment apartment;
    private GetPowerUsageCommand command;
    private HttpServletRequest request;
    private HttpSession session;

    @Before
    public void initialize() {
        apartment = new Apartment();
        command = new GetPowerUsageCommand();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("apartment")).thenReturn(apartment);
    }

    @Test
    public void execute() {
        apartment.getPluggedDevices().add(Devices.getDevice(Devices.SMARTPHONE));
        apartment.getPluggedDevices().add(Devices.getDevice(Devices.REFRIGERATOR));
        assertEquals("330", command.execute(request));
    }
}