package challenges.codingbat.warmup2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, 
followed by the value plus 5, followed by the value minus 1. 
Additionally the 271 counts even if the "1" differs by 2 or less 
from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
public class Has271 {

    public boolean has271(int[] nums) {
        int i = 0;
        if (nums.length < 3) {
            return false;
        }
        while (i < nums.length - 2
                && !(nums[i + 1] == nums[i] + 5
                && lessByOneAbsDifferTwo(nums, i))) {
            i++;
        }
        return i != nums.length - 2;
    }

    private boolean lessByOneAbsDifferTwo(int[] nums, int index) {
        int should = nums[index] - 1;
        int real = nums[index + 2];
        return Math.abs(should - real) <= 2;
    }

}
