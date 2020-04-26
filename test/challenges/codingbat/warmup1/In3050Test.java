package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class In3050Test {

    public In3050Test() {
    }

    @Test
    public void testSomeMethod() {
        In3050 instance = new In3050();
        assertEquals(true, instance.in3050(30, 31));
        assertEquals(false, instance.in3050(30, 41));
        assertEquals(true, instance.in3050(40, 50));
        assertEquals(true, instance.in3050(40, 30));
        assertEquals(true, instance.in3050(40, 40));
    }

}
