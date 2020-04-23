package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackAroundTest {

    @Test
    public void testBackAround() {
        System.out.println("backAround");
        BackAround instance = new BackAround();
        assertEquals("tcatt", instance.backAround("cat"));
        assertEquals("oHelloo", instance.backAround("Hello"));
        assertEquals("aaa", instance.backAround("a"));
    }

}
