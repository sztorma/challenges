package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EndsLyTest {

    public EndsLyTest() {
    }

    @Test
    public void testEndsLy() {
        System.out.println("endsLy");
        EndsLy instance = new EndsLy();
        assertEquals(true, instance.endsLy("oddly"));
        assertEquals(false, instance.endsLy("y"));
        assertEquals(false, instance.endsLy("oddy"));
        assertEquals(false, instance.endsLy(""));
    }

}
