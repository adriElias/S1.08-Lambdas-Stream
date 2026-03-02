package n6Reversed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversedTest {
    @Test
    void testReverse() {
        Reversed reversed = s -> new StringBuilder(s).reverse().toString();

        assertEquals("olleH", reversed.reverse("Hello"));
        assertEquals("dlroW olleH", reversed.reverse("Hello World"));
        assertEquals("", reversed.reverse(""));
        assertEquals("a", reversed.reverse("a"));
    }
}
