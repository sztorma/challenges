package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class OneTwoTest {

    private static OneTwo instance;

    @BeforeClass
    public static void setup() {
        instance = new OneTwo();
    }

    @Test
    public void testOneTwoExamples() {
        assertEquals("bca", instance.oneTwo("abc"));
        assertEquals("cat", instance.oneTwo("tca"));
        assertEquals("catdog", instance.oneTwo("tcagdo"));

    }

    @Test
    public void testOneTwoValidation() {
        assertEquals("", instance.oneTwo(null));
        assertEquals("", instance.oneTwo(""));
        assertEquals("", instance.oneTwo("b"));

    }

    @Test
    public void testOneTwoOneGroup() {
        assertEquals("lop", instance.oneTwo("plo"));
    }

    @Test
    public void testOneTwoMultipleClosedGroup() {
        assertEquals("tiktok", instance.oneTwo("ktikto"));
    }

    @Test
    public void testOneTwoMultipleUnclosedGroup() {
        assertEquals("tiktok", instance.oneTwo("ktiktof"));
        assertEquals("tiktok", instance.oneTwo("ktiktoff"));
    }

}
