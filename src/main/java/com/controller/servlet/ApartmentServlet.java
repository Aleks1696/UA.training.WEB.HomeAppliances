package com.controller.servlet;

import com.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApartmentServlet extends HttpServlet {
    private final String jsp = "/WEB-INF/view/apartment.jsp";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("response", Controller.getInstance().process(req));
        req.getRequestDispatcher(jsp).forward(req, resp);
    }
}
