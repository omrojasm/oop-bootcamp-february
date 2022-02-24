package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingAssistant {

    private final List<ParkingLot> parkingLots;
    private final List<ParkingAssistant> subAssistants = new ArrayList<>();

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public int park(Car car) {
        return parkingLots.stream()
            .filter(this::hasCapacity)
            .findFirst().map(parkingLot -> {
                parkingLot.fillSpot(car);
                return parkingLot.getId();
            }).orElse(-1);
    }

    private boolean hasCapacity(ParkingLot parkingLot) {
        return parkingLot.getAvailabilityPercentage() >= 0.2;
    }

    public void hireAssistant(ParkingAssistant newAssistant) {
        subAssistants.add(newAssistant);
    }
}
