package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackTest {

    public BlackJackTest() {
    }

    @Test
    public void testBlackjack() {
        System.out.println("blackjack");
        BlackJack instance = new BlackJack();
        assertEquals(21, instance.blackjack(19, 21));
        assertEquals(21, instance.blackjack(21, 19));
        assertEquals(19, instance.blackjack(19, 22));
        assertEquals(19, instance.blackjack(22, 19));
        assertEquals(0, instance.blackjack(22, 22));
        assertEquals(21, instance.blackjack(21, 21));
    }

}
