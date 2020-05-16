package challenges.codingbat.logic1;

/*
Given two ints, each in the range 10..99, 
return true if there is a digit that appears in both numbers, 
such as the 2 in 12 and 23. 
(Note: division, e.g. n/10, gives the left digit 
while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */
public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        int a1 = a % 10;
        int a10 = a / 10;
        int b1 = b % 10;
        int b10 = b / 10;
        return a1 == b1 || a1 == b10 || a10 == b1 || a10 == b10;
    }
}
