package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Unlucky1Test {

    public Unlucky1Test() {
    }

    @Test
    public void testUnlucky1() {
        System.out.println("unlucky1");
        Unlucky1 instance = new Unlucky1();
        assertEquals(true, instance.unlucky1(new int[]{1, 3, 4, 5}));
        assertEquals(true, instance.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertEquals(false, instance.unlucky1(new int[]{1, 1, 1}));
        assertEquals(true, instance.unlucky1(new int[]{1, 1, 1, 3}));
        assertEquals(false, instance.unlucky1(new int[]{1}));
        assertEquals(false, instance.unlucky1(new int[]{}));
    }

}
