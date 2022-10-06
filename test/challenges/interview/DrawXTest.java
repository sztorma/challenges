package challenges.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DrawXTest {

    private DrawX drawX = new DrawX();

    @Test
    public void testDrawX() {
        String result = drawX.drawX(2);

        String expected = "\\  /\n" +
                " \\/ \n" +
                " /\\ \n" +
                "/  \\";

        assertEquals(expected, result);

    }

    @Test
    public void testDrawX1() {
        String result = drawX.drawX(1);

        String expected = "\\/\n" +
                "/\\";

        assertEquals(expected, result);

    }
}
