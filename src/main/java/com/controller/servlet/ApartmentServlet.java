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
        String requestedURI = req.getServletPath();
        Controller controller = (Controller)req.getSession().getAttribute("controller");
        switch (requestedURI) {
            case "/createApartment": {
                controller = new Controller();
                req.getSession().setAttribute("controller", controller);
                controller.createApartment();
                req.getSession().setAttribute("devices", controller.getDevicesList());
                break;
            }
            case "/plugIn": {
                req.setAttribute("response", controller.plugInDevice());
                break;
            }
            case "/plugOff": {
                req.setAttribute("response", controller.plugOffDevice());
                break;
            }
            case "/getPowerUsage": {
                req.setAttribute("response", controller.getPowerUsage());
                break;
            }
            case "/sortByPowerUsage": {
                controller.sortByPowerUsage();
                break;
            }
            case "/findDevice": {
                req.setAttribute("response", controller.findDevice());
                break;
            }
        }
        req.getRequestDispatcher(jsp).forward(req, resp);
    }
}
