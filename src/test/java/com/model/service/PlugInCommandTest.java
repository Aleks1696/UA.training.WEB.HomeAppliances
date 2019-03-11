package com.model.service;

import com.model.dataBase.Devices;
import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.service.commandImpl.PlugInCommand;
import com.view.Messages;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlugInCommandTest {
    private Apartment apartment;
    private PlugInCommand command;
    private HttpServletRequest request;
    private HttpSession session;

    @Before
    public void initialize() {
        apartment = new Apartment();
        command = new PlugInCommand();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("apartment")).thenReturn(apartment);
    }

    @Test
    public void executePositive() {
        assertEquals(Messages.REFRIGERATOR_PLUG_IN, command.execute(request));
    }

    @Test
    public void executeIsAlreadyPlugged() {
        Device device = Devices.getDevice(Devices.REFRIGERATOR);
        device.setPluggedIn(true);
        apartment.getPluggedDevices().add(device);
        assertEquals(Messages.ALREADY_PLUGGED, command.execute(request));
    }
}