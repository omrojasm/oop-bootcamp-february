package oop.parkinglot;

public class Car {
    private boolean parked;

    public boolean isParked() {
        return parked;
    }

    public void park(ParkingLot parkingLot) {
        parked = true;
        parkingLot.addParkedVehicle();
    }
}