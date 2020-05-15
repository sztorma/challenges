package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class BlueTicketTest {

    public BlueTicketTest() {
    }

    @Test
    public void testBlueTicket() {
        System.out.println("blueTicket");
        BlueTicket instance = new BlueTicket();
        assertEquals(10, instance.blueTicket(9, 1, 0));
        assertEquals(0, instance.blueTicket(9, 2, 0));
        assertEquals(10, instance.blueTicket(6, 1, 4));
        assertEquals(10, instance.blueTicket(9, 6, 4));
        assertEquals(10, instance.blueTicket(10, 90, 0));
        assertEquals(5, instance.blueTicket(46, 4, 36));
        assertEquals(5, instance.blueTicket(4, 46, 36));
        assertEquals(5, instance.blueTicket(85, 5, 75));
        assertEquals(5, instance.blueTicket(5, 85, 75));

    }

}
