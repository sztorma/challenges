package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeOutWordTest {

    public MakeOutWordTest() {
    }

    @Test
    public void testMakeOutWord() {
        System.out.println("makeOutWord");
        MakeOutWord instance = new MakeOutWord();
        assertEquals("<<Yay>>", instance.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", instance.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", instance.makeOutWord("[[]]", "word"));
        assertEquals("[[]]", instance.makeOutWord("[[]]", ""));

    }

}
