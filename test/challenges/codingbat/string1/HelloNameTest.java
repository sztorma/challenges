package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloNameTest {

    public HelloNameTest() {
    }

    @Test
    public void testHelloName() {
        System.out.println("helloName");
        HelloName instance = new HelloName();
        assertEquals("Hello Bob!", instance.helloName("Bob"));
        assertEquals("Hello Alice!", instance.helloName("Alice"));
        assertEquals("Hello X!", instance.helloName("X"));
        assertEquals("Hello !", instance.helloName(""));
    }

}
