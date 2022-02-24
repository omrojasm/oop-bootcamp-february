package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ParkingOwnerTest {

    private final Car car = Mockito.mock(Car.class);

    @Test
    public void itShouldBeNotifiedWhenParkingLotReachesCapacityThreshold() {
        final var parkingOwner = Mockito.spy(new ParkingOwner());
        final var parkingLot = new ParkingLot(1, 5, 2);

        parkingLot.addObserver(parkingOwner);
        parkingLot.fillSpot(car);

        verify(parkingOwner).buyMoreLand();
    }

    @Test
    public void itShouldBeNoBeNotifiedWhenParkingLotHasNotReachedCapacityThreshold() {
        final var parkingOwner = Mockito.spy(new ParkingOwner());
        final var parkingLot = new ParkingLot(1, 5, 5);

        parkingLot.addObserver(parkingOwner);
        parkingLot.fillSpot(car);

        verify(parkingOwner, times(0)).buyMoreLand();
    }

}