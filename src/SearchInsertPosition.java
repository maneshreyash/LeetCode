/*Given a sorted array and a target value, return the index if the target is found.
 If not, return the index where it would be if it were inserted in order.

        You may assume no duplicates in the array.

        Example 1:

        Input: [1,3,5,6], 5
        Output: 2
        Example 2:

        Input: [1,3,5,6], 2
        Output: 1
        Example 3:

        Input: [1,3,5,6], 7
        Output: 4
        Example 4:

        Input: [1,3,5,6], 0
        Output: 0*/





public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        if(nums[0] > target) {
            return 0;
        }
        else if(nums[nums.length-1] < target){
            return nums.length;
        }
        for(int j = 0; j < nums.length - 1; j++){
            if(nums[j] < target && nums[j+1] > target){
                return j+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 0));
    }
}
