package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParrotTroubleTest {

    @Test
    public void testParrotTrouble() {
        System.out.println("parrotTrouble");
        ParrotTrouble instance = new ParrotTrouble();
        assertEquals(true, instance.parrotTrouble(true, 6));
        assertEquals(false, instance.parrotTrouble(true, 7));
        assertEquals(false, instance.parrotTrouble(true, 20));
        assertEquals(false, instance.parrotTrouble(false, 6));
    }

}
