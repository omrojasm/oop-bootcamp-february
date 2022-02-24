package oop.parking;

public class ParkingOwner implements ParkingLotObserver {
    public void buyMoreLand() {
    }

    @Override
    public void update(int parkingLotId) {
        System.out.printf("Parking lot %d has reached capacity threshold. Buy more land%n", parkingLotId);
        buyMoreLand();
    }
}
