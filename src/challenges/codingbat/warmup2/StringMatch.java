package challenges.codingbat.warmup2;

/*
Given 2 strings, a and b, return the number of the positions 
where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
public class StringMatch {

    public int stringMatch(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return 0;
        }
        int minLength = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < minLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
}
