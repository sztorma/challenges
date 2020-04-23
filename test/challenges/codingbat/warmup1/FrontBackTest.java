package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FrontBackTest {

    @Test
    public void testFrontBack() {
        System.out.println("frontBack");
        FrontBack instance = new FrontBack();
        assertEquals("eodc", instance.frontBack("code"));
        assertEquals("a", instance.frontBack("a"));
        assertEquals("ab", instance.frontBack("ba"));
        assertEquals("", instance.frontBack(""));
    }

}
