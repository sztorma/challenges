package challenges.codingbat.array1;

/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
public class No23 {

    public boolean no23(int[] nums) {
        return !is2or3(nums[0]) && !is2or3(nums[1]);
    }

    private boolean is2or3(int num) {
        return num == 2 || num == 3;
    }
}
