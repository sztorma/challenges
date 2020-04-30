package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Has271Test {

    public Has271Test() {
    }

    @Test
    public void testHas271() {
        System.out.println("has271");
        Has271 instance = new Has271();
        assertEquals(true, instance.has271(new int[]{1, 2, 7, 1}));
        assertEquals(false, instance.has271(new int[]{1, 2, 8, 1}));
        assertEquals(true, instance.has271(new int[]{2, 7, 1}));
        assertEquals(true, instance.has271(new int[]{2, 7, 1, 5}));
        assertEquals(true, instance.has271(new int[]{3, 8, 2}));
        assertEquals(true, instance.has271(new int[]{3, 8, 0}));
        assertEquals(true, instance.has271(new int[]{3, 8, 4}));
        assertEquals(false, instance.has271(new int[]{3}));
    }

}
