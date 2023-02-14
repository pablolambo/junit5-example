package com.example.testjunitexample.model;

import java.util.Locale;

public class VehicleCreator {
    private String name;

    public String CreateVehicle (String name) {
        name = name.toLowerCase(Locale.ENGLISH);
        return name;
    }
}
