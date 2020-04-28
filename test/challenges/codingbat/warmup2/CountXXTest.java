package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountXXTest {

    public CountXXTest() {
    }

    @Test
    public void testCountXX() {
        System.out.println("countXX");
        CountXX instance = new CountXX();
        assertEquals(1, instance.countXX("abcxx"));
        assertEquals(2, instance.countXX("xxx"));
        assertEquals(3, instance.countXX("xxxx"));
        assertEquals(0, instance.countXX(""));
        assertEquals(0, instance.countXX("x"));

    }

}
