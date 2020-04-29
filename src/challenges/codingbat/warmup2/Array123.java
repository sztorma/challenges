package challenges.codingbat.warmup2;

/*
Given an array of ints, 
return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123 {

    public boolean array123(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int index = 0;
        while (index < nums.length - 2 && !(nums[index] == 1 && nums[index + 1] == 2 && nums[index + 2] == 3)) {
            index++;
        }
        return index != nums.length - 2;
    }
}
