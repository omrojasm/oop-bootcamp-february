package oop.nato;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NatoTest {
    @Test
    public void itShouldEncodeHello() {
        assertEquals(Nato.encode("hello"), "hotel-echo-lima-lima-oscar");
    }
    @Test
    public void itShouldDecodeToHello() {
        assertEquals(Nato.decode("hotel-echo-lima-lima-oscar"), "hello");
    }
    @Test
    public void itShouldParseWhiteSpaceAsNull() {
        assertEquals(Nato.encode("Buenos dias"), "bravo-uniform-echo-november-oscar-sierra-null-delta-india-alpha-sierra");
    }
}