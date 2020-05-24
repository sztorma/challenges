package challenges.codingbat.string2;

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
public class CatDog {

    public boolean catDog(String str) {
        if (str == null || str.length() < 3) {
            return true;
        }
        int dog = 0;
        int cat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("dog")) {
                dog++;
            }
            if (sub.equals("cat")) {
                cat++;
            }
        }
        return cat == dog;
    }
}
