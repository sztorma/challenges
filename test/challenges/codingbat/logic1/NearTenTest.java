package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NearTenTest {

    public NearTenTest() {
    }

    @Test
    public void testNearTen() {
        System.out.println("nearTen");
        NearTen instance = new NearTen();
        assertEquals(true, instance.nearTen(12));
        assertEquals(false, instance.nearTen(17));
        assertEquals(true, instance.nearTen(19));
        assertEquals(true, instance.nearTen(20));
        assertEquals(true, instance.nearTen(21));
        assertEquals(true, instance.nearTen(22));
        assertEquals(true, instance.nearTen(18));
    }

}
