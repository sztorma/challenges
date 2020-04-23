package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Or35Test {

    @Test
    public void testOr35() {
        System.out.println("or35");
        Or35 instance = new Or35();
        assertEquals(true, instance.or35(3));
        assertEquals(true, instance.or35(10));
        assertEquals(false, instance.or35(8));
        assertEquals(true, instance.or35(0));
        assertEquals(true, instance.or35(-6));
        assertEquals(true, instance.or35(-3));
        assertEquals(false, instance.or35(-7));
    }

}
