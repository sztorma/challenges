package challenges.codingbat.logic2;

/*
We want make a package of goal kilos of chocolate. 
We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, 
assuming we always use big bars before small bars. 
Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */
public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {
        int usedBigs = Math.min(goal / 5, big);
        int reqSmall = goal - usedBigs * 5;
        if (reqSmall > small) {
            return -1;
        }
        return reqSmall;
    }

}
