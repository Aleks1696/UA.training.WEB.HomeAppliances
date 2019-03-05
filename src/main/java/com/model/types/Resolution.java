package com.model.types;

public enum Resolution {
    VGA("640×480"), FULL_HD("1920×1080"), XGA("1024×768"),
    WQXGA("2560×1440"), QUAD_HD("4096×2160");

    private String resolution;

    Resolution(String resolution) {
        this.resolution = resolution;
    }
}
