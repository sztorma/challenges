package challenges.codingbat.warmup2;

/*
Given an array of ints, we'll say that a triple is a value 
appearing 3 times in a row in the array. Return true 
if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
public class NoTriples {

    /**
     * with while cycle
     *
     * @param nums
     * @return
     */
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int index = 0;
        while (index < nums.length - 2 && !(nums[index] == nums[index + 1] && nums[index + 1] == nums[index + 2])) {
            index++;
        }
        return index == nums.length - 2;

    }

    /**
     * with for cycle
     *
     * @param nums
     * @return
     */
    public boolean noTriples2(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

}
