package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinCatTest {

    public MinCatTest() {
    }

    @Test
    public void testMinCat() {
        System.out.println("minCat");
        MinCat instance = new MinCat();
        assertEquals("loHi", instance.minCat("Hello", "Hi"));
        assertEquals("ellojava", instance.minCat("Hello", "java"));
        assertEquals("javaello", instance.minCat("java", "Hello"));
        assertEquals("", instance.minCat("", "Hello"));
        assertEquals("ag", instance.minCat("a", "asdfg"));
        assertEquals("ga", instance.minCat("asdfg", "a"));
    }

}
