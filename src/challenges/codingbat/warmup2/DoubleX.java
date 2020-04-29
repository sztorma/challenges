package challenges.codingbat.warmup2;

/*
Given a string, return true if the first instance of "x" 
in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */
public class DoubleX {

    boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index == -1) {
            return false;
        }
        return str.substring(index).startsWith("xx");
    }

}
