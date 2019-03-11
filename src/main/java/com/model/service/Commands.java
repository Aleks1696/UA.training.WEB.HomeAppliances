package com.model.service;

import com.model.service.commandImpl.*;

import java.util.Arrays;

public enum  Commands {
    CREATE_APARTMENT("/createApartment", new CreateApartmentCommand()),
    FIND_DEVICE_BY_POWER_USAGE("/findDevice", new FindDeviceByPowerUsageCommand()),
    GET_POWER_USAGE("/getPowerUsage", new GetPowerUsageCommand()),
    PLUG_IN("/plugIn", new PlugInCommand()),
    PLUG_OFF("/plugOff", new PlugOffCommand()),
    SORT_BY_POWER_USAGE("/sortByPowerUsage", new SortByPowerUsageCommand());

    private String requestPath;
    private Command command;

    Commands(String requestPath, Command command) {
        this.requestPath = requestPath;
        this.command = command;
    }

    public static Command getCommand(String requestPath) {
        return Arrays.stream(Commands.values())
                .filter(commands -> commands.requestPath.equals(requestPath))
                .findFirst()
                .get().command;
    }
}
