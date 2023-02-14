package com.example.testjunitexample;

import com.example.testjunitexample.model.VehicleCreator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {
    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    public void testCheckIfNameOfCarIsCorrect(TestInfo testInfo){
        VehicleCreator vehicleCreator = new VehicleCreator();
        assertEquals("car", vehicleCreator.CreateVehicle("Car"), "Car should be car");
        assertEquals("My 1st JUnit 5 test! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
    }
}
