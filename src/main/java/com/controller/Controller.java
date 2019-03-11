package com.controller;

import com.model.service.Command;
import com.model.service.Commands;
import com.view.View;

import javax.servlet.http.HttpServletRequest;
import java.util.MissingResourceException;

public class Controller {
    private static Controller controller;

    private Controller() {
    }

    public static Controller getInstance() {
        if (controller == null) {
            synchronized (Controller.class) {
                if (controller == null) {
                    controller = new Controller();
                }
            }
        }
        return controller;
    }

    public String process(HttpServletRequest request) {
        String servletPath = request.getServletPath();
        Command command = Commands.getCommand(servletPath);
        String commandResponse = command.execute(request);
        return wrapCommandResponseWithBundle(commandResponse);
    }

    private String wrapCommandResponseWithBundle(String commandResponse) {
        String message;
        try {
            message = View.bundle.getString(commandResponse);
        } catch (MissingResourceException ex) {
            return commandResponse;
        }
        return message;
    }
}
