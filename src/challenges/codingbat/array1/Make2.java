package challenges.codingbat.array1;

/*
Given 2 int arrays, a and b, return a new array length 2 containing, 
as much as will fit, the elements from a followed by the elements from b. 
The arrays may be any length, including 0, 
but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
public class Make2 {

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        //integer is immutable that is the way I can keep int from void
        count = iterate(count, a, result);
        iterate(count, b, result);
        return result;
    }

    private int iterate(int count, int[] arr, int[] result) {
        int i = 0;
        while (count < 2 && i < arr.length) {
            result[count] = arr[i];
            count++;
            i++;
        }
        return count;
    }
}
