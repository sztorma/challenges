package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Front22Test {

    @Test
    public void testFront22() {
        System.out.println("front22");
        Front22 instance = new Front22();
        assertEquals("kikittenki", instance.front22("kitten"));
        assertEquals("HaHaHa", instance.front22("Ha"));
        assertEquals("ababcab", instance.front22("abc"));
        assertEquals("kkk", instance.front22("k"));
        assertEquals("", instance.front22(""));
    }

}
