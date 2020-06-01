import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    public void testLeapYear() {

        @Test
        LeapYear year = new LeapYear();

        assertEquals(year.isLeapYear(1996));
        assertEquals(year.isLeapYear(2001));
        assertEquals(year.isLeapYear(2000));
        assertEquals(year.isLeapYear(1900));

    }

}