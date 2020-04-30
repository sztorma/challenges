package challenges.codingbat.warmup2;

/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {

    public String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }
        String result = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++) {
            char next = str.charAt(i);
            if (next != 'x') {
                result += next;
            }
        }
        result += str.substring(str.length() - 1);
        return result;
    }
}
