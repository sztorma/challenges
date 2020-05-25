package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class XyBalanceTest {

    public XyBalanceTest() {
    }

    @Test
    public void testXyBalance() {
        System.out.println("xyBalance");
        XyBalance instance = new XyBalance();
        assertEquals(true, instance.xyBalance("aaxbby"));
        assertEquals(false, instance.xyBalance("aaxbb"));
        assertEquals(false, instance.xyBalance("yaaxbb"));
        assertEquals(true, instance.xyBalance("aaxxxxxxxxxxxxxxxbby"));
        assertEquals(true, instance.xyBalance("aaxxxxxxxxxxxxyxxxbby"));
        assertEquals(false, instance.xyBalance("xaxxbbyx"));
        assertEquals(true, instance.xyBalance("bbb"));
        assertEquals(false, instance.xyBalance("x"));
    }

}
