package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LastDigitTest {

    public LastDigitTest() {
    }

    @Test
    public void testSomeMethod() {
        System.out.println("lastDigit");
        LastDigit instance = new LastDigit();
        assertEquals(true, instance.lastDigit(23, 19, 13));
        assertEquals(false, instance.lastDigit(23, 19, 12));
        assertEquals(true, instance.lastDigit(23, 19, 3));
        assertEquals(true, instance.lastDigit(23, 13, 3));
        assertEquals(true, instance.lastDigit(0, 0, 0));
    }

}
