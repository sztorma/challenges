package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleXTest {

    public DoubleXTest() {
    }

    @Test
    public void testDoubleX() {
        System.out.println("doubleX");
        DoubleX instance = new DoubleX();
        assertEquals(true, instance.doubleX("axxbb"));
        assertEquals(false, instance.doubleX("axaxax"));
        assertEquals(true, instance.doubleX("xxxxx"));
        assertEquals(false, instance.doubleX(""));
        assertEquals(false, instance.doubleX("x"));
        assertEquals(true, instance.doubleX("abcxx"));
        assertEquals(true, instance.doubleX("xxaaa"));
        assertEquals(false, instance.doubleX("xaaaxxx"));
    }

}
