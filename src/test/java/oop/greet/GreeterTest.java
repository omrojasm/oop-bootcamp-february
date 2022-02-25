package oop.greet;

import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.assertEquals;

public class GreeterTest {


    @Test
    public void itShouldGreetWithTheName() {
        var greeter = new Greeter();
        assertEquals(greeter.greet("Oscar"), "Hello Oscar");
    }


    @Test
    public void itShouldTrimTheName() {
        var greeter = new Greeter();
        assertEquals(greeter.greet(" Oscar "), "Hello Oscar");
    }

    @Test
    public void itShouldCapitalizeFirstLetterOfTheName() {
        var greeter = new Greeter();
        assertEquals(greeter.greet("oscar"), "Hello Oscar");
    }

    @Test
    public void itShouldGreetGoodMorningWithName() {
        var greeter = new Greeter(LocalTime.of(7,0));
        assertEquals(greeter.greet("Oscar"), "Good morning Oscar");
    }

    @Test
    public void itShouldGreetGoodEveningWithName() {
        var greeter = new Greeter(LocalTime.of(19,0));
        assertEquals(greeter.greet("Oscar"), "Good evening Oscar");
    }
}
