package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Right2Test {

    public Right2Test() {
    }

    @Test
    public void testRight2() {
        System.out.println("right2");
        Right2 instance = new Right2();
        assertEquals("loHel", instance.right2("Hello"));
        assertEquals("vaja", instance.right2("java"));
        assertEquals("Hi", instance.right2("Hi"));
    }

}
