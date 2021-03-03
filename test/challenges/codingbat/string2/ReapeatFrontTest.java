package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReapeatFrontTest {

    public ReapeatFrontTest() {
    }

    @Test
    public void testRepeatFront() {
        System.out.println("repeatFront");
        ReapeatFront instance = new ReapeatFront();
        assertEquals("ChocChoChC", instance.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", instance.repeatFront("Chocolate", 3));
        assertEquals("IcI", instance.repeatFront("Ice Cream", 2));
        assertEquals("", instance.repeatFront("x", 0));
        assertEquals("x", instance.repeatFront("x", 1));
        assertEquals("", instance.repeatFront("", 0));

    }

}
