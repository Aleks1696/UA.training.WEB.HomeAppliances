package com.model.entity;

/**
 * Specifies Device behaviour. If additional functionality
 * is added to this interface then each device should implement it.
 *
 * @see Device
 * */
public interface DeviceUsage {
    /**
     * Returns device's power usage.
     *
     * @return power usage of device
     * */
    Integer getDevicePowerUsage();
}
