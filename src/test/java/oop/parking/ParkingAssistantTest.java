package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

public class ParkingAssistantTest {

    private Car myCar;


    @BeforeMethod
    public void setUp() {
        myCar = Mockito.mock(Car.class);
    }

    @Test
    public void itShouldParkACarInAParkingLotWhenOcupationIsLessThan80Percent() {

        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1, 10, 5));
        var assistant = new ParkingAssistant(parkingLots);

        assistant.park(myCar);
        verify(myCar).park();

    }

    @Test
    public void itShouldNotParkACarParkingIsMoreThan80PercentFull() {
        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1, 10, 1));

        var assistant = new ParkingAssistant(parkingLots);

        assistant.park(myCar);

        verify(myCar, times(0)).park();
    }

    @Test
    public void itShouldParkACarInTheSecondAParkingLot() {

        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1,
                6,
                1),
            new ParkingLot(2,
                10,
                10));
        var assistant = new ParkingAssistant(parkingLots);

        final var parkingLotId = assistant.park(myCar);

        assertEquals(parkingLotId, 2);
        verify(myCar).park();

    }

    @Test
    public void itShouldBeAbleToHireAnotherAssistant() {
        var parkingLot1 = new ParkingLot(1, 10, 0);
        var parkingLot2 = new ParkingLot(2, 10, 10);

        var parkingLots = List.of(parkingLot1, parkingLot2);

        var parkingAssistant = new ParkingAssistant(parkingLots);

        var newAssistant = Mockito.spy(new ParkingAssistant(List.of(parkingLot2)));

        parkingAssistant.hireAssistant(newAssistant);

        var car = new Car();

        parkingAssistant.park(car);

        verify(newAssistant).park(eq(car));

    }
}
