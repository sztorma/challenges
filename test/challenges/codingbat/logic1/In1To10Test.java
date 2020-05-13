package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class In1To10Test {

    public In1To10Test() {
    }

    @Test
    public void testIn1To10() {
        System.out.println("in1To10");
        In1To10 instance = new In1To10();
        assertEquals(true, instance.in1To10(5, false));
        assertEquals(false, instance.in1To10(11, false));
        assertEquals(true, instance.in1To10(11, true));

        assertEquals(false, instance.in1To10(0, false));
        assertEquals(true, instance.in1To10(1, false));
        assertEquals(true, instance.in1To10(10, false));
        assertEquals(false, instance.in1To10(11, false));

        assertEquals(true, instance.in1To10(0, true));
        assertEquals(true, instance.in1To10(1, true));
        assertEquals(true, instance.in1To10(10, true));
        assertEquals(true, instance.in1To10(11, true));
        assertEquals(false, instance.in1To10(9, true));
    }

}
