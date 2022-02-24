package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int id;
    private final int totalCapacity;
    private int freeSpots;

    private final List<ParkingLotObserver> observers;

    public ParkingLot(int id,
                      int totalCapacity,
                      int freeSpots) {
        this.id = id;
        this.totalCapacity = totalCapacity;
        this.freeSpots = freeSpots;
        this.observers = new ArrayList<>();
    }

    public double getAvailabilityPercentage() {
        return (double) freeSpots / totalCapacity;
    }

    public void fillSpot(Car car) {
        car.park();
        freeSpots -= 1;
        if(getAvailabilityPercentage() < 0.25) {
            observers.forEach(parkingLotObserver -> parkingLotObserver.update(id));
        }
    }

    public int getId() {
        return id;
    }

    public void addObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }
}
