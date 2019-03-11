package com.model.service;

import com.model.service.commandImpl.CreateApartmentCommand;
import com.model.service.commandImpl.PlugInCommand;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandsTest {

    @Test
    public void getCommand() {
        String servletPath_1 = "/createApartment";
        String servletPath_2 = "/plugIn";
        assertEquals(CreateApartmentCommand.class,
                     Commands.getCommand(servletPath_1).getClass());
        assertEquals(PlugInCommand.class,
                Commands.getCommand(servletPath_2).getClass());
    }
}