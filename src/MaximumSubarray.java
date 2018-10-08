/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
 sum and return its sum.

        Example:

        Input: [-2,1,-3,4,-1,2,1,-5,4],
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
        Follow up:

        If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
         which is more subtle.

*/


public class MaximumSubarray {

    public static int maxSubArray(int[] A) {
        int[] arr = new int[A.length];
        arr[0] = A[0];
        int max = arr[0];

        for(int i = 1; i < A.length; i++){
            arr[i] = A[i] + (arr[i - 1] > 0 ? arr[i - 1] : 0);
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String args[]){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

}
