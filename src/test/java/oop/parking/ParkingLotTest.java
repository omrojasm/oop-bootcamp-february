package oop.parking;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    public static final double DELTA = 0.01;

    @Test
    public void itShouldReturnOccupationPercentage() {
        var parkingLot = new ParkingLot(1,10,10);
        assertEquals(parkingLot.getAvailabilityPercentage(), 1d, DELTA);
    }

    @Test
    public void itShouldReturnOccupationPercentageForHalfOccupation() {
        var parkingLot = new ParkingLot(1,10,5);
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.5d, DELTA);
    }

    @Test
    public void itShouldDecreaseTheAvailableSpotsInOneUnit() {
        var parkingLot = new ParkingLot(1,10,5);
        parkingLot.fillSpot(new Car());
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.4d, DELTA);
    }

}
