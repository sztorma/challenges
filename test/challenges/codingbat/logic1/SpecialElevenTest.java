package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialElevenTest {

    public SpecialElevenTest() {
    }

    @Test
    public void testSpecialEleven() {
        System.out.println("specialEleven");
        SpecialEleven instance = new SpecialEleven();
        assertEquals(true, instance.specialEleven(22));
        assertEquals(true, instance.specialEleven(23));
        assertEquals(false, instance.specialEleven(24));
        assertEquals(true, instance.specialEleven(0));
        assertEquals(true, instance.specialEleven(1));
        assertEquals(false, instance.specialEleven(21));
    }

}
