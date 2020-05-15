package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class RedTicketTest {

    public RedTicketTest() {
    }

    @Test
    public void testRedTicket() {
        System.out.println("redTicket");
        RedTicket instance = new RedTicket();
        assertEquals(10, instance.redTicket(2, 2, 2));
        assertEquals(0, instance.redTicket(2, 2, 1));
        assertEquals(5, instance.redTicket(0, 0, 0));
        assertEquals(5, instance.redTicket(1, 1, 1));
        assertEquals(0, instance.redTicket(2, 1, 2));
        assertEquals(1, instance.redTicket(2, 1, 3));
    }

}
