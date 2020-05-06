package challenges.codingbat.array1;

/*
Given an array of ints of odd length, 
look at the first, last, and middle values in the array and return the largest. 
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
public class MaxTriple {

    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        int last = nums.length - 1;
        int max = nums[0];
        if (max < nums[mid]) {
            max = nums[mid];
        }
        if (max < nums[last]) {
            max = nums[last];
        }
        return max;
    }
}
