package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FirstHalfTest {

    public FirstHalfTest() {
    }

    @Test
    public void testFirstHalf() {
        System.out.println("firstHalf");
        FirstHalf instance = new FirstHalf();
        assertEquals("Woo", instance.firstHalf("WooHoo"));
        assertEquals("Hello", instance.firstHalf("HelloThere"));
        assertEquals("abc", instance.firstHalf("abcdef"));
        assertEquals("", instance.firstHalf(""));
    }

}
