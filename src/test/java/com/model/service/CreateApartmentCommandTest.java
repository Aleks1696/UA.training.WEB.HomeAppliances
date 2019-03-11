package com.model.service;

import com.model.service.commandImpl.CreateApartmentCommand;
import com.view.Messages;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.Assert.*;

public class CreateApartmentCommandTest {
    CreateApartmentCommand command;
    HttpServletRequest request;
    HttpSession session;

    @Before
    public void initialize() {
        command = new CreateApartmentCommand();
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
    }

    @Test
    public void executeReturnMessage() {
        CreateApartmentCommand command = new CreateApartmentCommand();
        assertEquals(Messages.APARTMENT_IS_CREATED, command.execute(request));
    }

    //TODO
    // attributes written to session can be tested
}