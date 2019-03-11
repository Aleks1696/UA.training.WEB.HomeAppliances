package com.model.service;

import com.model.dataBase.Devices;
import com.model.entity.Apartment;
import com.model.service.commandImpl.FindDeviceByPowerUsageCommand;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindDeviceByPowerUsageCommandTest {
    private FindDeviceByPowerUsageCommand command;
    private HttpServletRequest request;
    private HttpSession session;

    @Before
    public void initialize() {
        command = new FindDeviceByPowerUsageCommand();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("apartment")).thenReturn(new Apartment());
    }

    @Test
    public void executePositive() {
        when(request.getParameter("minPowerUsage")).thenReturn("10");
        when(request.getParameter("maxPowerUsage")).thenReturn("200");

        assertEquals(getExpectedDevices(), command.execute(request));
    }

    private String getExpectedDevices() {
        List<String> expectedDevices = new ArrayList<>();
        expectedDevices.add(Devices.getDevice(Devices.SMARTPHONE).getClass().getSimpleName());
        expectedDevices.add(Devices.getDevice(Devices.DIGITALWATCH).getClass().getSimpleName());
        expectedDevices.add(Devices.getDevice(Devices.TV).getClass().getSimpleName());
        return expectedDevices.toString();
    }
}