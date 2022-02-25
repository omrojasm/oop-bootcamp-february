package oop.greet;

import org.testng.annotations.Test;

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
}
