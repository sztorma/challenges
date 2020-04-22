package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Diff21Test {

    @Test
    public void testDiff21() {
        System.out.println("diff21");
        Diff21 instance = new Diff21();

        assertEquals(2, instance.diff21(19));
        assertEquals(11, instance.diff21(10));
        assertEquals(0, instance.diff21(21));
        assertEquals(2, instance.diff21(22));

    }

}
