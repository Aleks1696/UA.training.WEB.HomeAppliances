package com.model.service;

import com.model.entity.Apartment;
import com.model.service.commandImpl.SortByPowerUsageCommand;
import com.view.Messages;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SortByPowerUsageCommandTest {
    private Apartment apartment;
    private SortByPowerUsageCommand command;
    private HttpServletRequest request;
    private HttpSession session;

    @Before
    public void initialize() {
        apartment = new Apartment();
        command = new SortByPowerUsageCommand();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("apartment")).thenReturn(apartment);
    }

    @Test
    public void execute() {
        assertEquals(Messages.SORT_BY_POWER, command.execute(request));
    }
}