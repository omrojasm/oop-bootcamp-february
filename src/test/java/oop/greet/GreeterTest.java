package oop.greet;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void itShouldGreetWithTheInputName() {
        assertEquals(Greeter.greet("Oscar"), "Hello Oscar");
    }
}
