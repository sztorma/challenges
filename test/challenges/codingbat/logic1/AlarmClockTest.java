package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlarmClockTest {

    public AlarmClockTest() {
    }

    @Test
    public void testAlarmClock() {
        System.out.println("alarmClock");
        AlarmClock instance = new AlarmClock();
        assertEquals("7:00", instance.alarmClock(1, false));
        assertEquals("7:00", instance.alarmClock(5, false));
        assertEquals("10:00", instance.alarmClock(0, false));
        assertEquals("10:00", instance.alarmClock(1, true));
        assertEquals("10:00", instance.alarmClock(5, true));
        assertEquals("10:00", instance.alarmClock(6, false));
        assertEquals("off", instance.alarmClock(6, true));
        assertEquals("off", instance.alarmClock(0, true));

    }

}
