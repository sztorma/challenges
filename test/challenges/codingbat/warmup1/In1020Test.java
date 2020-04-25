package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class In1020Test {

    @Test
    public void testIn1020() {
        System.out.println("in1020");
        In1020 instance = new In1020();
        assertEquals(true, instance.in1020(12, 99));
        assertEquals(true, instance.in1020(21, 12));
        assertEquals(false, instance.in1020(8, 99));
        assertEquals(true, instance.in1020(10, 99));
        assertEquals(true, instance.in1020(99, 10));
        assertEquals(false, instance.in1020(9, 99));
        assertEquals(false, instance.in1020(99, 9));
        assertEquals(true, instance.in1020(20, 90));
        assertEquals(true, instance.in1020(90, 20));
        assertEquals(false, instance.in1020(21, 90));
        assertEquals(false, instance.in1020(90, 21));
    }

}
