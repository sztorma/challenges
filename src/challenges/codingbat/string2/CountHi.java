package challenges.codingbat.string2;

/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class CountHi {

    public int countHi(String str) {
        if (str == null || str.length() < 2) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                result++;
            }
        }
        return result;
    }

}
