package oop.nato;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NatoTest {
    @Test
    public void itShouldEncodeOneCharacter() {
        assertEquals(Nato.encode("h"), "hotel");
    }

    @Test
    public void itShouldEncodeSeveralCharacter() {
        assertEquals(Nato.encode("hola"), "hotel-oscar-lima-alpha");
    }

    @Test
    public void itShouldEncodeWhiteSpaceAsNull() {
        assertEquals(Nato.encode("h ola"), "hotel-null-oscar-lima-alpha");
    }

    @Test
    public void itShouldDecodeOneWord() {
        assertEquals(Nato.decode("hotel"), "h");
    }
}