package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    @Test
    public void testMonkeyTrouble() {
        System.out.println("monkeyTrouble");
        MonkeyTrouble instance = new MonkeyTrouble();
        assertEquals(true, instance.monkeyTrouble(true, true));
        assertEquals(true, instance.monkeyTrouble(false, false));
        assertEquals(false, instance.monkeyTrouble(true, false));
        assertEquals(false, instance.monkeyTrouble(false, true));
    }

}
