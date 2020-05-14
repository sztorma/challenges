package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnswerCellTest {

    public AnswerCellTest() {
    }

    @Test
    public void testAnswerCell() {
        System.out.println("answerCell");
        AnswerCell instance = new AnswerCell();
        assertEquals(true, instance.answerCell(false, false, false));
        assertEquals(false, instance.answerCell(false, false, true));
        assertEquals(false, instance.answerCell(true, false, false));
        assertEquals(true, instance.answerCell(false, true, false));
    }

}
