package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShareDigitTest {

    public ShareDigitTest() {
    }

    @Test
    public void testShareDigit() {
        System.out.println("shareDigit");
        ShareDigit instance = new ShareDigit();
        assertEquals(true, instance.shareDigit(12, 23));
        assertEquals(false, instance.shareDigit(12, 43));
        assertEquals(false, instance.shareDigit(12, 44));
        assertEquals(true, instance.shareDigit(10, 31));
        assertEquals(true, instance.shareDigit(10, 13));
        assertEquals(true, instance.shareDigit(18, 18));
        assertEquals(true, instance.shareDigit(18, 81));
    }

}
