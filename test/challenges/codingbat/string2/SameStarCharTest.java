package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SameStarCharTest {

    private static SameStarChar instance;

    @BeforeClass
    public static void setup() {
        instance = new SameStarChar();
    }

    @Test
    public void testSameStarCharValidation() {
        assertEquals(true, instance.sameStarChar(""));
        assertEquals(true, instance.sameStarChar("b"));
        assertEquals(true, instance.sameStarChar("b*"));
        assertEquals(true, instance.sameStarChar(null));
    }

    @Test
    public void testSameStarCharTrueCases() {
        assertEquals(true, instance.sameStarChar("a*a"));
        assertEquals(true, instance.sameStarChar("abc*cccc"));
        assertEquals(true, instance.sameStarChar("aab*bbbb*bffff"));
    }

    @Test
    public void testSameStarCharFalseCases() {
        assertEquals(false, instance.sameStarChar("a*b"));
        assertEquals(false, instance.sameStarChar("a*b*b*bffff*f"));
        assertEquals(false, instance.sameStarChar("a*ab*b*bffff*t"));

    }
}
