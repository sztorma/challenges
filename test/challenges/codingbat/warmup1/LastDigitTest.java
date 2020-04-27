package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LastDigitTest {

    @Test
    public void testLastDigit() {
        System.out.println("lastDigit");
        LastDigit instance = new LastDigit();
        assertEquals(true, instance.lastDigit(7, 17));
        assertEquals(false, instance.lastDigit(6, 17));
        assertEquals(true, instance.lastDigit(3, 113));
        assertEquals(true, instance.lastDigit(223, 113));
    }

}
