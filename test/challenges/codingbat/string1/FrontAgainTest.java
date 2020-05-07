package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FrontAgainTest {

    public FrontAgainTest() {
    }

    @Test
    public void testFrontAgain() {
        System.out.println("frontAgain");
        FrontAgain instance = new FrontAgain();
        assertEquals(true, instance.frontAgain("edited"));
        assertEquals(false, instance.frontAgain("edit"));
        assertEquals(true, instance.frontAgain("ed"));
        assertEquals(true, instance.frontAgain("yyy"));
        assertEquals(false, instance.frontAgain(""));
        assertEquals(false, instance.frontAgain("f"));
    }

}
