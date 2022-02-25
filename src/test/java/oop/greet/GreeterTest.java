package oop.greet;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.*;

import static org.testng.Assert.assertEquals;

public class GreeterTest {

    static final String BASE_TIME = "2022-02-25T08:00:00.00Z";
    Clock clock = Clock.fixed(Instant.parse(BASE_TIME), ZoneOffset.UTC);
    Greeter greeter;

    @BeforeMethod
    public void setUp() {
        greeter = new Greeter(clock);
    }

    @Test
    public void itShouldGreetWithTheName() {
        assertEquals(greeter.greet("Oscar"), "Good morning Oscar");
    }

    @Test
    public void itShouldTrimTheName() {
        assertEquals(greeter.greet(" Oscar "), "Good morning Oscar");
    }

    @Test
    public void itShouldCapitalizeFirstLetterOfTheName() {
        assertEquals(greeter.greet("oscar"), "Good morning Oscar");
    }

    @Test
    public void itShouldGreetGoodMorning() {
        assertEquals(greeter.greet("Vicky"), "Good morning Vicky");
    }
}
