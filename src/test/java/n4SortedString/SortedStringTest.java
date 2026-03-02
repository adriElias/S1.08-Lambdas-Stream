package n4SortedString;

import n1StringList.StringList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedStringTest {
    private SortedString sortedString;

    @BeforeEach
    void setUp() {
        sortedString = new SortedString();
    }

    @Test
    void testAscSort() {
        List<String> input = List.of("Java", "Sorted", "Value", "Programming", "Of", "Words", "U");
        List<String> result = sortedString.ascSort(input);

        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i).length() <= result.get(i + 1).length());
        }
    }
}
