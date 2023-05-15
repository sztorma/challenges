package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZipZapTest {

    private static ZipZap instance;

    @BeforeClass
    public static void setup() {
        instance = new ZipZap();
    }

    @Test
    public void testZipZapExamples() {
        assertEquals("zpXzp", instance.zipZap("zipXzap"));
        assertEquals("zpzp", instance.zipZap("zopzop"));
        assertEquals("zzzpzp", instance.zipZap("zzzopzop"));

    }
}
