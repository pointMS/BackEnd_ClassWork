package ls20200925_Repeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void testWeekday_Working_NotVacation() {
        boolean weekday = true;
        boolean vacation = false;
        assertFalse(Demo.sleepIn(weekday, vacation));
    }

    @Test
    public void testWeekday_Weekend_Vacation() {
        boolean weekday = false;
        boolean vacation = true;
        assertTrue(Demo.sleepIn(weekday, vacation));
    }

    @Test
    public void testWeekday_Working_Vacation() {
        boolean weekday = true;
        boolean vacation = true;
        assertTrue(Demo.sleepIn(weekday, vacation));
    }

    @Test
    public void testWeekday_Weekend_NotVacation() {
        boolean weekday = false;
        boolean vacation = false;
        assertTrue(Demo.sleepIn(weekday, vacation));
    }
}