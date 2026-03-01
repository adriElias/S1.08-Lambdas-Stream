package org.lambdasStreams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringListTest {

    private StringList stringList;

    @BeforeEach
    void setUp() {
        stringList = new StringList(); // ← esto es lo que falta
    }

    @Test
    void testContainO() {
        List<String> input = List.of("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<String> result = stringList.containO(input);
        assertEquals(List.of("Monday"), result);
    }

    @Test
    void testContainOAnd6letters() {
        List<String> input = List.of("Alejandro", "Fernando", "Omar", "Camila", "Oscar" );
        List<String> result = stringList.containOAnd6letters(input);
        assertEquals(List.of("Alejandro", "Fernando"), result);
    }

}
