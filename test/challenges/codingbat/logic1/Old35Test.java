package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Old35Test {

    public Old35Test() {
    }

    @Test
    public void testOld35() {
        System.out.println("old35");
        Old35 instance = new Old35();
        assertEquals(true, instance.old35(3));
        assertEquals(true, instance.old35(10));
        assertEquals(false, instance.old35(15));
    }

}
