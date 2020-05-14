package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class More20Test {

    public More20Test() {
    }

    @Test
    public void testMore20() {
        System.out.println("more20");
        More20 instance = new More20();
        assertEquals(false, instance.more20(20));
        assertEquals(true, instance.more20(21));
        assertEquals(true, instance.more20(22));
        assertEquals(false, instance.more20(19));
    }

}
