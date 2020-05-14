package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Less20Test {

    public Less20Test() {
    }

    @Test
    public void testLess20() {
        System.out.println("less20");
        Less20 instance = new Less20();
        assertEquals(true, instance.less20(18));
        assertEquals(true, instance.less20(19));
        assertEquals(false, instance.less20(20));
        assertEquals(false, instance.less20(21));
    }

}
