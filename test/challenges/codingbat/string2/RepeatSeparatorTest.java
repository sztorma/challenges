package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepeatSeparatorTest {

    @Test
    public void testRepeatSeparator() {
        System.out.println("repeatSeparator");
        RepeatSeparator instance = new RepeatSeparator();
        assertEquals("WordXWordXWord", instance.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", instance.repeatSeparator("This", "And", 2));
        assertEquals("This", instance.repeatSeparator("This", "And", 1));
        assertEquals("", instance.repeatSeparator("This", "And", 0));

    }
}
