
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void testLeapYear() {

        LeapYear year = new LeapYear();

        assertEquals(true, year.isLeapYear(1996));
        assertEquals(false, year.isLeapYear(2001));
        assertEquals(true, year.isLeapYear(2000));
        assertEquals(false, year.isLeapYear(1900));

    }

}