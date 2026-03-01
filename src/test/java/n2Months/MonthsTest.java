package n2Months;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MonthsTest {
    private Months months;

    @BeforeEach
    void setUp() {
        months = new Months();
    }

    @Test
    void testMonths() {
        List<String> months = List.of("January",
                                                "February",
                                                "March",
                                                "April",
                                                "May",
                                                "June",
                                                "July",
                                                "August",
                                                "September",
                                                "October",
                                                "November",
                                                "December"
        );

        List<String> aux = new ArrayList<>();

        months.forEach(month -> aux.add(month));

        assertEquals(12, aux.size());
        assertEquals("January", aux.get(0));
        assertEquals("December", aux.get(11));
    }

    @Test
    void testMonthsMethodReference() {
        List<String> months = List.of("January",
                                                "February",
                                                "March",
                                                "April",
                                                "May",
                                                "June",
                                                "July",
                                                "August",
                                                "September",
                                                "October",
                                                "November",
                                                "December"
        );

        List<String> aux = new ArrayList<>();
        months.forEach(aux::add);

        assertEquals(12, aux.size());
        assertEquals("July", aux.get(6));
    }
}
