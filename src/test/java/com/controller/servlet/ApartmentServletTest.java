package com.controller.servlet;

import org.junit.Test;
import static org.mockito.Mockito.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApartmentServletTest {
    @Test
    public void ifDispatcherIsReturned() {
        final String jsp = "/WEB-INF/view/apartment.jsp";
        final ApartmentServlet servlet = new ApartmentServlet();

        final HttpServletRequest request = mock(HttpServletRequest.class);
        final RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        when(request.getRequestDispatcher(jsp)).thenReturn(dispatcher);
    }
}