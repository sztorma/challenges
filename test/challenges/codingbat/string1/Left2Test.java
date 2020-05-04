package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Left2Test {

    public Left2Test() {
    }

    @Test
    public void testLeft2() {
        System.out.println("left2");
        Left2 instance = new Left2();
        assertEquals("lloHe", instance.left2("Hello"));
        assertEquals("vaja", instance.left2("java"));
        assertEquals("Hi", instance.left2("Hi"));
    }

}
