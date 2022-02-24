package oop.greet;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void itShouldGreetWithTheName() {
        assertEquals(Greeter.greet("Oscar"), "Hello Oscar");
    }


    @Test
    public void itShouldTrimTheName() {
        assertEquals(Greeter.greet(" Oscar "), "Hello Oscar");
    }

    @Test
    public void itShouldCapitalizeFirstLetterOfTheName() {
        assertEquals(Greeter.greet("oscar"), "Hello Oscar");
    }
}
