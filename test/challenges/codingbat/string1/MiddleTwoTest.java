package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MiddleTwoTest {

    public MiddleTwoTest() {
    }

    @Test
    public void testMiddleTwo() {
        System.out.println("middleTwo");
        MiddleTwo instance = new MiddleTwo();
        assertEquals("ri", instance.middleTwo("string"));
        assertEquals("od", instance.middleTwo("code"));
        assertEquals("ct", instance.middleTwo("practice"));
        assertEquals("ba", instance.middleTwo("ba"));
    }

}
