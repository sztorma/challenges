package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NTwiceTest {

    public NTwiceTest() {
    }

    @Test
    public void testNTwice() {
        System.out.println("nTwice");
        NTwice instance = new NTwice();
        assertEquals("Helo", instance.nTwice("Hello", 2));
        assertEquals("Choate", instance.nTwice("Chocolate", 3));
        assertEquals("Ce", instance.nTwice("Chocolate", 1));
    }

}
