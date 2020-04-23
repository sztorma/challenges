
package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PosNegTest {

    @Test
    public void testPosNeg() {
        System.out.println("posNeg");
        PosNeg instance = new PosNeg();
        assertEquals(true, instance.posNeg(1, -1, false));
        assertEquals(true, instance.posNeg(-1, 1, false));
        assertEquals(true, instance.posNeg(-4, -5, true));
        assertEquals(true, instance.posNeg(1, -1, false));
        assertEquals(false, instance.posNeg(-4, -5, false));
        assertEquals(false, instance.posNeg(-1, -1, false));
        assertEquals(false, instance.posNeg(-5, -6, false));
        assertEquals(false, instance.posNeg(-2, -1, false));
    }
    
}
