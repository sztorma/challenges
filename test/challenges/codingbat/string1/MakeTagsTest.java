package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeTagsTest {

    public MakeTagsTest() {
    }

    @Test
    public void testMakeTags() {
        System.out.println("makeTags");
        MakeTags instance = new MakeTags();
        assertEquals("<i>Yay</i>", instance.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", instance.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", instance.makeTags("cite", "Yay"));
        assertEquals("<></>", instance.makeTags("", ""));
    }

}
