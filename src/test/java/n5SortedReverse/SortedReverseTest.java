package n5SortedReverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SortedReverseTest {
    private SortedReverse sortedReverse;

    @BeforeEach
    void setUp() {
        sortedReverse = new SortedReverse();
    }

    @Test
    void testDescSort() {
        List<String> input = List.of("Java", "Sorted", "Value", "Programming", "Of", "Words", "U");
        List<String> result = sortedReverse.descSort(input);

        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i).length() >= result.get(i + 1).length());
        }
    }
}
