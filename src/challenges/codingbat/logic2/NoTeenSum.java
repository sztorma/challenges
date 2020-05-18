package challenges.codingbat.logic2;

/*
Given 3 int values, a b c, return their sum. However, 
if any of the values is a teen -- in the range 13..19 inclusive -- 
then that value counts as 0, except 15 and 16 do not count as a teens. 
Write a separate helper "public int fixTeen(int n) 
{"that takes in an int value and returns that value fixed for the teen rule. 
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). 
Define the helper below and at the same indent level as the main noTeenSum().


noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
 */
public class NoTeenSum {

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private int fixTeen(int n) {
        if (13 <= n && n <= 14 || 17 <= n && n <= 19) {
            return 0;
        }
        return n;
    }
}