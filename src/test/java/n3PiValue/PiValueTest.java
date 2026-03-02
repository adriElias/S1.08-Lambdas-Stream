package n3PiValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PiValueTest {
    @Test
    void testGetPiValue() {
        PiValue pi = () -> 3.1415;
        assertEquals(3.1415, pi.getPiValue(), 0.0001);
    }
}
