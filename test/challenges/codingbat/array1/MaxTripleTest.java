package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTripleTest {

    public MaxTripleTest() {
    }

    @Test
    public void testMaxTriple() {
        System.out.println("maxTriple");
        MaxTriple instance = new MaxTriple();
        assertEquals(3, instance.maxTriple(new int[]{1, 2, 3}));
        assertEquals(5, instance.maxTriple(new int[]{1, 5, 3}));
        assertEquals(5, instance.maxTriple(new int[]{5, 2, 3}));
        assertEquals(9, instance.maxTriple(new int[]{9}));
        assertEquals(9, instance.maxTriple(new int[]{9, 4, 9}));
        assertEquals(11, instance.maxTriple(new int[]{9, 4, 9, 10, 11}));
    }

}
