import java.util.Arrays;
import java.util.PriorityQueue;

public class PartitionEqualSubset {

    static public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        PriorityQueue<Integer> arr1 = new PriorityQueue<>();
        PriorityQueue<Integer> arr2 = new PriorityQueue<>();
        Arrays.sort(nums);
        int sum1 = 0;
        int sum2 = 0;
        int swapper;
        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                sum1 += nums[k];
                arr1.add(nums[k]);
            }else{
                sum2 += nums[k];
                arr2.add(nums[k]);
            }
        }
        while(sum1 != sum2){
            if(sum1 < sum2){
                swapper = arr2.remove();
                sum1 += swapper;
                arr1.add(swapper);
            }else{
                swapper = arr1.remove();
                sum2 += swapper;
                arr2.add(swapper);
            }
        }
        if(sum1 == sum2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 4, 5};
        System.out.println(canPartition(nums));
    }

}
