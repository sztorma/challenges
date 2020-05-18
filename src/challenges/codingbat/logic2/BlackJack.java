package challenges.codingbat.logic2;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 
without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */
public class BlackJack {

    public int blackjack(int a, int b) {
        if (21 < a) {
            if (21 < b) {
                return 0;
            }
            return b;
        }
        if (21 < b) {
            return a;
        }
        return Math.max(a, b);
    }

}
