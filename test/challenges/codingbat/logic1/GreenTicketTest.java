package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreenTicketTest {

    public GreenTicketTest() {
    }

    @Test
    public void testGreenTicket() {
        System.out.println("greenTicket");
        GreenTicket instance = new GreenTicket();
        assertEquals(0, instance.greenTicket(1, 2, 3));
        assertEquals(20, instance.greenTicket(2, 2, 2));
        assertEquals(10, instance.greenTicket(1, 1, 2));
        assertEquals(10, instance.greenTicket(2, 1, 1));
    }

}
