package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringETest {

    @Test
    public void testStringE() {
        System.out.println("stringE");
        StringE instance = new StringE();
        assertEquals(true, instance.stringE("Hello"));
        assertEquals(true, instance.stringE("Heelle"));
        assertEquals(false, instance.stringE("Heelele"));
        assertEquals(false, instance.stringE("hlo"));

    }

}
