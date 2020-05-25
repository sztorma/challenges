package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountCodeTest {

    public CountCodeTest() {
    }

    @Test
    public void testCountCode() {
        System.out.println("countCode");
        CountCode instance = new CountCode();
        assertEquals(1, instance.countCode("aaacodebbb"));
        assertEquals(2, instance.countCode("codexxcode"));
        assertEquals(2, instance.countCode("cozexxcope"));
        assertEquals(0, instance.countCode("co"));
        assertEquals(0, instance.countCode("c"));
        assertEquals(0, instance.countCode(""));
        assertEquals(0, instance.countCode(null));
    }

}
