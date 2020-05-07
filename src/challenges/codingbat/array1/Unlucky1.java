package challenges.codingbat.array1;

/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
Return true if the given array contains an unlucky 1 in the first 2 
or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class Unlucky1 {

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        return oneThreeCheck(nums, 0) || oneThreeCheck(nums, 1) || oneThreeCheck(nums, nums.length - 2);
    }

    private boolean oneThreeCheck(int[] arr, int index) {
        return arr[index] == 1 && arr[index + 1] == 3;
    }
}
