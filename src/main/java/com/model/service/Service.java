package com.model.service;

import com.model.entity.Apartment;
import com.model.entity.Device;
import com.model.entity.Socket;
import java.util.List;

/**
 * Service class for processing operations related to electric devices
 *
 * @see Apartment
 * @see com.model.entity.DashBoard
 * @see Device
 * @see Socket
 */

public interface Service {
    /**
     * Creates an Apartment instance.
     *
     * @return created Apartment instance is returned
     * @see Apartment
     */
    Apartment createApartment();

    /**
     * Returns list consisting of Devices that are presented in an Apartment
     *
     * @return list of Devices
     * @see Device
     */
    List<Device> getDeviceList();

    /**
     * Returns list consisting of Sockets that are connected to Dashboard.
     * Dashboard is a part of Apartment in turn.
     *
     * @return list of Sockets
     * @see Socket
     * @see com.model.entity.DashBoard
     */
    List<Socket> getSocketList();

    /**
     * If device is already plugged into the Socket then corresponding message
     * is returned. Otherwise device will be plugged(added to Socket list) into
     * the socket. If passed as a parameter socket has no free sockets for device
     * specific message will be returned back.
     *
     * @param socket socket to plug device to
     * @param device device to plug
     * @return device reaction(message) to plugging it to Socket
     */
    String plugInDevice(Socket socket, Device device);

    /**
     * Plugs off device if it had been plugged in.
     *
     * @param device device to plug off from socket
     * @return device reaction(message) to plugging off
     */
    String plugOffDevice(Device device);

    /**
     * Returns power usage of all plugged devices in apartment.
     *
     * @return power usage of plugged devices
     */
    String getPowerUsage();

    /**
     * Sorts all devices in apartment by its power usage
     */
    void sortByPowerUsage();

    /**
     * Looks through all devices in an apartment and if device's
     * power usage matches lower and upper limit then device is
     * added to list
     *
     * @return list of devices that matches min and max limit
     */
    List<String> findDevicesByPowerUsage(int min, int max);
}
